package com.example.demo.service.rest;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.entity.domain.ProductMst;
import com.example.demo.entity.domain.ProductMstStockMst;
import com.example.demo.entity.dto.request.PagenatorRequestDto;
import com.example.demo.entity.dto.request.ProductListRequestDto;
import com.example.demo.entity.dto.response.ProductListResponseDto;
import com.example.demo.entity.dto.response.ProductResponseDto;
import com.example.demo.service.ProductService;
import com.example.demo.utility.PagenatorUtility;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductRestService extends BaseRestService {

	private final ProductService productService;

	public ProductListResponseDto getProductList(
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

	protected ProductListResponseDto createResponseDto(List<ProductMstStockMst> productMstStockMst,
			PagenatorRequestDto pagenatorRequestDto, Long productMstStockMstCount) {

		ProductListResponseDto productListResponseDto = new ProductListResponseDto();

		productListResponseDto.setPageIndex(pagenatorRequestDto.getPageIndex());
		productListResponseDto.setResultsLength(productMstStockMstCount);

		List<ProductResponseDto> productResponseDtos = productMstStockMst.stream()
				.map(p -> {

					ProductResponseDto productResponseDto = new ProductResponseDto();
					productResponseDto.setProductCode(p.getProductCode());
					productResponseDto.setProductName(p.getProductName());
					productResponseDto.setProductGenre(p.getProductGenre());
					productResponseDto.setProductSizeStandard(p.getProductSizeStandard());
					productResponseDto.setProductColor(p.getProductColor());
					productResponseDto.setProductUnitPrice(p.getProductUnitPrice());
					productResponseDto.setProductStockQuantity(p.getProductStockQuantity());
					productResponseDto.setEndOfSale(p.getEndOfSale());

					return productResponseDto;

				}).collect(Collectors.toList());

		productListResponseDto.setProductResponseDtos(productResponseDtos);

		return productListResponseDto;

	}

}
