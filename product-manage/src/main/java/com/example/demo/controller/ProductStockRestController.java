package com.example.demo.controller;

import java.io.IOException;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.dto.request.ProductStockRequestDto;
import com.example.demo.entity.dto.response.ProductStockResponseDto;
import com.example.demo.service.rest.ProductStockRestService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class ProductStockRestController {

	private final ProductStockRestService productStockRestService;

	@GetMapping("/product-stock/v1")
	public ProductStockResponseDto getProductStockByCodeV1(@NotNull String productCode) throws IOException {

		return productStockRestService.getProductStockByCode(productCode);

	}

	@PutMapping("/product-stock/v1")
	public ProductStockResponseDto createProductStockV1(
			@RequestBody @Validated ProductStockRequestDto productStockRequestDto)
			throws IOException {

		return productStockRestService.updateProductStock(productStockRequestDto);

	}
}
