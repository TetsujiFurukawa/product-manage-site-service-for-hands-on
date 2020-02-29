package com.example.demo.entity.dto.response;

import java.math.BigDecimal;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductSearchResponseDto {

	private Long no;

	private String productName;

	private String productCode;

	private String productGenre;

	private String productImageUrl;

	private String productSizeStandard;

	private String productColor;

	private BigDecimal productUnitPrice;

	private Integer productStockQuantity;

	private Boolean endOfSale;

}