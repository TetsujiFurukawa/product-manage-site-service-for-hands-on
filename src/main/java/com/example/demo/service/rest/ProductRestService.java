package com.example.demo.service.rest;

import org.springframework.stereotype.Service;

import com.example.demo.entity.domain.ProductMst;
import com.example.demo.entity.dto.request.PagenatorRequestDto;
import com.example.demo.entity.dto.request.ProductListRequestDto;
import com.example.demo.entity.dto.response.ProductListResponseDto;
import com.example.demo.service.ProductService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductRestService extends BaseRestService {

	private final ProductService productService;

	public ProductListResponseDto getProductList(
			ProductListRequestDto productListRequestDto, PagenatorRequestDto pagenatorRequestDto) {

		ProductMst searchEntity = CreateSearchEntity(productListRequestDto);


		return productService.getProductList(searchEntity, pagenatorRequestDto.getPageSize(),
				pagenatorRequestDto.getPageIndex());

	}

	protected ProductMst CreateSearchEntity(ProductListRequestDto productListRequestDto) {

		ProductMst searchProductMst = new ProductMst();
		searchProductMst.setProductCode(productListRequestDto.getProductCode());
		searchProductMst.setProductName(productListRequestDto.getProductName());
		searchProductMst.setProductGenre(productListRequestDto.getProductGenre());
		//TODO
//		searchProductMst.setDeleted(productListRequestDto.getDeleted().equals(obj));
		return searchProductMst;

	}

}
