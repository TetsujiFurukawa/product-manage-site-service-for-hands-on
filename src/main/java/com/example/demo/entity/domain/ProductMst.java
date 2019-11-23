package com.example.demo.entity.domain;

import java.util.Date;

public class ProductMst {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PRODUCT_MST.PRODUCT_SEQ
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	private Long productSeq;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PRODUCT_MST.PRODUCT_CODE
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	private String productCode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PRODUCT_MST.PRODUCT_NAME
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	private String productName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PRODUCT_MST.PRODUCT_GENRE
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	private String productGenre;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PRODUCT_MST.PRODUCT_SIZE_STANDARD
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	private String productSizeStandard;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PRODUCT_MST.PRODUCT_COLOR
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	private String productColor;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PRODUCT_MST.PRODUCT_UNIT_PRICE
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	private Integer productUnitPrice;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PRODUCT_MST.END_OF_SALE
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	private Boolean endOfSale;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PRODUCT_MST.END_OF_SALE_DATE
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	private Date endOfSaleDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PRODUCT_MST.DELETED
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	private Boolean deleted;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PRODUCT_MST.ENTER_DATE
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	private Date enterDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PRODUCT_MST.ENTER_USER
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	private String enterUser;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PRODUCT_MST.UPDATE_DATE
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	private Date updateDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PRODUCT_MST.UPDATE_USER
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	private String updateUser;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PRODUCT_MST.PRODUCT_SEQ
	 * @return  the value of PRODUCT_MST.PRODUCT_SEQ
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	public Long getProductSeq() {
		return productSeq;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PRODUCT_MST.PRODUCT_SEQ
	 * @param productSeq  the value for PRODUCT_MST.PRODUCT_SEQ
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	public void setProductSeq(Long productSeq) {
		this.productSeq = productSeq;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PRODUCT_MST.PRODUCT_CODE
	 * @return  the value of PRODUCT_MST.PRODUCT_CODE
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	public String getProductCode() {
		return productCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PRODUCT_MST.PRODUCT_CODE
	 * @param productCode  the value for PRODUCT_MST.PRODUCT_CODE
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	public void setProductCode(String productCode) {
		this.productCode = productCode == null ? null : productCode.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PRODUCT_MST.PRODUCT_NAME
	 * @return  the value of PRODUCT_MST.PRODUCT_NAME
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PRODUCT_MST.PRODUCT_NAME
	 * @param productName  the value for PRODUCT_MST.PRODUCT_NAME
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	public void setProductName(String productName) {
		this.productName = productName == null ? null : productName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PRODUCT_MST.PRODUCT_GENRE
	 * @return  the value of PRODUCT_MST.PRODUCT_GENRE
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	public String getProductGenre() {
		return productGenre;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PRODUCT_MST.PRODUCT_GENRE
	 * @param productGenre  the value for PRODUCT_MST.PRODUCT_GENRE
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	public void setProductGenre(String productGenre) {
		this.productGenre = productGenre == null ? null : productGenre.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PRODUCT_MST.PRODUCT_SIZE_STANDARD
	 * @return  the value of PRODUCT_MST.PRODUCT_SIZE_STANDARD
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	public String getProductSizeStandard() {
		return productSizeStandard;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PRODUCT_MST.PRODUCT_SIZE_STANDARD
	 * @param productSizeStandard  the value for PRODUCT_MST.PRODUCT_SIZE_STANDARD
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	public void setProductSizeStandard(String productSizeStandard) {
		this.productSizeStandard = productSizeStandard == null ? null : productSizeStandard.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PRODUCT_MST.PRODUCT_COLOR
	 * @return  the value of PRODUCT_MST.PRODUCT_COLOR
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	public String getProductColor() {
		return productColor;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PRODUCT_MST.PRODUCT_COLOR
	 * @param productColor  the value for PRODUCT_MST.PRODUCT_COLOR
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	public void setProductColor(String productColor) {
		this.productColor = productColor == null ? null : productColor.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PRODUCT_MST.PRODUCT_UNIT_PRICE
	 * @return  the value of PRODUCT_MST.PRODUCT_UNIT_PRICE
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	public Integer getProductUnitPrice() {
		return productUnitPrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PRODUCT_MST.PRODUCT_UNIT_PRICE
	 * @param productUnitPrice  the value for PRODUCT_MST.PRODUCT_UNIT_PRICE
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	public void setProductUnitPrice(Integer productUnitPrice) {
		this.productUnitPrice = productUnitPrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PRODUCT_MST.END_OF_SALE
	 * @return  the value of PRODUCT_MST.END_OF_SALE
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	public Boolean getEndOfSale() {
		return endOfSale;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PRODUCT_MST.END_OF_SALE
	 * @param endOfSale  the value for PRODUCT_MST.END_OF_SALE
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	public void setEndOfSale(Boolean endOfSale) {
		this.endOfSale = endOfSale;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PRODUCT_MST.END_OF_SALE_DATE
	 * @return  the value of PRODUCT_MST.END_OF_SALE_DATE
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	public Date getEndOfSaleDate() {
		return endOfSaleDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PRODUCT_MST.END_OF_SALE_DATE
	 * @param endOfSaleDate  the value for PRODUCT_MST.END_OF_SALE_DATE
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	public void setEndOfSaleDate(Date endOfSaleDate) {
		this.endOfSaleDate = endOfSaleDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PRODUCT_MST.DELETED
	 * @return  the value of PRODUCT_MST.DELETED
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	public Boolean getDeleted() {
		return deleted;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PRODUCT_MST.DELETED
	 * @param deleted  the value for PRODUCT_MST.DELETED
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PRODUCT_MST.ENTER_DATE
	 * @return  the value of PRODUCT_MST.ENTER_DATE
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	public Date getEnterDate() {
		return enterDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PRODUCT_MST.ENTER_DATE
	 * @param enterDate  the value for PRODUCT_MST.ENTER_DATE
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	public void setEnterDate(Date enterDate) {
		this.enterDate = enterDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PRODUCT_MST.ENTER_USER
	 * @return  the value of PRODUCT_MST.ENTER_USER
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	public String getEnterUser() {
		return enterUser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PRODUCT_MST.ENTER_USER
	 * @param enterUser  the value for PRODUCT_MST.ENTER_USER
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	public void setEnterUser(String enterUser) {
		this.enterUser = enterUser == null ? null : enterUser.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PRODUCT_MST.UPDATE_DATE
	 * @return  the value of PRODUCT_MST.UPDATE_DATE
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	public Date getUpdateDate() {
		return updateDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PRODUCT_MST.UPDATE_DATE
	 * @param updateDate  the value for PRODUCT_MST.UPDATE_DATE
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PRODUCT_MST.UPDATE_USER
	 * @return  the value of PRODUCT_MST.UPDATE_USER
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	public String getUpdateUser() {
		return updateUser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PRODUCT_MST.UPDATE_USER
	 * @param updateUser  the value for PRODUCT_MST.UPDATE_USER
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser == null ? null : updateUser.trim();
	}
}