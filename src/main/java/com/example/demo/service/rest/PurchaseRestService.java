package com.example.demo.service.rest;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.entity.domain.ProductMstProductPurchaseTbl;
import com.example.demo.entity.dto.request.PagenatorRequestDto;
import com.example.demo.entity.dto.request.PurchaseHistoryRequestDto;
import com.example.demo.entity.dto.response.PurchaseHistorySearchListResponseDto;
import com.example.demo.entity.dto.response.PurchaseHistorySearchResponseDto;
import com.example.demo.properties.ProductImageProperties;
import com.example.demo.service.ProductPurchaseService;
import com.example.demo.service.ProductService;
import com.example.demo.utility.PagenatorUtility;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PurchaseRestService {

	private final ProductService productService;

	private final ProductPurchaseService productPurchaseService;

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
}
