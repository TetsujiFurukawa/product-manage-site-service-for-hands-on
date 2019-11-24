package com.example.demo.entity.dto.request;

import java.util.Date;

import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PurchaseHistoryRequestDto {

	@Size(max = 50)
	private String productPurchaseName;

	private Date productPurchaseDateFrom;

	private Date productPurchaseDateTo;

	@Size(max = 50)
	private String productName;

	@Size(max = 20)
	private String productCode;

}
