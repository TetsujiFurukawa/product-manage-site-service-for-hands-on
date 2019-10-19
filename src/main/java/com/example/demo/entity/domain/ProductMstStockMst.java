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

	private String productUnitPrice;

	private String endOfSale;

	private String productStockQuantity;

}
