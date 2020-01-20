package com.example.demo.entity.dto.request;

import java.time.ZonedDateTime;

import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductPurchaseHistoryRequestDto {

	@Size(max = 50)
	private String productPurchaseName;

	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private ZonedDateTime productPurchaseDateFrom;

	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private ZonedDateTime productPurchaseDateTo;

	@Size(max = 50)
	private String productName;

	@Size(max = 20)
	private String productCode;

}
