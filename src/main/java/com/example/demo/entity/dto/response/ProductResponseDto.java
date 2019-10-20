package com.example.demo.entity.dto.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductResponseDto {

	private String productName;

	private String productCode;

	private String productGenre;

	private String productImage;

	private String productSizeStandard;

	private String productColor;

	private Integer productUnitPrice;

	private Integer productStockQuantity;

	private Boolean endOfSale;

}