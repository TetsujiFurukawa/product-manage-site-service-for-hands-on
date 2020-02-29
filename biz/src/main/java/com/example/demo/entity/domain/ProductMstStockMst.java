package com.example.demo.entity.domain;

import java.math.BigDecimal;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductMstStockMst {

	private Long rowNo;

	private String productCode;

	private String productName;

	private String productGenre;

	private String productSizeStandard;

	private String productColor;

	private BigDecimal productUnitPrice;

	private Boolean endOfSale;

	private Integer productStockQuantity;

}
