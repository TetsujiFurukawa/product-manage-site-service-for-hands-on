package com.example.demo.entity.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "product_mst_stock_mst")
@Data
@NoArgsConstructor
public class ProductMstStockMst {

	@Id
	private String productCode;

	private String productName;

	private String productGenre;

	private String productSizeStandard;

	private String productColor;

	private String productUnitPrice;

	private String endOfSale;

	private String productStockQuantity;

}
