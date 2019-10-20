package com.example.demo.entity.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductMstStockMst {

	private String productCode;

	private String productName;

	private String productGenre;

	private String productSizeStandard;

	private String productColor;

	private Integer productUnitPrice;

	private Boolean endOfSale;

	private Integer productStockQuantity;

}
