package com.example.demo.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
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

	@GetMapping("/product-listing")
	public ProductSearchListResponseDto searchProductList(@Validated ProductListRequestDto productListRequestDto,
			PagenatorRequestDto pagenatorRequestDto, HttpServletRequest request) {

		return productRestService.getProductList(productListRequestDto, pagenatorRequestDto);

	}

	@GetMapping("/product-registering")
	public ProductDto getByCode(@NotNull String productCode) throws IOException {

		return productRestService.getByCode(productCode);

	}

	@PostMapping("/product-registering")
	public ProductDto create(@RequestBody @Validated ProductDto productDto) throws IOException {

		return productRestService.insertProduct(productDto);

	}

	@PutMapping("/product-registering")
	public ProductDto update(@RequestBody @Validated ProductDto productDto) throws IOException {

		return productRestService.updateProduct(productDto);

	}

}