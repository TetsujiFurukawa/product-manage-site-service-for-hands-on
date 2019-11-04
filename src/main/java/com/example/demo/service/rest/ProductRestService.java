package com.example.demo.service.rest;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.entity.domain.ProductMst;
import com.example.demo.entity.domain.ProductMstStockMst;
import com.example.demo.entity.dto.ProductDto;
import com.example.demo.entity.dto.request.PagenatorRequestDto;
import com.example.demo.entity.dto.request.ProductListRequestDto;
import com.example.demo.entity.dto.response.ProductSearchListResponseDto;
import com.example.demo.entity.dto.response.ProductSearchResponseDto;
import com.example.demo.exception.DataNotFoundException;
import com.example.demo.service.ProductService;
import com.example.demo.utility.PagenatorUtility;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductRestService extends BaseRestService {

	private final ProductService productService;

	public ProductSearchListResponseDto getProductList(
			ProductListRequestDto productListRequestDto, PagenatorRequestDto pagenatorRequestDto) {

		ProductMst searchEntity = CreateRequestEntity(productListRequestDto);

		Long productMstStockMstCount = productService.countProductMstStockMst(searchEntity);

		PagenatorUtility.recalculatePageIndex(pagenatorRequestDto, productMstStockMstCount);

		List<ProductMstStockMst> productMstStockMst = productService.selectProductMstStockMst(searchEntity,
				pagenatorRequestDto.getPageSize(),
				PagenatorUtility.calcOffset(pagenatorRequestDto.getPageSize(), pagenatorRequestDto.getPageIndex()));

		return createResponseDto(productMstStockMst, pagenatorRequestDto, productMstStockMstCount);

	}

	protected ProductMst CreateRequestEntity(ProductListRequestDto productListRequestDto) {

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

	protected ProductSearchListResponseDto createResponseDto(List<ProductMstStockMst> productMstStockMst,
			PagenatorRequestDto pagenatorRequestDto, Long productMstStockMstCount) {

		ProductSearchListResponseDto productListResponseDto = new ProductSearchListResponseDto();

		productListResponseDto.setPageIndex(pagenatorRequestDto.getPageIndex());
		productListResponseDto.setResultsLength(productMstStockMstCount);

		List<ProductSearchResponseDto> productResponseDtos = productMstStockMst.stream()
				.map(p -> {

					ProductSearchResponseDto productResponseDto = new ProductSearchResponseDto();
					productResponseDto.setProductCode(p.getProductCode());
					productResponseDto.setProductName(p.getProductName());
					productResponseDto.setProductGenre(p.getProductGenre());
					productResponseDto.setProductSizeStandard(p.getProductSizeStandard());
					productResponseDto.setProductColor(p.getProductColor());
					productResponseDto.setProductUnitPrice(p.getProductUnitPrice());
					productResponseDto.setProductStockQuantity(p.getProductStockQuantity());
					productResponseDto.setEndOfSale(p.getEndOfSale());
					// TODO
					productResponseDto.setProductImageUrl("http://localhost:8080/api/downloadFile/queen.jpg");

					return productResponseDto;

				}).collect(Collectors.toList());

		productListResponseDto.setProductResponseDtos(productResponseDtos);

		return productListResponseDto;

	}

	public ProductDto getByCode(String productCode) {

		List<ProductMst> productMstList = productService.getProductListByCode(productCode);

		if (productMstList.size() != 1) {
			throw new DataNotFoundException("Data not found.");
		}

		return productMstList.stream().map(p -> {

			ProductDto productDto = new ProductDto();
			productDto.setProductSeq(p.getProductSeq());
			productDto.setProductCode(p.getProductCode());
			productDto.setProductName(p.getProductName());
			productDto.setProductGenre(p.getProductGenre());
			productDto.setProductSizeStandard(p.getProductSizeStandard());
			productDto.setProductColor(p.getProductColor());
			productDto.setProductUnitPrice(p.getProductUnitPrice());
			productDto.setEndOfSale(p.getEndOfSale());

			return productDto;

		}).collect(Collectors.toList()).get(0);
	}

	public ProductDto create(ProductDto productDto) {

		ProductMst productMst = createEntity(productDto);
		productMst = productService.create(productMst);

		return createDto(productMst);

	}

	public ProductDto update(ProductDto productDto) {

		ProductMst productMst = createEntity(productDto);
		productMst = productService.update(productMst);

		return createDto(productMst);

	}

	private ProductMst createEntity(ProductDto productDto) {
		ProductMst productMst = new ProductMst();
		productMst.setProductSeq(productDto.getProductSeq());
		productMst.setProductCode(productDto.getProductColor());
		productMst.setProductName(productDto.getProductName());
		productMst.setProductGenre(productDto.getProductGenre());
		productMst.setProductColor(productDto.getProductColor());
		productMst.setProductSizeStandard(productDto.getProductSizeStandard());
		productMst.setProductUnitPrice(productDto.getProductUnitPrice());
		productMst.setEndOfSale(productDto.getEndOfSale());
		productMst.setEndOfSaleDate(productDto.getEndOfSaleDate());
		productMst.setEnterDate(productDto.getEnterDate());
		productMst.setEnterUser(productDto.getEnterUser());

		//TODO 削除予定
		productMst.setDeleted(false);

		return productMst;
	}

	private ProductDto createDto(ProductMst productMst) {
		ProductDto productDto = new ProductDto();
		productDto.setProductSeq(productMst.getProductSeq());
		productDto.setProductName(productMst.getProductName());
		productDto.setProductCode(productMst.getProductCode());
		productDto.setProductGenre(productMst.getProductGenre());
		productDto.setProductSizeStandard(productMst.getProductSizeStandard());
		productDto.setProductColor(productMst.getProductColor());
		productDto.setProductUnitPrice(productMst.getProductUnitPrice());
		productDto.setEndOfSale(productMst.getEndOfSale());
		productDto.setEndOfSaleDate(productMst.getEndOfSaleDate());
		productDto.setEnterDate(productMst.getEnterDate());
		productDto.setEnterUser(productMst.getEnterUser());
		productDto.setUpdateDate(productMst.getUpdateDate());
		productDto.setUpdateUser(productMst.getUpdateUser());

		//		private String productImage;

		return productDto;
	}

}
