package com.example.demo.service.rest;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.entity.domain.ProductMst;
import com.example.demo.entity.domain.ProductMstProductPurchaseTbl;
import com.example.demo.entity.domain.ProductPurchaseTbl;
import com.example.demo.entity.domain.ProductStockMst;
import com.example.demo.entity.dto.request.PagenatorRequestDto;
import com.example.demo.entity.dto.request.PurchaseHistoryRequestDto;
import com.example.demo.entity.dto.request.PurchaseRequestDto;
import com.example.demo.entity.dto.response.PurchaseHistorySearchListResponseDto;
import com.example.demo.entity.dto.response.PurchaseHistorySearchResponseDto;
import com.example.demo.entity.dto.response.PurchaseResponseDto;
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
public class PurchaseRestService extends BaseRestService {

	private final ProductService productService;

	private final ProductPurchaseService productPurchaseService;

	private final ProductStockService productStockService;

	private final ProductImageProperties productImageProperties;

	public PurchaseHistorySearchListResponseDto getPurchaseHistoryList(
			PurchaseHistoryRequestDto purchaseHistoryRequestDto, PagenatorRequestDto pagenatorRequestDto) {

		ProductMstProductPurchaseTbl searchEntity = createSearchRequestEntity(purchaseHistoryRequestDto);

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

	public PurchaseResponseDto getByCode(String productCode) throws IOException {

		ProductMst productMst = getProductMstByCode(productCode);

		ProductStockMst productStockMst = getProductStockMst(productMst.getProductSeq());

		return createPurchaseResponseDto(productMst, productStockMst);

	}

	public PurchaseResponseDto insertPurchase(PurchaseRequestDto purchaseRequestDto) throws IOException {

		ProductMst productMst = getProductMstByCode(purchaseRequestDto.getProductCode());
		ProductStockMst productStockMst = getProductStockMst(productMst.getProductSeq());

		validateStockQuantity(productStockMst, purchaseRequestDto);

		ProductPurchaseTbl productPurchaseTblEntity = createProductPurchaseTblEntiry(productMst, purchaseRequestDto);
		productPurchaseService.insertPurchase(productPurchaseTblEntity);

		ProductStockMst updProductStockMst = createProductStockMst(productStockMst, purchaseRequestDto);
		productStockService.updateStock(updProductStockMst);

		return getByCode(purchaseRequestDto.getProductCode());

	}

	// --------------------------------------------------------------------------------
	// private methods
	// --------------------------------------------------------------------------------
	private ProductMstProductPurchaseTbl createSearchRequestEntity(
			PurchaseHistoryRequestDto purchaseHistoryRequestDto) {

		ProductMstProductPurchaseTbl searchProductMstProductPurchaseTbl = new ProductMstProductPurchaseTbl();
		searchProductMstProductPurchaseTbl.setProductPurchaseName(purchaseHistoryRequestDto.getProductPurchaseName());
		searchProductMstProductPurchaseTbl
				.setProductPurchaseDateFrom(purchaseHistoryRequestDto.getProductPurchaseDateFrom());
		searchProductMstProductPurchaseTbl
				.setProductPurchaseDateTo(purchaseHistoryRequestDto.getProductPurchaseDateTo());
		searchProductMstProductPurchaseTbl.setProductCode(purchaseHistoryRequestDto.getProductCode());
		searchProductMstProductPurchaseTbl.setProductName(purchaseHistoryRequestDto.getProductName());

		return searchProductMstProductPurchaseTbl;

	}

	private PurchaseHistorySearchListResponseDto createSearchResponseDto(
			List<ProductMstProductPurchaseTbl> productMstProductPurchaseTbl,
			PagenatorRequestDto pagenatorRequestDto, Long productMstStockMstCount) {

		PurchaseHistorySearchListResponseDto purchaseHistorySearchListResponseDto = new PurchaseHistorySearchListResponseDto();

		purchaseHistorySearchListResponseDto.setPageIndex(pagenatorRequestDto.getPageIndex());
		purchaseHistorySearchListResponseDto.setResultsLength(productMstStockMstCount);

		long no = pagenatorRequestDto.getPageIndex() * pagenatorRequestDto.getPageSize();
		List<PurchaseHistorySearchResponseDto> purchaseHistorySearchResponseDtos = productMstProductPurchaseTbl.stream()
				.map(p -> {

					PurchaseHistorySearchResponseDto purchaseHistorySearchResponseDto = new PurchaseHistorySearchResponseDto();
					purchaseHistorySearchResponseDto.setNo(p.getRowNo() + no);
					purchaseHistorySearchResponseDto.setProductName(p.getProductName());
					purchaseHistorySearchResponseDto.setProductCode(p.getProductCode());
					purchaseHistorySearchResponseDto.setProductPurchaseName(p.getProductPurchaseName());
					purchaseHistorySearchResponseDto.setProductPurchaseDate(p.getProductPurchaseDate());
					purchaseHistorySearchResponseDto.setProductPurchaseUnitPrice(p.getProductPurchaseUnitPrice());
					purchaseHistorySearchResponseDto.setProductPurchaseQuantity(p.getProductPurchaseQuantity());
					purchaseHistorySearchResponseDto.setProductPurchaseAmount(p.getProductPurchaseAmount());
					if (productService.productImageExist(p.getProductCode())) {
						purchaseHistorySearchResponseDto.setProductImageUrl(productImageProperties.getPublicUrl()
								+ p.getProductCode() + productImageProperties.getDefaultExtension());
					}

					return purchaseHistorySearchResponseDto;

				}).collect(Collectors.toList());

		purchaseHistorySearchListResponseDto.setPurchaseHistorySearchResponseDtos(purchaseHistorySearchResponseDtos);

		return purchaseHistorySearchListResponseDto;

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

	private PurchaseResponseDto createPurchaseResponseDto(ProductMst productMst, ProductStockMst productStockMst)
			throws IOException {
		PurchaseResponseDto purchaseResponseDto = new PurchaseResponseDto();

		purchaseResponseDto.setProductCode(productMst.getProductCode());
		purchaseResponseDto.setProductName(productMst.getProductName());
		purchaseResponseDto.setProductGenre(productMst.getProductGenre());
		purchaseResponseDto.setProductImage(productService.readProductImage(productMst.getProductCode()));
		purchaseResponseDto.setProductSizeStandard(productMst.getProductSizeStandard());
		purchaseResponseDto.setProductColor(productMst.getProductColor());
		purchaseResponseDto.setProductPurchaseUnitPrice(productMst.getProductUnitPrice());
		purchaseResponseDto.setProductStockQuantity(productStockMst.getProductStockQuantity());

		return purchaseResponseDto;

	}

	private void validateStockQuantity(ProductStockMst productStockMst, PurchaseRequestDto purchaseRequestDto) {

		if (!productStockMst.getProductStockQuantity().equals(purchaseRequestDto.getProductStockQuantity())) {
			throw new ExclusiveProcessingException();
		}

		int updatedStockQuantity = productStockMst.getProductStockQuantity()
				- purchaseRequestDto.getProductPurchaseQuantity();
		if (updatedStockQuantity < 0) {
			throw new OutOfStockException();
		}

	}

	private ProductPurchaseTbl createProductPurchaseTblEntiry(ProductMst productMst,
			PurchaseRequestDto purchaseRequestDto) {

		ProductPurchaseTbl productPurchaseTbl = new ProductPurchaseTbl();

		productPurchaseTbl.setProductSeq(productMst.getProductSeq());
		productPurchaseTbl.setProductPurchaseDate(new Date());
		productPurchaseTbl.setProductPurchaseName(purchaseRequestDto.getProductPurchaseName());
		productPurchaseTbl.setProductPurchaseUnitPrice(productMst.getProductUnitPrice());
		productPurchaseTbl.setProductPurchaseQuantity(purchaseRequestDto.getProductPurchaseQuantity());

		BigDecimal productPurchaseAmount = BigDecimal
				.valueOf(productMst.getProductUnitPrice() * purchaseRequestDto.getProductPurchaseQuantity());

		productPurchaseTbl.setProductPurchaseAmount(productPurchaseAmount.intValue());

		return productPurchaseTbl;

	}

	private ProductStockMst createProductStockMst(ProductStockMst productStockMst,
			PurchaseRequestDto purchaseRequestDto) {

		ProductStockMst updProductStockMst = new ProductStockMst();
		updProductStockMst.setProductStockSeq(productStockMst.getProductStockSeq());
		updProductStockMst.setProductStockQuantity(
				productStockMst.getProductStockQuantity() - purchaseRequestDto.getProductPurchaseQuantity());

		return updProductStockMst;
	}

}
