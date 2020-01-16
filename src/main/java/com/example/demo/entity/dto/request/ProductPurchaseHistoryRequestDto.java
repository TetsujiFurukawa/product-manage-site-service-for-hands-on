package com.example.demo.entity.dto.request;

import java.time.LocalDateTime;

import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductPurchaseHistoryRequestDto {

	@Size(max = 50)
	private String productPurchaseName;

	private LocalDateTime productPurchaseDateFrom;

	private LocalDateTime productPurchaseDateTo;

	@Size(max = 50)
	private String productName;

	@Size(max = 20)
	private String productCode;

}
