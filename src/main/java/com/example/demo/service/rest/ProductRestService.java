package com.example.demo.service.rest;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import com.example.demo.entity.domain.ProductMst;
import com.example.demo.entity.domain.ProductMstStockMst;
import com.example.demo.entity.domain.ProductStockMst;
import com.example.demo.entity.dto.ProductDto;
import com.example.demo.entity.dto.request.PagenatorRequestDto;
import com.example.demo.entity.dto.request.ProductListRequestDto;
import com.example.demo.entity.dto.response.ProductSearchListResponseDto;
import com.example.demo.entity.dto.response.ProductSearchResponseDto;
import com.example.demo.exception.DataNotFoundException;
import com.example.demo.exception.ExclusiveProcessingException;
import com.example.demo.properties.ProductImageProperties;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductStockService;
import com.example.demo.utility.PagenatorUtility;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductRestService extends BaseRestService {

	private final ProductService productService;

	private final ProductStockService productStockService;

	private final ProductImageProperties productImageProperties;

	public ProductSearchListResponseDto getProductList(
			ProductListRequestDto productListRequestDto, PagenatorRequestDto pagenatorRequestDto) {

		ProductMst searchEntity = createSearchRequestEntity(productListRequestDto);

		Long productMstStockMstCount = productService.countProductMstStockMst(searchEntity);

		PagenatorUtility.recalculatePageIndex(pagenatorRequestDto, productMstStockMstCount);

		List<ProductMstStockMst> productMstStockMst = productService.selectProductMstStockMst(searchEntity,
				pagenatorRequestDto.getPageSize(),
				PagenatorUtility.calcOffset(pagenatorRequestDto.getPageSize(), pagenatorRequestDto.getPageIndex()));

		return createSearchResponseDto(productMstStockMst, pagenatorRequestDto, productMstStockMstCount);

	}

	public ProductDto getByCode(String productCode) throws IOException {

		ProductMst productMst = getProductMstByCode(productCode);

		return createProductDto(productMst);

	}

	public ProductDto insertProduct(ProductDto productDto) throws IOException {

		List<ProductMst> productMstList = productService.getProductListByCode(productDto.getProductCode());

		if (productMstList.size() > 0) {
			throw new DuplicateKeyException("Duplicated key.");
		}

		// Writes product image file.
		if (productDto.getProductImage() == null) {
			productService.deleteProductImage(productDto.getProductCode());
		} else {
			productService.writeProductImage(productDto.getProductCode(), productDto.getProductImage());
		}

		// Inserts product master.
		ProductMst productMst = createProductMstEntity(productDto);
		productMst = productService.insertProduct(productMst);

		productStockService.insertProductStock(createProductStockMstEntity(productMst));

		return createProductDto(productMst);

	}

	private ProductStockMst createProductStockMstEntity(ProductMst productMst) {
		ProductStockMst productStockMst = new ProductStockMst();
		productStockMst.setProductSeq(productMst.getProductSeq());
		productStockMst.setProductStockQuantity(0);

		return productStockMst;
	}

	public ProductDto updateProduct(ProductDto productDto) throws IOException {

		// Lock target productMst for updates at first.
		ProductMst productMst = selectForUpdateProductMstByCode(productDto);

		// Checks for updates by others.
		validateExclusive(productDto, productMst);

		// Re-acquires enterUser,enterDate from the original productMst.
		setupEnterInformations(productDto, productMst);

		// Writes product image file.
		if (productDto.getProductImage() == null) {
			productService.deleteProductImage(productDto.getProductCode());
		} else {
			productService.writeProductImage(productDto.getProductCode(), productDto.getProductImage());
		}

		// Updates product master.
		ProductMst updateProductMst = createProductMstEntity(productDto);
		updateProductMst = productService.updateProduct(updateProductMst);

		return createProductDto(updateProductMst);

	}

	private ProductMst selectForUpdateProductMstByCode(ProductDto productDto) {

		ProductMst productMst = new ProductMst();
		productMst.setProductCode(productDto.getProductCode());

		return productMst = productService.selectForUpdateProductMstByCode(productMst);

	}

	private void validateExclusive(ProductDto productDto, ProductMst productMst) {

		if (!productDto.getUpdateDate().equals(productMst.getUpdateDate())) {
			throw new ExclusiveProcessingException();
		}

	}

	private void setupEnterInformations(ProductDto productDto, ProductMst productMst) {

		productDto.setEnterUser(productMst.getEnterUser());
		productDto.setEnterDate(productMst.getEnterDate());

	}

	private ProductMst getProductMstByCode(String productCode) {
		List<ProductMst> productMstList = productService.getProductListByCode(productCode);

		if (productMstList.size() != 1) {
			throw new DataNotFoundException();
		}

		ProductMst productMst = productMstList.get(0);
		return productMst;

	}

	private ProductMst createSearchRequestEntity(ProductListRequestDto productListRequestDto) {

		ProductMst searchProductMst = new ProductMst();
		searchProductMst.setProductCode(productListRequestDto.getProductCode());
		searchProductMst.setProductName(productListRequestDto.getProductName());
		searchProductMst.setProductGenre(productListRequestDto.getProductGenre());

		// Sets to search condition only when end of sale equals false.
		if (!productListRequestDto.getEndOfSale()) {
			searchProductMst.setEndOfSale(productListRequestDto.getEndOfSale());
		}

		return searchProductMst;

	}

	private ProductSearchListResponseDto createSearchResponseDto(List<ProductMstStockMst> productMstStockMst,
			PagenatorRequestDto pagenatorRequestDto, Long productMstStockMstCount) {

		ProductSearchListResponseDto productSearchListResponseDto = new ProductSearchListResponseDto();

		productSearchListResponseDto.setPageIndex(pagenatorRequestDto.getPageIndex());
		productSearchListResponseDto.setResultsLength(productMstStockMstCount);

		long no = pagenatorRequestDto.getPageIndex() * pagenatorRequestDto.getPageSize();
		List<ProductSearchResponseDto> productSearchResponseDtos = productMstStockMst.stream()
				.map(p -> {

					ProductSearchResponseDto productSearchResponseDto = new ProductSearchResponseDto();
					productSearchResponseDto.setNo(p.getRowNo() + no);
					productSearchResponseDto.setProductCode(p.getProductCode());
					productSearchResponseDto.setProductName(p.getProductName());
					productSearchResponseDto.setProductGenre(p.getProductGenre());
					productSearchResponseDto.setProductSizeStandard(p.getProductSizeStandard());
					productSearchResponseDto.setProductColor(p.getProductColor());
					productSearchResponseDto.setProductUnitPrice(p.getProductUnitPrice());
					productSearchResponseDto.setProductStockQuantity(p.getProductStockQuantity());
					productSearchResponseDto.setEndOfSale(p.getEndOfSale());
					if (productService.productImageExist(p.getProductCode())) {
						productSearchResponseDto.setProductImageUrl(productImageProperties.getPublicUrl()
								+ p.getProductCode() + productImageProperties.getDefaultExtension());
					}

					return productSearchResponseDto;

				}).collect(Collectors.toList());

		productSearchListResponseDto.setProductSearchResponseDtos(productSearchResponseDtos);

		return productSearchListResponseDto;

	}

	private ProductMst createProductMstEntity(ProductDto productDto) {
		ProductMst productMst = new ProductMst();
		productMst.setProductSeq(productDto.getProductSeq());
		productMst.setProductCode(productDto.getProductCode());
		productMst.setProductName(productDto.getProductName());
		productMst.setProductGenre(productDto.getProductGenre());
		productMst.setProductColor(productDto.getProductColor());
		productMst.setProductSizeStandard(productDto.getProductSizeStandard());
		productMst.setProductUnitPrice(productDto.getProductUnitPrice());
		productMst.setEndOfSale(productDto.getEndOfSale());
		productMst.setEndOfSaleDate(productDto.getEndOfSaleDate());
		productMst.setEnterDate(productDto.getEnterDate());
		productMst.setEnterUser(productDto.getEnterUser());

		return productMst;

	}

	private ProductDto createProductDto(ProductMst productMst) throws IOException {
		ProductDto productDto = new ProductDto();
		productDto.setProductSeq(productMst.getProductSeq());
		productDto.setProductName(productMst.getProductName());
		productDto.setProductCode(productMst.getProductCode());
		productDto.setProductGenre(productMst.getProductGenre());
		productDto.setProductImage(productService.readProductImage(productMst.getProductCode()));
		productDto.setProductSizeStandard(productMst.getProductSizeStandard());
		productDto.setProductColor(productMst.getProductColor());
		productDto.setProductUnitPrice(productMst.getProductUnitPrice());
		productDto.setEndOfSale(productMst.getEndOfSale());
		productDto.setEndOfSaleDate(productMst.getEndOfSaleDate());
		productDto.setEnterDate(productMst.getEnterDate());
		productDto.setEnterUser(productMst.getEnterUser());
		productDto.setUpdateDate(productMst.getUpdateDate());
		productDto.setUpdateUser(productMst.getUpdateUser());

		return productDto;

	}

}
