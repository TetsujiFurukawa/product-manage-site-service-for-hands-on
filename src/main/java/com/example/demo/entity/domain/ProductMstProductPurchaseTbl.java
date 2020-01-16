package com.example.demo.entity.domain;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductMstProductPurchaseTbl {

	private Long rowNo;

	private String productCode;

	private String productName;

	private String productPurchaseName;

	private LocalDateTime productPurchaseDateFrom;

	private LocalDateTime productPurchaseDateTo;

	private LocalDateTime productPurchaseDate;

	private Integer productPurchaseUnitPrice;

	private Integer productPurchaseQuantity;

	private Integer productPurchaseAmount;

}
