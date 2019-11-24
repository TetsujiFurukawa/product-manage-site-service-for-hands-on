package com.example.demo.entity.dto.response;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PurchaseHistorySearchResponseDto {

	private Long no;

	private String productName;

	private String productCode;

	private String productPurchaseName;;

	private String productImageUrl;

	private Date productPurchaseDate;

	private Integer productPurchaseUnitPrice;

	private Integer productPurchaseQuantity;

	private Integer productPurchaseAmount;

}