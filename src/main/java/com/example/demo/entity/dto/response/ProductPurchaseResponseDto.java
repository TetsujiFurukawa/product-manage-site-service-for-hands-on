package com.example.demo.entity.dto.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductPurchaseResponseDto {

	private String productCode;

	private String productName;

	private String productGenre;

	private String productImage;

	private String productSizeStandard;

	private String productColor;

	private Integer productPurchaseUnitPrice;

	private Integer productStockQuantity;

}
