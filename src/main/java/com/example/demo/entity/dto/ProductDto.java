package com.example.demo.entity.dto;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductDto {

	private Long productSeq;

	private String productName;

	private String productCode;

	private String productGenre;

	private String productImage;

	private String productSizeStandard;

	private String productColor;

	private Integer productUnitPrice;

	private Boolean endOfSale;

	private Date endOfSaleDate;

	private Date enterDate;

	private String enterUser;

	private Date updateDate;

	private String updateUser;

}