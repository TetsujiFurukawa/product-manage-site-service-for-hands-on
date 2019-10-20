package com.example.demo.entity.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductPurchaseTblExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table PRODUCT_PURCHASE_TBL
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table PRODUCT_PURCHASE_TBL
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table PRODUCT_PURCHASE_TBL
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT_PURCHASE_TBL
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	public ProductPurchaseTblExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT_PURCHASE_TBL
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT_PURCHASE_TBL
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT_PURCHASE_TBL
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT_PURCHASE_TBL
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT_PURCHASE_TBL
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT_PURCHASE_TBL
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT_PURCHASE_TBL
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT_PURCHASE_TBL
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT_PURCHASE_TBL
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT_PURCHASE_TBL
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table PRODUCT_PURCHASE_TBL
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
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

		public Criteria andProductPurchaseSeqIsNull() {
			addCriterion("PRODUCT_PURCHASE_SEQ is null");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseSeqIsNotNull() {
			addCriterion("PRODUCT_PURCHASE_SEQ is not null");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseSeqEqualTo(Long value) {
			addCriterion("PRODUCT_PURCHASE_SEQ =", value, "productPurchaseSeq");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseSeqNotEqualTo(Long value) {
			addCriterion("PRODUCT_PURCHASE_SEQ <>", value, "productPurchaseSeq");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseSeqGreaterThan(Long value) {
			addCriterion("PRODUCT_PURCHASE_SEQ >", value, "productPurchaseSeq");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseSeqGreaterThanOrEqualTo(Long value) {
			addCriterion("PRODUCT_PURCHASE_SEQ >=", value, "productPurchaseSeq");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseSeqLessThan(Long value) {
			addCriterion("PRODUCT_PURCHASE_SEQ <", value, "productPurchaseSeq");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseSeqLessThanOrEqualTo(Long value) {
			addCriterion("PRODUCT_PURCHASE_SEQ <=", value, "productPurchaseSeq");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseSeqIn(List<Long> values) {
			addCriterion("PRODUCT_PURCHASE_SEQ in", values, "productPurchaseSeq");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseSeqNotIn(List<Long> values) {
			addCriterion("PRODUCT_PURCHASE_SEQ not in", values, "productPurchaseSeq");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseSeqBetween(Long value1, Long value2) {
			addCriterion("PRODUCT_PURCHASE_SEQ between", value1, value2, "productPurchaseSeq");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseSeqNotBetween(Long value1, Long value2) {
			addCriterion("PRODUCT_PURCHASE_SEQ not between", value1, value2, "productPurchaseSeq");
			return (Criteria) this;
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

		public Criteria andProductPurchaseNameIsNull() {
			addCriterion("PRODUCT_PURCHASE_NAME is null");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseNameIsNotNull() {
			addCriterion("PRODUCT_PURCHASE_NAME is not null");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseNameEqualTo(String value) {
			addCriterion("PRODUCT_PURCHASE_NAME =", value, "productPurchaseName");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseNameNotEqualTo(String value) {
			addCriterion("PRODUCT_PURCHASE_NAME <>", value, "productPurchaseName");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseNameGreaterThan(String value) {
			addCriterion("PRODUCT_PURCHASE_NAME >", value, "productPurchaseName");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseNameGreaterThanOrEqualTo(String value) {
			addCriterion("PRODUCT_PURCHASE_NAME >=", value, "productPurchaseName");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseNameLessThan(String value) {
			addCriterion("PRODUCT_PURCHASE_NAME <", value, "productPurchaseName");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseNameLessThanOrEqualTo(String value) {
			addCriterion("PRODUCT_PURCHASE_NAME <=", value, "productPurchaseName");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseNameLike(String value) {
			addCriterion("PRODUCT_PURCHASE_NAME like", value, "productPurchaseName");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseNameNotLike(String value) {
			addCriterion("PRODUCT_PURCHASE_NAME not like", value, "productPurchaseName");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseNameIn(List<String> values) {
			addCriterion("PRODUCT_PURCHASE_NAME in", values, "productPurchaseName");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseNameNotIn(List<String> values) {
			addCriterion("PRODUCT_PURCHASE_NAME not in", values, "productPurchaseName");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseNameBetween(String value1, String value2) {
			addCriterion("PRODUCT_PURCHASE_NAME between", value1, value2, "productPurchaseName");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseNameNotBetween(String value1, String value2) {
			addCriterion("PRODUCT_PURCHASE_NAME not between", value1, value2, "productPurchaseName");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseUnitPriceIsNull() {
			addCriterion("PRODUCT_PURCHASE_UNIT_PRICE is null");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseUnitPriceIsNotNull() {
			addCriterion("PRODUCT_PURCHASE_UNIT_PRICE is not null");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseUnitPriceEqualTo(Integer value) {
			addCriterion("PRODUCT_PURCHASE_UNIT_PRICE =", value, "productPurchaseUnitPrice");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseUnitPriceNotEqualTo(Integer value) {
			addCriterion("PRODUCT_PURCHASE_UNIT_PRICE <>", value, "productPurchaseUnitPrice");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseUnitPriceGreaterThan(Integer value) {
			addCriterion("PRODUCT_PURCHASE_UNIT_PRICE >", value, "productPurchaseUnitPrice");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseUnitPriceGreaterThanOrEqualTo(Integer value) {
			addCriterion("PRODUCT_PURCHASE_UNIT_PRICE >=", value, "productPurchaseUnitPrice");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseUnitPriceLessThan(Integer value) {
			addCriterion("PRODUCT_PURCHASE_UNIT_PRICE <", value, "productPurchaseUnitPrice");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseUnitPriceLessThanOrEqualTo(Integer value) {
			addCriterion("PRODUCT_PURCHASE_UNIT_PRICE <=", value, "productPurchaseUnitPrice");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseUnitPriceIn(List<Integer> values) {
			addCriterion("PRODUCT_PURCHASE_UNIT_PRICE in", values, "productPurchaseUnitPrice");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseUnitPriceNotIn(List<Integer> values) {
			addCriterion("PRODUCT_PURCHASE_UNIT_PRICE not in", values, "productPurchaseUnitPrice");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseUnitPriceBetween(Integer value1, Integer value2) {
			addCriterion("PRODUCT_PURCHASE_UNIT_PRICE between", value1, value2, "productPurchaseUnitPrice");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseUnitPriceNotBetween(Integer value1, Integer value2) {
			addCriterion("PRODUCT_PURCHASE_UNIT_PRICE not between", value1, value2, "productPurchaseUnitPrice");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseQuantityIsNull() {
			addCriterion("PRODUCT_PURCHASE_QUANTITY is null");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseQuantityIsNotNull() {
			addCriterion("PRODUCT_PURCHASE_QUANTITY is not null");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseQuantityEqualTo(Integer value) {
			addCriterion("PRODUCT_PURCHASE_QUANTITY =", value, "productPurchaseQuantity");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseQuantityNotEqualTo(Integer value) {
			addCriterion("PRODUCT_PURCHASE_QUANTITY <>", value, "productPurchaseQuantity");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseQuantityGreaterThan(Integer value) {
			addCriterion("PRODUCT_PURCHASE_QUANTITY >", value, "productPurchaseQuantity");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseQuantityGreaterThanOrEqualTo(Integer value) {
			addCriterion("PRODUCT_PURCHASE_QUANTITY >=", value, "productPurchaseQuantity");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseQuantityLessThan(Integer value) {
			addCriterion("PRODUCT_PURCHASE_QUANTITY <", value, "productPurchaseQuantity");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseQuantityLessThanOrEqualTo(Integer value) {
			addCriterion("PRODUCT_PURCHASE_QUANTITY <=", value, "productPurchaseQuantity");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseQuantityIn(List<Integer> values) {
			addCriterion("PRODUCT_PURCHASE_QUANTITY in", values, "productPurchaseQuantity");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseQuantityNotIn(List<Integer> values) {
			addCriterion("PRODUCT_PURCHASE_QUANTITY not in", values, "productPurchaseQuantity");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseQuantityBetween(Integer value1, Integer value2) {
			addCriterion("PRODUCT_PURCHASE_QUANTITY between", value1, value2, "productPurchaseQuantity");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseQuantityNotBetween(Integer value1, Integer value2) {
			addCriterion("PRODUCT_PURCHASE_QUANTITY not between", value1, value2, "productPurchaseQuantity");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseAmountIsNull() {
			addCriterion("PRODUCT_PURCHASE_AMOUNT is null");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseAmountIsNotNull() {
			addCriterion("PRODUCT_PURCHASE_AMOUNT is not null");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseAmountEqualTo(Integer value) {
			addCriterion("PRODUCT_PURCHASE_AMOUNT =", value, "productPurchaseAmount");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseAmountNotEqualTo(Integer value) {
			addCriterion("PRODUCT_PURCHASE_AMOUNT <>", value, "productPurchaseAmount");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseAmountGreaterThan(Integer value) {
			addCriterion("PRODUCT_PURCHASE_AMOUNT >", value, "productPurchaseAmount");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseAmountGreaterThanOrEqualTo(Integer value) {
			addCriterion("PRODUCT_PURCHASE_AMOUNT >=", value, "productPurchaseAmount");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseAmountLessThan(Integer value) {
			addCriterion("PRODUCT_PURCHASE_AMOUNT <", value, "productPurchaseAmount");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseAmountLessThanOrEqualTo(Integer value) {
			addCriterion("PRODUCT_PURCHASE_AMOUNT <=", value, "productPurchaseAmount");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseAmountIn(List<Integer> values) {
			addCriterion("PRODUCT_PURCHASE_AMOUNT in", values, "productPurchaseAmount");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseAmountNotIn(List<Integer> values) {
			addCriterion("PRODUCT_PURCHASE_AMOUNT not in", values, "productPurchaseAmount");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseAmountBetween(Integer value1, Integer value2) {
			addCriterion("PRODUCT_PURCHASE_AMOUNT between", value1, value2, "productPurchaseAmount");
			return (Criteria) this;
		}

		public Criteria andProductPurchaseAmountNotBetween(Integer value1, Integer value2) {
			addCriterion("PRODUCT_PURCHASE_AMOUNT not between", value1, value2, "productPurchaseAmount");
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
	 * This class was generated by MyBatis Generator. This class corresponds to the database table PRODUCT_PURCHASE_TBL
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
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
     * This class corresponds to the database table PRODUCT_PURCHASE_TBL
     *
     * @mbg.generated do_not_delete_during_merge Fri Oct 18 08:45:46 JST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}