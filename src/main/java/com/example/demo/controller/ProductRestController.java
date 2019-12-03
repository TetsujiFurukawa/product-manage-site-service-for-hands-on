package com.example.demo.controller;

import java.io.IOException;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;
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

	@GetMapping("/product-search/v1")
	public ProductSearchListResponseDto searchProductListV1(@Validated ProductListRequestDto productListRequestDto,
			PagenatorRequestDto pagenatorRequestDto) {

		return productRestService.getProductList(productListRequestDto, pagenatorRequestDto);

	}

	@GetMapping("/product/v1")
	public ProductDto getProductByCodeV1(@NotNull String productCode) throws IOException {

		return productRestService.getProductByCode(productCode);

	}

	@PostMapping("/product/v1")
	public ProductDto createProductV1(@RequestBody @Validated ProductDto productDto) throws IOException {

		return productRestService.insertProduct(productDto);

	}

	@PutMapping("/product/v1")
	public ProductDto updateProductV1(@RequestBody @Validated ProductDto productDto) throws IOException {

		return productRestService.updateProduct(productDto);

	}

}