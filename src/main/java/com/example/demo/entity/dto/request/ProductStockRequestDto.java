package com.example.demo.entity.dto.request;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.example.demo.validator.SingleByteAlphanumericValidator;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductStockRequestDto {

	@NotNull
	@NotBlank
	@Size(max = 20)
	@SingleByteAlphanumericValidator
	private String productCode;

	@NotNull
	@Min(1)
	@Max(999999999)
	private Integer productStockQuantity;

	@NotNull
	@Min(1)
	@Max(999999999)
	private Integer updateProductStockQuantity;

}
