package com.example.demo.entity.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductMstExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table PRODUCT_MST
	 * @mbg.generated  Sat Oct 19 23:35:57 JST 2019
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table PRODUCT_MST
	 * @mbg.generated  Sat Oct 19 23:35:57 JST 2019
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table PRODUCT_MST
	 * @mbg.generated  Sat Oct 19 23:35:57 JST 2019
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT_MST
	 * @mbg.generated  Sat Oct 19 23:35:57 JST 2019
	 */
	public ProductMstExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT_MST
	 * @mbg.generated  Sat Oct 19 23:35:57 JST 2019
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT_MST
	 * @mbg.generated  Sat Oct 19 23:35:57 JST 2019
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT_MST
	 * @mbg.generated  Sat Oct 19 23:35:57 JST 2019
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT_MST
	 * @mbg.generated  Sat Oct 19 23:35:57 JST 2019
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT_MST
	 * @mbg.generated  Sat Oct 19 23:35:57 JST 2019
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT_MST
	 * @mbg.generated  Sat Oct 19 23:35:57 JST 2019
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT_MST
	 * @mbg.generated  Sat Oct 19 23:35:57 JST 2019
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT_MST
	 * @mbg.generated  Sat Oct 19 23:35:57 JST 2019
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT_MST
	 * @mbg.generated  Sat Oct 19 23:35:57 JST 2019
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT_MST
	 * @mbg.generated  Sat Oct 19 23:35:57 JST 2019
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table PRODUCT_MST
	 * @mbg.generated  Sat Oct 19 23:35:57 JST 2019
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andProductSeqIsNull() {
			addCriterion("PRODUCT_SEQ is null");
			return (Criteria) this;
		}

		public Criteria andProductSeqIsNotNull() {
			addCriterion("PRODUCT_SEQ is not null");
			return (Criteria) this;
		}

		public Criteria andProductSeqEqualTo(Long value) {
			addCriterion("PRODUCT_SEQ =", value, "productSeq");
			return (Criteria) this;
		}

		public Criteria andProductSeqNotEqualTo(Long value) {
			addCriterion("PRODUCT_SEQ <>", value, "productSeq");
			return (Criteria) this;
		}

		public Criteria andProductSeqGreaterThan(Long value) {
			addCriterion("PRODUCT_SEQ >", value, "productSeq");
			return (Criteria) this;
		}

		public Criteria andProductSeqGreaterThanOrEqualTo(Long value) {
			addCriterion("PRODUCT_SEQ >=", value, "productSeq");
			return (Criteria) this;
		}

		public Criteria andProductSeqLessThan(Long value) {
			addCriterion("PRODUCT_SEQ <", value, "productSeq");
			return (Criteria) this;
		}

		public Criteria andProductSeqLessThanOrEqualTo(Long value) {
			addCriterion("PRODUCT_SEQ <=", value, "productSeq");
			return (Criteria) this;
		}

		public Criteria andProductSeqIn(List<Long> values) {
			addCriterion("PRODUCT_SEQ in", values, "productSeq");
			return (Criteria) this;
		}

		public Criteria andProductSeqNotIn(List<Long> values) {
			addCriterion("PRODUCT_SEQ not in", values, "productSeq");
			return (Criteria) this;
		}

		public Criteria andProductSeqBetween(Long value1, Long value2) {
			addCriterion("PRODUCT_SEQ between", value1, value2, "productSeq");
			return (Criteria) this;
		}

		public Criteria andProductSeqNotBetween(Long value1, Long value2) {
			addCriterion("PRODUCT_SEQ not between", value1, value2, "productSeq");
			return (Criteria) this;
		}

		public Criteria andProductCodeIsNull() {
			addCriterion("PRODUCT_CODE is null");
			return (Criteria) this;
		}

		public Criteria andProductCodeIsNotNull() {
			addCriterion("PRODUCT_CODE is not null");
			return (Criteria) this;
		}

		public Criteria andProductCodeEqualTo(String value) {
			addCriterion("PRODUCT_CODE =", value, "productCode");
			return (Criteria) this;
		}

		public Criteria andProductCodeNotEqualTo(String value) {
			addCriterion("PRODUCT_CODE <>", value, "productCode");
			return (Criteria) this;
		}

		public Criteria andProductCodeGreaterThan(String value) {
			addCriterion("PRODUCT_CODE >", value, "productCode");
			return (Criteria) this;
		}

		public Criteria andProductCodeGreaterThanOrEqualTo(String value) {
			addCriterion("PRODUCT_CODE >=", value, "productCode");
			return (Criteria) this;
		}

		public Criteria andProductCodeLessThan(String value) {
			addCriterion("PRODUCT_CODE <", value, "productCode");
			return (Criteria) this;
		}

		public Criteria andProductCodeLessThanOrEqualTo(String value) {
			addCriterion("PRODUCT_CODE <=", value, "productCode");
			return (Criteria) this;
		}

		public Criteria andProductCodeLike(String value) {
			addCriterion("PRODUCT_CODE like", value, "productCode");
			return (Criteria) this;
		}

		public Criteria andProductCodeNotLike(String value) {
			addCriterion("PRODUCT_CODE not like", value, "productCode");
			return (Criteria) this;
		}

		public Criteria andProductCodeIn(List<String> values) {
			addCriterion("PRODUCT_CODE in", values, "productCode");
			return (Criteria) this;
		}

		public Criteria andProductCodeNotIn(List<String> values) {
			addCriterion("PRODUCT_CODE not in", values, "productCode");
			return (Criteria) this;
		}

		public Criteria andProductCodeBetween(String value1, String value2) {
			addCriterion("PRODUCT_CODE between", value1, value2, "productCode");
			return (Criteria) this;
		}

		public Criteria andProductCodeNotBetween(String value1, String value2) {
			addCriterion("PRODUCT_CODE not between", value1, value2, "productCode");
			return (Criteria) this;
		}

		public Criteria andProductNameIsNull() {
			addCriterion("PRODUCT_NAME is null");
			return (Criteria) this;
		}

		public Criteria andProductNameIsNotNull() {
			addCriterion("PRODUCT_NAME is not null");
			return (Criteria) this;
		}

		public Criteria andProductNameEqualTo(String value) {
			addCriterion("PRODUCT_NAME =", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameNotEqualTo(String value) {
			addCriterion("PRODUCT_NAME <>", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameGreaterThan(String value) {
			addCriterion("PRODUCT_NAME >", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameGreaterThanOrEqualTo(String value) {
			addCriterion("PRODUCT_NAME >=", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameLessThan(String value) {
			addCriterion("PRODUCT_NAME <", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameLessThanOrEqualTo(String value) {
			addCriterion("PRODUCT_NAME <=", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameLike(String value) {
			addCriterion("PRODUCT_NAME like", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameNotLike(String value) {
			addCriterion("PRODUCT_NAME not like", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameIn(List<String> values) {
			addCriterion("PRODUCT_NAME in", values, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameNotIn(List<String> values) {
			addCriterion("PRODUCT_NAME not in", values, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameBetween(String value1, String value2) {
			addCriterion("PRODUCT_NAME between", value1, value2, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameNotBetween(String value1, String value2) {
			addCriterion("PRODUCT_NAME not between", value1, value2, "productName");
			return (Criteria) this;
		}

		public Criteria andProductGenreIsNull() {
			addCriterion("PRODUCT_GENRE is null");
			return (Criteria) this;
		}

		public Criteria andProductGenreIsNotNull() {
			addCriterion("PRODUCT_GENRE is not null");
			return (Criteria) this;
		}

		public Criteria andProductGenreEqualTo(String value) {
			addCriterion("PRODUCT_GENRE =", value, "productGenre");
			return (Criteria) this;
		}

		public Criteria andProductGenreNotEqualTo(String value) {
			addCriterion("PRODUCT_GENRE <>", value, "productGenre");
			return (Criteria) this;
		}

		public Criteria andProductGenreGreaterThan(String value) {
			addCriterion("PRODUCT_GENRE >", value, "productGenre");
			return (Criteria) this;
		}

		public Criteria andProductGenreGreaterThanOrEqualTo(String value) {
			addCriterion("PRODUCT_GENRE >=", value, "productGenre");
			return (Criteria) this;
		}

		public Criteria andProductGenreLessThan(String value) {
			addCriterion("PRODUCT_GENRE <", value, "productGenre");
			return (Criteria) this;
		}

		public Criteria andProductGenreLessThanOrEqualTo(String value) {
			addCriterion("PRODUCT_GENRE <=", value, "productGenre");
			return (Criteria) this;
		}

		public Criteria andProductGenreLike(String value) {
			addCriterion("PRODUCT_GENRE like", value, "productGenre");
			return (Criteria) this;
		}

		public Criteria andProductGenreNotLike(String value) {
			addCriterion("PRODUCT_GENRE not like", value, "productGenre");
			return (Criteria) this;
		}

		public Criteria andProductGenreIn(List<String> values) {
			addCriterion("PRODUCT_GENRE in", values, "productGenre");
			return (Criteria) this;
		}

		public Criteria andProductGenreNotIn(List<String> values) {
			addCriterion("PRODUCT_GENRE not in", values, "productGenre");
			return (Criteria) this;
		}

		public Criteria andProductGenreBetween(String value1, String value2) {
			addCriterion("PRODUCT_GENRE between", value1, value2, "productGenre");
			return (Criteria) this;
		}

		public Criteria andProductGenreNotBetween(String value1, String value2) {
			addCriterion("PRODUCT_GENRE not between", value1, value2, "productGenre");
			return (Criteria) this;
		}

		public Criteria andProductSizeStandardIsNull() {
			addCriterion("PRODUCT_SIZE_STANDARD is null");
			return (Criteria) this;
		}

		public Criteria andProductSizeStandardIsNotNull() {
			addCriterion("PRODUCT_SIZE_STANDARD is not null");
			return (Criteria) this;
		}

		public Criteria andProductSizeStandardEqualTo(String value) {
			addCriterion("PRODUCT_SIZE_STANDARD =", value, "productSizeStandard");
			return (Criteria) this;
		}

		public Criteria andProductSizeStandardNotEqualTo(String value) {
			addCriterion("PRODUCT_SIZE_STANDARD <>", value, "productSizeStandard");
			return (Criteria) this;
		}

		public Criteria andProductSizeStandardGreaterThan(String value) {
			addCriterion("PRODUCT_SIZE_STANDARD >", value, "productSizeStandard");
			return (Criteria) this;
		}

		public Criteria andProductSizeStandardGreaterThanOrEqualTo(String value) {
			addCriterion("PRODUCT_SIZE_STANDARD >=", value, "productSizeStandard");
			return (Criteria) this;
		}

		public Criteria andProductSizeStandardLessThan(String value) {
			addCriterion("PRODUCT_SIZE_STANDARD <", value, "productSizeStandard");
			return (Criteria) this;
		}

		public Criteria andProductSizeStandardLessThanOrEqualTo(String value) {
			addCriterion("PRODUCT_SIZE_STANDARD <=", value, "productSizeStandard");
			return (Criteria) this;
		}

		public Criteria andProductSizeStandardLike(String value) {
			addCriterion("PRODUCT_SIZE_STANDARD like", value, "productSizeStandard");
			return (Criteria) this;
		}

		public Criteria andProductSizeStandardNotLike(String value) {
			addCriterion("PRODUCT_SIZE_STANDARD not like", value, "productSizeStandard");
			return (Criteria) this;
		}

		public Criteria andProductSizeStandardIn(List<String> values) {
			addCriterion("PRODUCT_SIZE_STANDARD in", values, "productSizeStandard");
			return (Criteria) this;
		}

		public Criteria andProductSizeStandardNotIn(List<String> values) {
			addCriterion("PRODUCT_SIZE_STANDARD not in", values, "productSizeStandard");
			return (Criteria) this;
		}

		public Criteria andProductSizeStandardBetween(String value1, String value2) {
			addCriterion("PRODUCT_SIZE_STANDARD between", value1, value2, "productSizeStandard");
			return (Criteria) this;
		}

		public Criteria andProductSizeStandardNotBetween(String value1, String value2) {
			addCriterion("PRODUCT_SIZE_STANDARD not between", value1, value2, "productSizeStandard");
			return (Criteria) this;
		}

		public Criteria andProductColorIsNull() {
			addCriterion("PRODUCT_COLOR is null");
			return (Criteria) this;
		}

		public Criteria andProductColorIsNotNull() {
			addCriterion("PRODUCT_COLOR is not null");
			return (Criteria) this;
		}

		public Criteria andProductColorEqualTo(String value) {
			addCriterion("PRODUCT_COLOR =", value, "productColor");
			return (Criteria) this;
		}

		public Criteria andProductColorNotEqualTo(String value) {
			addCriterion("PRODUCT_COLOR <>", value, "productColor");
			return (Criteria) this;
		}

		public Criteria andProductColorGreaterThan(String value) {
			addCriterion("PRODUCT_COLOR >", value, "productColor");
			return (Criteria) this;
		}

		public Criteria andProductColorGreaterThanOrEqualTo(String value) {
			addCriterion("PRODUCT_COLOR >=", value, "productColor");
			return (Criteria) this;
		}

		public Criteria andProductColorLessThan(String value) {
			addCriterion("PRODUCT_COLOR <", value, "productColor");
			return (Criteria) this;
		}

		public Criteria andProductColorLessThanOrEqualTo(String value) {
			addCriterion("PRODUCT_COLOR <=", value, "productColor");
			return (Criteria) this;
		}

		public Criteria andProductColorLike(String value) {
			addCriterion("PRODUCT_COLOR like", value, "productColor");
			return (Criteria) this;
		}

		public Criteria andProductColorNotLike(String value) {
			addCriterion("PRODUCT_COLOR not like", value, "productColor");
			return (Criteria) this;
		}

		public Criteria andProductColorIn(List<String> values) {
			addCriterion("PRODUCT_COLOR in", values, "productColor");
			return (Criteria) this;
		}

		public Criteria andProductColorNotIn(List<String> values) {
			addCriterion("PRODUCT_COLOR not in", values, "productColor");
			return (Criteria) this;
		}

		public Criteria andProductColorBetween(String value1, String value2) {
			addCriterion("PRODUCT_COLOR between", value1, value2, "productColor");
			return (Criteria) this;
		}

		public Criteria andProductColorNotBetween(String value1, String value2) {
			addCriterion("PRODUCT_COLOR not between", value1, value2, "productColor");
			return (Criteria) this;
		}

		public Criteria andProductUnitPriceIsNull() {
			addCriterion("PRODUCT_UNIT_PRICE is null");
			return (Criteria) this;
		}

		public Criteria andProductUnitPriceIsNotNull() {
			addCriterion("PRODUCT_UNIT_PRICE is not null");
			return (Criteria) this;
		}

		public Criteria andProductUnitPriceEqualTo(Integer value) {
			addCriterion("PRODUCT_UNIT_PRICE =", value, "productUnitPrice");
			return (Criteria) this;
		}

		public Criteria andProductUnitPriceNotEqualTo(Integer value) {
			addCriterion("PRODUCT_UNIT_PRICE <>", value, "productUnitPrice");
			return (Criteria) this;
		}

		public Criteria andProductUnitPriceGreaterThan(Integer value) {
			addCriterion("PRODUCT_UNIT_PRICE >", value, "productUnitPrice");
			return (Criteria) this;
		}

		public Criteria andProductUnitPriceGreaterThanOrEqualTo(Integer value) {
			addCriterion("PRODUCT_UNIT_PRICE >=", value, "productUnitPrice");
			return (Criteria) this;
		}

		public Criteria andProductUnitPriceLessThan(Integer value) {
			addCriterion("PRODUCT_UNIT_PRICE <", value, "productUnitPrice");
			return (Criteria) this;
		}

		public Criteria andProductUnitPriceLessThanOrEqualTo(Integer value) {
			addCriterion("PRODUCT_UNIT_PRICE <=", value, "productUnitPrice");
			return (Criteria) this;
		}

		public Criteria andProductUnitPriceIn(List<Integer> values) {
			addCriterion("PRODUCT_UNIT_PRICE in", values, "productUnitPrice");
			return (Criteria) this;
		}

		public Criteria andProductUnitPriceNotIn(List<Integer> values) {
			addCriterion("PRODUCT_UNIT_PRICE not in", values, "productUnitPrice");
			return (Criteria) this;
		}

		public Criteria andProductUnitPriceBetween(Integer value1, Integer value2) {
			addCriterion("PRODUCT_UNIT_PRICE between", value1, value2, "productUnitPrice");
			return (Criteria) this;
		}

		public Criteria andProductUnitPriceNotBetween(Integer value1, Integer value2) {
			addCriterion("PRODUCT_UNIT_PRICE not between", value1, value2, "productUnitPrice");
			return (Criteria) this;
		}

		public Criteria andEndOfSaleIsNull() {
			addCriterion("END_OF_SALE is null");
			return (Criteria) this;
		}

		public Criteria andEndOfSaleIsNotNull() {
			addCriterion("END_OF_SALE is not null");
			return (Criteria) this;
		}

		public Criteria andEndOfSaleEqualTo(Boolean value) {
			addCriterion("END_OF_SALE =", value, "endOfSale");
			return (Criteria) this;
		}

		public Criteria andEndOfSaleNotEqualTo(Boolean value) {
			addCriterion("END_OF_SALE <>", value, "endOfSale");
			return (Criteria) this;
		}

		public Criteria andEndOfSaleGreaterThan(Boolean value) {
			addCriterion("END_OF_SALE >", value, "endOfSale");
			return (Criteria) this;
		}

		public Criteria andEndOfSaleGreaterThanOrEqualTo(Boolean value) {
			addCriterion("END_OF_SALE >=", value, "endOfSale");
			return (Criteria) this;
		}

		public Criteria andEndOfSaleLessThan(Boolean value) {
			addCriterion("END_OF_SALE <", value, "endOfSale");
			return (Criteria) this;
		}

		public Criteria andEndOfSaleLessThanOrEqualTo(Boolean value) {
			addCriterion("END_OF_SALE <=", value, "endOfSale");
			return (Criteria) this;
		}

		public Criteria andEndOfSaleIn(List<Boolean> values) {
			addCriterion("END_OF_SALE in", values, "endOfSale");
			return (Criteria) this;
		}

		public Criteria andEndOfSaleNotIn(List<Boolean> values) {
			addCriterion("END_OF_SALE not in", values, "endOfSale");
			return (Criteria) this;
		}

		public Criteria andEndOfSaleBetween(Boolean value1, Boolean value2) {
			addCriterion("END_OF_SALE between", value1, value2, "endOfSale");
			return (Criteria) this;
		}

		public Criteria andEndOfSaleNotBetween(Boolean value1, Boolean value2) {
			addCriterion("END_OF_SALE not between", value1, value2, "endOfSale");
			return (Criteria) this;
		}

		public Criteria andEndOfSaleDateIsNull() {
			addCriterion("END_OF_SALE_DATE is null");
			return (Criteria) this;
		}

		public Criteria andEndOfSaleDateIsNotNull() {
			addCriterion("END_OF_SALE_DATE is not null");
			return (Criteria) this;
		}

		public Criteria andEndOfSaleDateEqualTo(Date value) {
			addCriterion("END_OF_SALE_DATE =", value, "endOfSaleDate");
			return (Criteria) this;
		}

		public Criteria andEndOfSaleDateNotEqualTo(Date value) {
			addCriterion("END_OF_SALE_DATE <>", value, "endOfSaleDate");
			return (Criteria) this;
		}

		public Criteria andEndOfSaleDateGreaterThan(Date value) {
			addCriterion("END_OF_SALE_DATE >", value, "endOfSaleDate");
			return (Criteria) this;
		}

		public Criteria andEndOfSaleDateGreaterThanOrEqualTo(Date value) {
			addCriterion("END_OF_SALE_DATE >=", value, "endOfSaleDate");
			return (Criteria) this;
		}

		public Criteria andEndOfSaleDateLessThan(Date value) {
			addCriterion("END_OF_SALE_DATE <", value, "endOfSaleDate");
			return (Criteria) this;
		}

		public Criteria andEndOfSaleDateLessThanOrEqualTo(Date value) {
			addCriterion("END_OF_SALE_DATE <=", value, "endOfSaleDate");
			return (Criteria) this;
		}

		public Criteria andEndOfSaleDateIn(List<Date> values) {
			addCriterion("END_OF_SALE_DATE in", values, "endOfSaleDate");
			return (Criteria) this;
		}

		public Criteria andEndOfSaleDateNotIn(List<Date> values) {
			addCriterion("END_OF_SALE_DATE not in", values, "endOfSaleDate");
			return (Criteria) this;
		}

		public Criteria andEndOfSaleDateBetween(Date value1, Date value2) {
			addCriterion("END_OF_SALE_DATE between", value1, value2, "endOfSaleDate");
			return (Criteria) this;
		}

		public Criteria andEndOfSaleDateNotBetween(Date value1, Date value2) {
			addCriterion("END_OF_SALE_DATE not between", value1, value2, "endOfSaleDate");
			return (Criteria) this;
		}

		public Criteria andDeletedIsNull() {
			addCriterion("DELETED is null");
			return (Criteria) this;
		}

		public Criteria andDeletedIsNotNull() {
			addCriterion("DELETED is not null");
			return (Criteria) this;
		}

		public Criteria andDeletedEqualTo(Boolean value) {
			addCriterion("DELETED =", value, "deleted");
			return (Criteria) this;
		}

		public Criteria andDeletedNotEqualTo(Boolean value) {
			addCriterion("DELETED <>", value, "deleted");
			return (Criteria) this;
		}

		public Criteria andDeletedGreaterThan(Boolean value) {
			addCriterion("DELETED >", value, "deleted");
			return (Criteria) this;
		}

		public Criteria andDeletedGreaterThanOrEqualTo(Boolean value) {
			addCriterion("DELETED >=", value, "deleted");
			return (Criteria) this;
		}

		public Criteria andDeletedLessThan(Boolean value) {
			addCriterion("DELETED <", value, "deleted");
			return (Criteria) this;
		}

		public Criteria andDeletedLessThanOrEqualTo(Boolean value) {
			addCriterion("DELETED <=", value, "deleted");
			return (Criteria) this;
		}

		public Criteria andDeletedIn(List<Boolean> values) {
			addCriterion("DELETED in", values, "deleted");
			return (Criteria) this;
		}

		public Criteria andDeletedNotIn(List<Boolean> values) {
			addCriterion("DELETED not in", values, "deleted");
			return (Criteria) this;
		}

		public Criteria andDeletedBetween(Boolean value1, Boolean value2) {
			addCriterion("DELETED between", value1, value2, "deleted");
			return (Criteria) this;
		}

		public Criteria andDeletedNotBetween(Boolean value1, Boolean value2) {
			addCriterion("DELETED not between", value1, value2, "deleted");
			return (Criteria) this;
		}

		public Criteria andEnterDateIsNull() {
			addCriterion("ENTER_DATE is null");
			return (Criteria) this;
		}

		public Criteria andEnterDateIsNotNull() {
			addCriterion("ENTER_DATE is not null");
			return (Criteria) this;
		}

		public Criteria andEnterDateEqualTo(Date value) {
			addCriterion("ENTER_DATE =", value, "enterDate");
			return (Criteria) this;
		}

		public Criteria andEnterDateNotEqualTo(Date value) {
			addCriterion("ENTER_DATE <>", value, "enterDate");
			return (Criteria) this;
		}

		public Criteria andEnterDateGreaterThan(Date value) {
			addCriterion("ENTER_DATE >", value, "enterDate");
			return (Criteria) this;
		}

		public Criteria andEnterDateGreaterThanOrEqualTo(Date value) {
			addCriterion("ENTER_DATE >=", value, "enterDate");
			return (Criteria) this;
		}

		public Criteria andEnterDateLessThan(Date value) {
			addCriterion("ENTER_DATE <", value, "enterDate");
			return (Criteria) this;
		}

		public Criteria andEnterDateLessThanOrEqualTo(Date value) {
			addCriterion("ENTER_DATE <=", value, "enterDate");
			return (Criteria) this;
		}

		public Criteria andEnterDateIn(List<Date> values) {
			addCriterion("ENTER_DATE in", values, "enterDate");
			return (Criteria) this;
		}

		public Criteria andEnterDateNotIn(List<Date> values) {
			addCriterion("ENTER_DATE not in", values, "enterDate");
			return (Criteria) this;
		}

		public Criteria andEnterDateBetween(Date value1, Date value2) {
			addCriterion("ENTER_DATE between", value1, value2, "enterDate");
			return (Criteria) this;
		}

		public Criteria andEnterDateNotBetween(Date value1, Date value2) {
			addCriterion("ENTER_DATE not between", value1, value2, "enterDate");
			return (Criteria) this;
		}

		public Criteria andEnterUserIsNull() {
			addCriterion("ENTER_USER is null");
			return (Criteria) this;
		}

		public Criteria andEnterUserIsNotNull() {
			addCriterion("ENTER_USER is not null");
			return (Criteria) this;
		}

		public Criteria andEnterUserEqualTo(String value) {
			addCriterion("ENTER_USER =", value, "enterUser");
			return (Criteria) this;
		}

		public Criteria andEnterUserNotEqualTo(String value) {
			addCriterion("ENTER_USER <>", value, "enterUser");
			return (Criteria) this;
		}

		public Criteria andEnterUserGreaterThan(String value) {
			addCriterion("ENTER_USER >", value, "enterUser");
			return (Criteria) this;
		}

		public Criteria andEnterUserGreaterThanOrEqualTo(String value) {
			addCriterion("ENTER_USER >=", value, "enterUser");
			return (Criteria) this;
		}

		public Criteria andEnterUserLessThan(String value) {
			addCriterion("ENTER_USER <", value, "enterUser");
			return (Criteria) this;
		}

		public Criteria andEnterUserLessThanOrEqualTo(String value) {
			addCriterion("ENTER_USER <=", value, "enterUser");
			return (Criteria) this;
		}

		public Criteria andEnterUserLike(String value) {
			addCriterion("ENTER_USER like", value, "enterUser");
			return (Criteria) this;
		}

		public Criteria andEnterUserNotLike(String value) {
			addCriterion("ENTER_USER not like", value, "enterUser");
			return (Criteria) this;
		}

		public Criteria andEnterUserIn(List<String> values) {
			addCriterion("ENTER_USER in", values, "enterUser");
			return (Criteria) this;
		}

		public Criteria andEnterUserNotIn(List<String> values) {
			addCriterion("ENTER_USER not in", values, "enterUser");
			return (Criteria) this;
		}

		public Criteria andEnterUserBetween(String value1, String value2) {
			addCriterion("ENTER_USER between", value1, value2, "enterUser");
			return (Criteria) this;
		}

		public Criteria andEnterUserNotBetween(String value1, String value2) {
			addCriterion("ENTER_USER not between", value1, value2, "enterUser");
			return (Criteria) this;
		}

		public Criteria andUpdateDateIsNull() {
			addCriterion("UPDATE_DATE is null");
			return (Criteria) this;
		}

		public Criteria andUpdateDateIsNotNull() {
			addCriterion("UPDATE_DATE is not null");
			return (Criteria) this;
		}

		public Criteria andUpdateDateEqualTo(Date value) {
			addCriterion("UPDATE_DATE =", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateNotEqualTo(Date value) {
			addCriterion("UPDATE_DATE <>", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateGreaterThan(Date value) {
			addCriterion("UPDATE_DATE >", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
			addCriterion("UPDATE_DATE >=", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateLessThan(Date value) {
			addCriterion("UPDATE_DATE <", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
			addCriterion("UPDATE_DATE <=", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateIn(List<Date> values) {
			addCriterion("UPDATE_DATE in", values, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateNotIn(List<Date> values) {
			addCriterion("UPDATE_DATE not in", values, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateBetween(Date value1, Date value2) {
			addCriterion("UPDATE_DATE between", value1, value2, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
			addCriterion("UPDATE_DATE not between", value1, value2, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateUserIsNull() {
			addCriterion("UPDATE_USER is null");
			return (Criteria) this;
		}

		public Criteria andUpdateUserIsNotNull() {
			addCriterion("UPDATE_USER is not null");
			return (Criteria) this;
		}

		public Criteria andUpdateUserEqualTo(String value) {
			addCriterion("UPDATE_USER =", value, "updateUser");
			return (Criteria) this;
		}

		public Criteria andUpdateUserNotEqualTo(String value) {
			addCriterion("UPDATE_USER <>", value, "updateUser");
			return (Criteria) this;
		}

		public Criteria andUpdateUserGreaterThan(String value) {
			addCriterion("UPDATE_USER >", value, "updateUser");
			return (Criteria) this;
		}

		public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
			addCriterion("UPDATE_USER >=", value, "updateUser");
			return (Criteria) this;
		}

		public Criteria andUpdateUserLessThan(String value) {
			addCriterion("UPDATE_USER <", value, "updateUser");
			return (Criteria) this;
		}

		public Criteria andUpdateUserLessThanOrEqualTo(String value) {
			addCriterion("UPDATE_USER <=", value, "updateUser");
			return (Criteria) this;
		}

		public Criteria andUpdateUserLike(String value) {
			addCriterion("UPDATE_USER like", value, "updateUser");
			return (Criteria) this;
		}

		public Criteria andUpdateUserNotLike(String value) {
			addCriterion("UPDATE_USER not like", value, "updateUser");
			return (Criteria) this;
		}

		public Criteria andUpdateUserIn(List<String> values) {
			addCriterion("UPDATE_USER in", values, "updateUser");
			return (Criteria) this;
		}

		public Criteria andUpdateUserNotIn(List<String> values) {
			addCriterion("UPDATE_USER not in", values, "updateUser");
			return (Criteria) this;
		}

		public Criteria andUpdateUserBetween(String value1, String value2) {
			addCriterion("UPDATE_USER between", value1, value2, "updateUser");
			return (Criteria) this;
		}

		public Criteria andUpdateUserNotBetween(String value1, String value2) {
			addCriterion("UPDATE_USER not between", value1, value2, "updateUser");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table PRODUCT_MST
	 * @mbg.generated  Sat Oct 19 23:35:57 JST 2019
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table PRODUCT_MST
     *
     * @mbg.generated do_not_delete_during_merge Fri Oct 18 08:45:46 JST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}