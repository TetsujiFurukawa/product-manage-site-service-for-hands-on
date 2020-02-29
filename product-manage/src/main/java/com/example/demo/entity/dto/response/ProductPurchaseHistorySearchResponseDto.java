package com.example.demo.entity.dto.response;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductPurchaseHistorySearchResponseDto {

	private Long no;

	private String productName;

	private String productCode;

	private String productPurchaseName;;

	private String productImageUrl;

	private ZonedDateTime productPurchaseDate;

	private BigDecimal productPurchaseUnitPrice;

	private Integer productPurchaseQuantity;

	private Integer productPurchaseAmount;

}