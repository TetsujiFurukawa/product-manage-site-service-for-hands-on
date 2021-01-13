package com.example.demo.entity.dto;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.example.demo.validator.SingleByteAlphaUpperValidator;
import com.example.demo.validator.SingleByteAlphanumericValidator;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductDto {

	private Long productSeq;

	@NotNull
	@NotBlank
	@Size(max = 20)
	@SingleByteAlphanumericValidator
	private String productCode;

	@NotNull
	@NotBlank
	@Size(max = 50)
	private String productName;

	@NotNull
	@NotBlank
	@Size(max = 50)
	private String productGenre;

	private String productImage;

	@NotNull
	@NotBlank
	@Size(max = 50)
	private String productSizeStandard;

	@Size(max = 20)
	private String productColor;

	@Size(min = 3)
	@Size(max = 3)
	@NotNull
	@SingleByteAlphaUpperValidator
	private String productCurrency;

	@NotNull
	@Min(1)
	@Max(99999999)
	private BigDecimal productUnitPrice;

	@NotNull
	private Boolean endOfSale;

	private ZonedDateTime endOfSaleDate;

	private ZonedDateTime enterDate;

	private String enterUser;

	private ZonedDateTime updateDate;

	private String updateUser;

}