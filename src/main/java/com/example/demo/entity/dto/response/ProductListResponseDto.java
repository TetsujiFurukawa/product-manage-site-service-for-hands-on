package com.example.demo.entity.dto.response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductListResponseDto {

	private Integer pageIndex;

	private Integer resultsLength;

	private List<ProductResponseDto> productResponseDtos;

	@Data
	@AllArgsConstructor
	public class ProductResponseDto {

		private String productName;

		private String productCode;

		private String productGenre;

		private String productImage;

		private String productSizeStandard;

		private String productColor;

		private String productUnitPrice;

		private String productStockQuantity;

		private Boolean deleted;

	}
}
