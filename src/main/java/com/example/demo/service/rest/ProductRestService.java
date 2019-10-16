package com.example.demo.service.rest;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.domain.ProductMst;
import com.example.demo.entity.domain.ProductMstStockMst;
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


		List<ProductMstStockMst> productMstStockMst= productService.getProductList(searchEntity, pagenatorRequestDto.getPageSize(),
				pagenatorRequestDto.getPageIndex());


		return null;

	}

	protected ProductMst CreateSearchEntity(ProductListRequestDto productListRequestDto) {

		ProductMst searchProductMst = new ProductMst();
		searchProductMst.setProductCode(productListRequestDto.getProductCode());
		searchProductMst.setProductName(productListRequestDto.getProductName());
		searchProductMst.setProductGenre(productListRequestDto.getProductGenre());
		//TODO
		searchProductMst.setDeleted(false);

		//		if(!productListRequestDto.getDeleted()) {
//			searchProductMst.setDeleted(true);
//		}else {
//			searchProductMst.setDeleted(false);
//		}
		return searchProductMst;

	}

}
