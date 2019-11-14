package com.example.demo.entity.dto;

import java.util.Date;

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

	@NotNull
	@Min(1)
	@Max(999999999)
	private Integer productUnitPrice;

	@NotNull
	private Boolean endOfSale;

	private Date endOfSaleDate;

	private Date enterDate;

	private String enterUser;

	private Date updateDate;

	private String updateUser;

}