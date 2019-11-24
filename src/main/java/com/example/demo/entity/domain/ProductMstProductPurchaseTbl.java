package com.example.demo.entity.domain;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductMstProductPurchaseTbl {

	private Long rowNo;

	private String productCode;

	private String productName;

	private String productPurchaseName;

	private Date productPurchaseDateFrom;

	private Date productPurchaseDateTo;

	private Date productPurchaseDate;

	private Integer productPurchaseUnitPrice;

	private Integer productPurchaseQuantity;

	private Integer productPurchaseAmount;

}
