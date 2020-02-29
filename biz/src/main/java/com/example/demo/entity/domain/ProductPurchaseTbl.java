package com.example.demo.entity.domain;

import java.time.LocalDateTime;
import java.math.BigDecimal;

public class ProductPurchaseTbl {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PRODUCT_PURCHASE_TBL.PRODUCT_PURCHASE_SEQ
	 * @mbg.generated  Sat Feb 29 16:49:29 JST 2020
	 */
	private Long productPurchaseSeq;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PRODUCT_PURCHASE_TBL.PRODUCT_SEQ
	 * @mbg.generated  Sat Feb 29 16:49:29 JST 2020
	 */
	private Long productSeq;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PRODUCT_PURCHASE_TBL.PRODUCT_PURCHASE_DATE
	 * @mbg.generated  Sat Feb 29 16:49:29 JST 2020
	 */
	private LocalDateTime productPurchaseDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PRODUCT_PURCHASE_TBL.PRODUCT_PURCHASE_NAME
	 * @mbg.generated  Sat Feb 29 16:49:29 JST 2020
	 */
	private String productPurchaseName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PRODUCT_PURCHASE_TBL.PRODUCT_PURCHASE_UNIT_PRICE
	 * @mbg.generated  Sat Feb 29 16:49:29 JST 2020
	 */
	private BigDecimal productPurchaseUnitPrice;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PRODUCT_PURCHASE_TBL.PRODUCT_PURCHASE_QUANTITY
	 * @mbg.generated  Sat Feb 29 16:49:29 JST 2020
	 */
	private Integer productPurchaseQuantity;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PRODUCT_PURCHASE_TBL.PRODUCT_PURCHASE_AMOUNT
	 * @mbg.generated  Sat Feb 29 16:49:29 JST 2020
	 */
	private BigDecimal productPurchaseAmount;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PRODUCT_PURCHASE_TBL.ENTER_DATE
	 * @mbg.generated  Sat Feb 29 16:49:29 JST 2020
	 */
	private LocalDateTime enterDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PRODUCT_PURCHASE_TBL.ENTER_USER
	 * @mbg.generated  Sat Feb 29 16:49:29 JST 2020
	 */
	private String enterUser;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PRODUCT_PURCHASE_TBL.UPDATE_DATE
	 * @mbg.generated  Sat Feb 29 16:49:29 JST 2020
	 */
	private LocalDateTime updateDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PRODUCT_PURCHASE_TBL.UPDATE_USER
	 * @mbg.generated  Sat Feb 29 16:49:29 JST 2020
	 */
	private String updateUser;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PRODUCT_PURCHASE_TBL.PRODUCT_PURCHASE_SEQ
	 * @return  the value of PRODUCT_PURCHASE_TBL.PRODUCT_PURCHASE_SEQ
	 * @mbg.generated  Sat Feb 29 16:49:29 JST 2020
	 */
	public Long getProductPurchaseSeq() {
		return productPurchaseSeq;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PRODUCT_PURCHASE_TBL.PRODUCT_PURCHASE_SEQ
	 * @param productPurchaseSeq  the value for PRODUCT_PURCHASE_TBL.PRODUCT_PURCHASE_SEQ
	 * @mbg.generated  Sat Feb 29 16:49:29 JST 2020
	 */
	public void setProductPurchaseSeq(Long productPurchaseSeq) {
		this.productPurchaseSeq = productPurchaseSeq;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PRODUCT_PURCHASE_TBL.PRODUCT_SEQ
	 * @return  the value of PRODUCT_PURCHASE_TBL.PRODUCT_SEQ
	 * @mbg.generated  Sat Feb 29 16:49:29 JST 2020
	 */
	public Long getProductSeq() {
		return productSeq;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PRODUCT_PURCHASE_TBL.PRODUCT_SEQ
	 * @param productSeq  the value for PRODUCT_PURCHASE_TBL.PRODUCT_SEQ
	 * @mbg.generated  Sat Feb 29 16:49:29 JST 2020
	 */
	public void setProductSeq(Long productSeq) {
		this.productSeq = productSeq;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PRODUCT_PURCHASE_TBL.PRODUCT_PURCHASE_DATE
	 * @return  the value of PRODUCT_PURCHASE_TBL.PRODUCT_PURCHASE_DATE
	 * @mbg.generated  Sat Feb 29 16:49:29 JST 2020
	 */
	public LocalDateTime getProductPurchaseDate() {
		return productPurchaseDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PRODUCT_PURCHASE_TBL.PRODUCT_PURCHASE_DATE
	 * @param productPurchaseDate  the value for PRODUCT_PURCHASE_TBL.PRODUCT_PURCHASE_DATE
	 * @mbg.generated  Sat Feb 29 16:49:29 JST 2020
	 */
	public void setProductPurchaseDate(LocalDateTime productPurchaseDate) {
		this.productPurchaseDate = productPurchaseDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PRODUCT_PURCHASE_TBL.PRODUCT_PURCHASE_NAME
	 * @return  the value of PRODUCT_PURCHASE_TBL.PRODUCT_PURCHASE_NAME
	 * @mbg.generated  Sat Feb 29 16:49:29 JST 2020
	 */
	public String getProductPurchaseName() {
		return productPurchaseName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PRODUCT_PURCHASE_TBL.PRODUCT_PURCHASE_NAME
	 * @param productPurchaseName  the value for PRODUCT_PURCHASE_TBL.PRODUCT_PURCHASE_NAME
	 * @mbg.generated  Sat Feb 29 16:49:29 JST 2020
	 */
	public void setProductPurchaseName(String productPurchaseName) {
		this.productPurchaseName = productPurchaseName == null ? null : productPurchaseName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PRODUCT_PURCHASE_TBL.PRODUCT_PURCHASE_UNIT_PRICE
	 * @return  the value of PRODUCT_PURCHASE_TBL.PRODUCT_PURCHASE_UNIT_PRICE
	 * @mbg.generated  Sat Feb 29 16:49:29 JST 2020
	 */
	public BigDecimal getProductPurchaseUnitPrice() {
		return productPurchaseUnitPrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PRODUCT_PURCHASE_TBL.PRODUCT_PURCHASE_UNIT_PRICE
	 * @param productPurchaseUnitPrice  the value for PRODUCT_PURCHASE_TBL.PRODUCT_PURCHASE_UNIT_PRICE
	 * @mbg.generated  Sat Feb 29 16:49:29 JST 2020
	 */
	public void setProductPurchaseUnitPrice(BigDecimal productPurchaseUnitPrice) {
		this.productPurchaseUnitPrice = productPurchaseUnitPrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PRODUCT_PURCHASE_TBL.PRODUCT_PURCHASE_QUANTITY
	 * @return  the value of PRODUCT_PURCHASE_TBL.PRODUCT_PURCHASE_QUANTITY
	 * @mbg.generated  Sat Feb 29 16:49:29 JST 2020
	 */
	public Integer getProductPurchaseQuantity() {
		return productPurchaseQuantity;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PRODUCT_PURCHASE_TBL.PRODUCT_PURCHASE_QUANTITY
	 * @param productPurchaseQuantity  the value for PRODUCT_PURCHASE_TBL.PRODUCT_PURCHASE_QUANTITY
	 * @mbg.generated  Sat Feb 29 16:49:29 JST 2020
	 */
	public void setProductPurchaseQuantity(Integer productPurchaseQuantity) {
		this.productPurchaseQuantity = productPurchaseQuantity;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PRODUCT_PURCHASE_TBL.PRODUCT_PURCHASE_AMOUNT
	 * @return  the value of PRODUCT_PURCHASE_TBL.PRODUCT_PURCHASE_AMOUNT
	 * @mbg.generated  Sat Feb 29 16:49:29 JST 2020
	 */
	public BigDecimal getProductPurchaseAmount() {
		return productPurchaseAmount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PRODUCT_PURCHASE_TBL.PRODUCT_PURCHASE_AMOUNT
	 * @param productPurchaseAmount  the value for PRODUCT_PURCHASE_TBL.PRODUCT_PURCHASE_AMOUNT
	 * @mbg.generated  Sat Feb 29 16:49:29 JST 2020
	 */
	public void setProductPurchaseAmount(BigDecimal productPurchaseAmount) {
		this.productPurchaseAmount = productPurchaseAmount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PRODUCT_PURCHASE_TBL.ENTER_DATE
	 * @return  the value of PRODUCT_PURCHASE_TBL.ENTER_DATE
	 * @mbg.generated  Sat Feb 29 16:49:29 JST 2020
	 */
	public LocalDateTime getEnterDate() {
		return enterDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PRODUCT_PURCHASE_TBL.ENTER_DATE
	 * @param enterDate  the value for PRODUCT_PURCHASE_TBL.ENTER_DATE
	 * @mbg.generated  Sat Feb 29 16:49:29 JST 2020
	 */
	public void setEnterDate(LocalDateTime enterDate) {
		this.enterDate = enterDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PRODUCT_PURCHASE_TBL.ENTER_USER
	 * @return  the value of PRODUCT_PURCHASE_TBL.ENTER_USER
	 * @mbg.generated  Sat Feb 29 16:49:29 JST 2020
	 */
	public String getEnterUser() {
		return enterUser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PRODUCT_PURCHASE_TBL.ENTER_USER
	 * @param enterUser  the value for PRODUCT_PURCHASE_TBL.ENTER_USER
	 * @mbg.generated  Sat Feb 29 16:49:29 JST 2020
	 */
	public void setEnterUser(String enterUser) {
		this.enterUser = enterUser == null ? null : enterUser.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PRODUCT_PURCHASE_TBL.UPDATE_DATE
	 * @return  the value of PRODUCT_PURCHASE_TBL.UPDATE_DATE
	 * @mbg.generated  Sat Feb 29 16:49:29 JST 2020
	 */
	public LocalDateTime getUpdateDate() {
		return updateDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PRODUCT_PURCHASE_TBL.UPDATE_DATE
	 * @param updateDate  the value for PRODUCT_PURCHASE_TBL.UPDATE_DATE
	 * @mbg.generated  Sat Feb 29 16:49:29 JST 2020
	 */
	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PRODUCT_PURCHASE_TBL.UPDATE_USER
	 * @return  the value of PRODUCT_PURCHASE_TBL.UPDATE_USER
	 * @mbg.generated  Sat Feb 29 16:49:29 JST 2020
	 */
	public String getUpdateUser() {
		return updateUser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PRODUCT_PURCHASE_TBL.UPDATE_USER
	 * @param updateUser  the value for PRODUCT_PURCHASE_TBL.UPDATE_USER
	 * @mbg.generated  Sat Feb 29 16:49:29 JST 2020
	 */
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser == null ? null : updateUser.trim();
	}
}