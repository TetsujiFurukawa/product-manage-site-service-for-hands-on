package com.example.demo.entity.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "product_mst")
@Data
@NoArgsConstructor
public class ProductMst {

	@Id
	@GeneratedValue
	private String productSeq;

	private String productCode;

	private String productName;

	private String productGenre;

	private String productSizeStandard;

	private String productColor;

	private String productUnitPrice;

	private String endOfSale;

	private String endOfSaleDate;

	private String deleted;

	private String enterDate;

	private String enterUser;

	private String updateDate;

	private String updateUser;

}
