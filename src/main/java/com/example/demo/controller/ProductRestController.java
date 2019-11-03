package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.dto.ProductDto;
import com.example.demo.entity.dto.request.PagenatorRequestDto;
import com.example.demo.entity.dto.request.ProductListRequestDto;
import com.example.demo.entity.dto.response.ProductSearchListResponseDto;
import com.example.demo.service.rest.ProductRestService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class ProductRestController {
	private final ProductRestService productRestService;

	@GetMapping("/product-listing")
	public ProductSearchListResponseDto searchProductList(ProductListRequestDto productListRequestDto,
			PagenatorRequestDto pagenatorRequestDto) {

		return productRestService.getProductList(productListRequestDto,
				pagenatorRequestDto);

	}

	@GetMapping("/product")
	public ProductDto getByCode(String productCode) {
		return productRestService.getByCode(productCode);
	}

	@PostMapping("/product")
	public ProductDto create(@RequestBody ProductDto productDto) {
		return productRestService.create(productDto);
	}

	@PutMapping("/product")
	public ProductDto update(@RequestBody ProductDto productDto) {
		return productRestService.update(productDto);
	}

}