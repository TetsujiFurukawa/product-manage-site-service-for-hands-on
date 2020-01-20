package com.example.demo.service.rest;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.entity.domain.ProductMst;
import com.example.demo.entity.domain.ProductMstProductPurchaseTbl;
import com.example.demo.entity.domain.ProductPurchaseTbl;
import com.example.demo.entity.domain.ProductStockMst;
import com.example.demo.entity.dto.request.PagenatorRequestDto;
import com.example.demo.entity.dto.request.ProductPurchaseHistoryRequestDto;
import com.example.demo.entity.dto.request.ProductPurchaseRequestDto;
import com.example.demo.entity.dto.response.ProductPurchaseHistorySearchListResponseDto;
import com.example.demo.entity.dto.response.ProductPurchaseHistorySearchResponseDto;
import com.example.demo.entity.dto.response.ProductPurchaseResponseDto;
import com.example.demo.exception.DataNotFoundException;
import com.example.demo.exception.ExclusiveProcessingException;
import com.example.demo.exception.OutOfStockException;
import com.example.demo.properties.ProductImageProperties;
import com.example.demo.service.ProductPurchaseService;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductStockService;
import com.example.demo.utility.PagenatorUtility;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductPurchaseRestService extends BaseRestService {

	private final ProductService productService;

	private final ProductPurchaseService productPurchaseService;

	private final ProductStockService productStockService;

	private final ProductImageProperties productImageProperties;

	public ProductPurchaseHistorySearchListResponseDto getProductPurchaseHistoryList(
			ProductPurchaseHistoryRequestDto productPurchaseHistoryRequestDto,
			PagenatorRequestDto pagenatorRequestDto) {

		ProductMstProductPurchaseTbl searchEntity = createSearchRequestEntity(productPurchaseHistoryRequestDto);

		Long productMstProductPurchaseTblCount = productPurchaseService.countProductMstProductPurchaseTbl(searchEntity);

		PagenatorUtility.recalculatePageIndex(pagenatorRequestDto, productMstProductPurchaseTblCount);

		List<ProductMstProductPurchaseTbl> productMstProductPurchaseTbl = productPurchaseService
				.selectProductMstProductPurchaseTbl(searchEntity,
						pagenatorRequestDto.getPageSize(),
						PagenatorUtility.calcOffset(pagenatorRequestDto.getPageSize(),
								pagenatorRequestDto.getPageIndex()));

		return createSearchResponseDto(productMstProductPurchaseTbl, pagenatorRequestDto,
				productMstProductPurchaseTblCount);

	}

	public ProductPurchaseResponseDto getProductPurchaseByCode(String productCode) throws IOException {

		ProductMst productMst = getProductMstByCode(productCode);

		ProductStockMst productStockMst = getProductStockMst(productMst.getProductSeq());

		return createPurchaseResponseDto(productMst, productStockMst);

	}

	public ProductPurchaseResponseDto insertProductPurchase(ProductPurchaseRequestDto productPurchaseRequestDto)
			throws IOException {

		ProductMst productMst = getProductMstByCode(productPurchaseRequestDto.getProductCode());
		ProductStockMst productStockMst = getProductStockMst(productMst.getProductSeq());

		validateStockQuantity(productStockMst, productPurchaseRequestDto);

		ProductPurchaseTbl productPurchaseTblEntity = createProductPurchaseTblEntiry(productMst,
				productPurchaseRequestDto);
		productPurchaseService.insertPurchase(productPurchaseTblEntity);

		ProductStockMst updProductStockMst = createProductStockMst(productStockMst, productPurchaseRequestDto);
		productStockService.updateStock(updProductStockMst);

		return getProductPurchaseByCode(productPurchaseRequestDto.getProductCode());

	}

	// --------------------------------------------------------------------------------
	// private methods
	// --------------------------------------------------------------------------------
	private ProductMstProductPurchaseTbl createSearchRequestEntity(
			ProductPurchaseHistoryRequestDto productPurchaseHistoryRequestDto) {

		ProductMstProductPurchaseTbl searchProductMstProductPurchaseTbl = new ProductMstProductPurchaseTbl();
		searchProductMstProductPurchaseTbl
				.setProductPurchaseName(productPurchaseHistoryRequestDto.getProductPurchaseName());

		if (Objects.nonNull(productPurchaseHistoryRequestDto.getProductPurchaseDateFrom())) {
			searchProductMstProductPurchaseTbl
					.setProductPurchaseDateFrom(LocalDateTime.ofInstant(
							productPurchaseHistoryRequestDto.getProductPurchaseDateFrom().toInstant(),
							ZoneOffset.UTC));
		}

		if (Objects.nonNull(productPurchaseHistoryRequestDto.getProductPurchaseDateTo())) {
			searchProductMstProductPurchaseTbl
					.setProductPurchaseDateTo(LocalDateTime.ofInstant(
							productPurchaseHistoryRequestDto.getProductPurchaseDateTo().toInstant(),
							ZoneOffset.UTC));
		}

		searchProductMstProductPurchaseTbl.setProductCode(productPurchaseHistoryRequestDto.getProductCode());
		searchProductMstProductPurchaseTbl.setProductName(productPurchaseHistoryRequestDto.getProductName());

		return searchProductMstProductPurchaseTbl;

	}

	private ProductPurchaseHistorySearchListResponseDto createSearchResponseDto(
			List<ProductMstProductPurchaseTbl> productMstProductPurchaseTbls,
			PagenatorRequestDto pagenatorRequestDto, Long productMstStockMstCount) {

		ProductPurchaseHistorySearchListResponseDto productPurchaseHistorySearchListResponseDto = new ProductPurchaseHistorySearchListResponseDto();

		productPurchaseHistorySearchListResponseDto.setPageIndex(pagenatorRequestDto.getPageIndex());
		productPurchaseHistorySearchListResponseDto.setResultsLength(productMstStockMstCount);

		List<ProductPurchaseHistorySearchResponseDto> productPurchaseHistorySearchResponseDtos = productMstProductPurchaseTbls
				.stream()
				.map(p -> {

					ProductPurchaseHistorySearchResponseDto productPurchaseHistorySearchResponseDto = new ProductPurchaseHistorySearchResponseDto();
					productPurchaseHistorySearchResponseDto.setNo(p.getRowNo());
					productPurchaseHistorySearchResponseDto.setProductName(p.getProductName());
					productPurchaseHistorySearchResponseDto.setProductCode(p.getProductCode());
					productPurchaseHistorySearchResponseDto.setProductPurchaseName(p.getProductPurchaseName());
					productPurchaseHistorySearchResponseDto
							.setProductPurchaseDate(p.getProductPurchaseDate().atZone(ZoneOffset.UTC));
					productPurchaseHistorySearchResponseDto
							.setProductPurchaseUnitPrice(p.getProductPurchaseUnitPrice());
					productPurchaseHistorySearchResponseDto.setProductPurchaseQuantity(p.getProductPurchaseQuantity());
					productPurchaseHistorySearchResponseDto.setProductPurchaseAmount(p.getProductPurchaseAmount());
					if (productService.productImageExist(p.getProductCode())) {
						productPurchaseHistorySearchResponseDto.setProductImageUrl(productImageProperties.getPublicUrl()
								+ p.getProductCode() + productImageProperties.getDefaultExtension());
					}

					return productPurchaseHistorySearchResponseDto;

				}).collect(Collectors.toList());

		productPurchaseHistorySearchListResponseDto
				.setProductPurchaseHistorySearchResponseDtos(productPurchaseHistorySearchResponseDtos);

		return productPurchaseHistorySearchListResponseDto;

	}

	private ProductMst getProductMstByCode(String productCode) {
		List<ProductMst> productMstList = productService.getProductListByCode(productCode);

		if (productMstList.size() != 1) {
			throw new DataNotFoundException();
		}

		ProductMst productMst = productMstList.get(0);
		return productMst;

	}

	private ProductStockMst getProductStockMst(Long productSeq) {
		List<ProductStockMst> productStockMstList = productStockService.getProductStockMst(productSeq);

		if (productStockMstList.size() != 1) {
			throw new DataNotFoundException();
		}

		ProductStockMst productStockMst = productStockMstList.get(0);
		return productStockMst;

	}

	private ProductPurchaseResponseDto createPurchaseResponseDto(ProductMst productMst, ProductStockMst productStockMst)
			throws IOException {
		ProductPurchaseResponseDto productPurchaseResponseDto = new ProductPurchaseResponseDto();

		productPurchaseResponseDto.setProductCode(productMst.getProductCode());
		productPurchaseResponseDto.setProductName(productMst.getProductName());
		productPurchaseResponseDto.setProductGenre(productMst.getProductGenre());
		productPurchaseResponseDto.setProductImage(productService.readProductImage(productMst.getProductCode()));
		productPurchaseResponseDto.setProductSizeStandard(productMst.getProductSizeStandard());
		productPurchaseResponseDto.setProductColor(productMst.getProductColor());
		productPurchaseResponseDto.setProductPurchaseUnitPrice(productMst.getProductUnitPrice());
		productPurchaseResponseDto.setProductStockQuantity(productStockMst.getProductStockQuantity());

		return productPurchaseResponseDto;

	}

	private void validateStockQuantity(ProductStockMst productStockMst,
			ProductPurchaseRequestDto productPurchaseRequestDto) {

		if (!productStockMst.getProductStockQuantity().equals(productPurchaseRequestDto.getProductStockQuantity())) {
			throw new ExclusiveProcessingException();
		}

		int updatedStockQuantity = productStockMst.getProductStockQuantity()
				- productPurchaseRequestDto.getProductPurchaseQuantity();
		if (updatedStockQuantity < 0) {
			throw new OutOfStockException();
		}

	}

	private ProductPurchaseTbl createProductPurchaseTblEntiry(ProductMst productMst,
			ProductPurchaseRequestDto purchaseRequestDto) {

		ProductPurchaseTbl productPurchaseTbl = new ProductPurchaseTbl();

		productPurchaseTbl.setProductSeq(productMst.getProductSeq());
		productPurchaseTbl.setProductPurchaseDate(LocalDateTime.now(ZoneOffset.UTC));
		productPurchaseTbl.setProductPurchaseName(purchaseRequestDto.getProductPurchaseName());
		productPurchaseTbl.setProductPurchaseUnitPrice(productMst.getProductUnitPrice());
		productPurchaseTbl.setProductPurchaseQuantity(purchaseRequestDto.getProductPurchaseQuantity());

		BigDecimal productPurchaseAmount = BigDecimal
				.valueOf(productMst.getProductUnitPrice() * purchaseRequestDto.getProductPurchaseQuantity());

		productPurchaseTbl.setProductPurchaseAmount(productPurchaseAmount.intValue());

		return productPurchaseTbl;

	}

	private ProductStockMst createProductStockMst(ProductStockMst productStockMst,
			ProductPurchaseRequestDto productPurchaseRequestDto) {

		ProductStockMst updProductStockMst = new ProductStockMst();
		updProductStockMst.setProductStockSeq(productStockMst.getProductStockSeq());
		updProductStockMst.setProductStockQuantity(
				productStockMst.getProductStockQuantity() - productPurchaseRequestDto.getProductPurchaseQuantity());

		return updProductStockMst;
	}

}
