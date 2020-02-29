package com.example.demo.entity.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MenuMstExample {
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table MENU_MST
	 * @mbg.generated  Sat Feb 29 16:49:29 JST 2020
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table MENU_MST
	 * @mbg.generated  Sat Feb 29 16:49:29 JST 2020
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table MENU_MST
	 * @mbg.generated  Sat Feb 29 16:49:29 JST 2020
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table MENU_MST
	 * @mbg.generated  Sat Feb 29 16:49:29 JST 2020
	 */
	public MenuMstExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table MENU_MST
	 * @mbg.generated  Sat Feb 29 16:49:29 JST 2020
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table MENU_MST
	 * @mbg.generated  Sat Feb 29 16:49:29 JST 2020
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table MENU_MST
	 * @mbg.generated  Sat Feb 29 16:49:29 JST 2020
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table MENU_MST
	 * @mbg.generated  Sat Feb 29 16:49:29 JST 2020
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table MENU_MST
	 * @mbg.generated  Sat Feb 29 16:49:29 JST 2020
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table MENU_MST
	 * @mbg.generated  Sat Feb 29 16:49:29 JST 2020
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table MENU_MST
	 * @mbg.generated  Sat Feb 29 16:49:29 JST 2020
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table MENU_MST
	 * @mbg.generated  Sat Feb 29 16:49:29 JST 2020
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table MENU_MST
	 * @mbg.generated  Sat Feb 29 16:49:29 JST 2020
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table MENU_MST
	 * @mbg.generated  Sat Feb 29 16:49:29 JST 2020
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table MENU_MST
	 * @mbg.generated  Sat Feb 29 16:49:29 JST 2020
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

		public Criteria andMenuSeqIsNull() {
			addCriterion("MENU_SEQ is null");
			return (Criteria) this;
		}

		public Criteria andMenuSeqIsNotNull() {
			addCriterion("MENU_SEQ is not null");
			return (Criteria) this;
		}

		public Criteria andMenuSeqEqualTo(Long value) {
			addCriterion("MENU_SEQ =", value, "menuSeq");
			return (Criteria) this;
		}

		public Criteria andMenuSeqNotEqualTo(Long value) {
			addCriterion("MENU_SEQ <>", value, "menuSeq");
			return (Criteria) this;
		}

		public Criteria andMenuSeqGreaterThan(Long value) {
			addCriterion("MENU_SEQ >", value, "menuSeq");
			return (Criteria) this;
		}

		public Criteria andMenuSeqGreaterThanOrEqualTo(Long value) {
			addCriterion("MENU_SEQ >=", value, "menuSeq");
			return (Criteria) this;
		}

		public Criteria andMenuSeqLessThan(Long value) {
			addCriterion("MENU_SEQ <", value, "menuSeq");
			return (Criteria) this;
		}

		public Criteria andMenuSeqLessThanOrEqualTo(Long value) {
			addCriterion("MENU_SEQ <=", value, "menuSeq");
			return (Criteria) this;
		}

		public Criteria andMenuSeqIn(List<Long> values) {
			addCriterion("MENU_SEQ in", values, "menuSeq");
			return (Criteria) this;
		}

		public Criteria andMenuSeqNotIn(List<Long> values) {
			addCriterion("MENU_SEQ not in", values, "menuSeq");
			return (Criteria) this;
		}

		public Criteria andMenuSeqBetween(Long value1, Long value2) {
			addCriterion("MENU_SEQ between", value1, value2, "menuSeq");
			return (Criteria) this;
		}

		public Criteria andMenuSeqNotBetween(Long value1, Long value2) {
			addCriterion("MENU_SEQ not between", value1, value2, "menuSeq");
			return (Criteria) this;
		}

		public Criteria andMenuCodeIsNull() {
			addCriterion("MENU_CODE is null");
			return (Criteria) this;
		}

		public Criteria andMenuCodeIsNotNull() {
			addCriterion("MENU_CODE is not null");
			return (Criteria) this;
		}

		public Criteria andMenuCodeEqualTo(String value) {
			addCriterion("MENU_CODE =", value, "menuCode");
			return (Criteria) this;
		}

		public Criteria andMenuCodeNotEqualTo(String value) {
			addCriterion("MENU_CODE <>", value, "menuCode");
			return (Criteria) this;
		}

		public Criteria andMenuCodeGreaterThan(String value) {
			addCriterion("MENU_CODE >", value, "menuCode");
			return (Criteria) this;
		}

		public Criteria andMenuCodeGreaterThanOrEqualTo(String value) {
			addCriterion("MENU_CODE >=", value, "menuCode");
			return (Criteria) this;
		}

		public Criteria andMenuCodeLessThan(String value) {
			addCriterion("MENU_CODE <", value, "menuCode");
			return (Criteria) this;
		}

		public Criteria andMenuCodeLessThanOrEqualTo(String value) {
			addCriterion("MENU_CODE <=", value, "menuCode");
			return (Criteria) this;
		}

		public Criteria andMenuCodeLike(String value) {
			addCriterion("MENU_CODE like", value, "menuCode");
			return (Criteria) this;
		}

		public Criteria andMenuCodeNotLike(String value) {
			addCriterion("MENU_CODE not like", value, "menuCode");
			return (Criteria) this;
		}

		public Criteria andMenuCodeIn(List<String> values) {
			addCriterion("MENU_CODE in", values, "menuCode");
			return (Criteria) this;
		}

		public Criteria andMenuCodeNotIn(List<String> values) {
			addCriterion("MENU_CODE not in", values, "menuCode");
			return (Criteria) this;
		}

		public Criteria andMenuCodeBetween(String value1, String value2) {
			addCriterion("MENU_CODE between", value1, value2, "menuCode");
			return (Criteria) this;
		}

		public Criteria andMenuCodeNotBetween(String value1, String value2) {
			addCriterion("MENU_CODE not between", value1, value2, "menuCode");
			return (Criteria) this;
		}

		public Criteria andMenuOrderIsNull() {
			addCriterion("MENU_ORDER is null");
			return (Criteria) this;
		}

		public Criteria andMenuOrderIsNotNull() {
			addCriterion("MENU_ORDER is not null");
			return (Criteria) this;
		}

		public Criteria andMenuOrderEqualTo(Short value) {
			addCriterion("MENU_ORDER =", value, "menuOrder");
			return (Criteria) this;
		}

		public Criteria andMenuOrderNotEqualTo(Short value) {
			addCriterion("MENU_ORDER <>", value, "menuOrder");
			return (Criteria) this;
		}

		public Criteria andMenuOrderGreaterThan(Short value) {
			addCriterion("MENU_ORDER >", value, "menuOrder");
			return (Criteria) this;
		}

		public Criteria andMenuOrderGreaterThanOrEqualTo(Short value) {
			addCriterion("MENU_ORDER >=", value, "menuOrder");
			return (Criteria) this;
		}

		public Criteria andMenuOrderLessThan(Short value) {
			addCriterion("MENU_ORDER <", value, "menuOrder");
			return (Criteria) this;
		}

		public Criteria andMenuOrderLessThanOrEqualTo(Short value) {
			addCriterion("MENU_ORDER <=", value, "menuOrder");
			return (Criteria) this;
		}

		public Criteria andMenuOrderIn(List<Short> values) {
			addCriterion("MENU_ORDER in", values, "menuOrder");
			return (Criteria) this;
		}

		public Criteria andMenuOrderNotIn(List<Short> values) {
			addCriterion("MENU_ORDER not in", values, "menuOrder");
			return (Criteria) this;
		}

		public Criteria andMenuOrderBetween(Short value1, Short value2) {
			addCriterion("MENU_ORDER between", value1, value2, "menuOrder");
			return (Criteria) this;
		}

		public Criteria andMenuOrderNotBetween(Short value1, Short value2) {
			addCriterion("MENU_ORDER not between", value1, value2, "menuOrder");
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

		public Criteria andEnterDateEqualTo(LocalDateTime value) {
			addCriterion("ENTER_DATE =", value, "enterDate");
			return (Criteria) this;
		}

		public Criteria andEnterDateNotEqualTo(LocalDateTime value) {
			addCriterion("ENTER_DATE <>", value, "enterDate");
			return (Criteria) this;
		}

		public Criteria andEnterDateGreaterThan(LocalDateTime value) {
			addCriterion("ENTER_DATE >", value, "enterDate");
			return (Criteria) this;
		}

		public Criteria andEnterDateGreaterThanOrEqualTo(LocalDateTime value) {
			addCriterion("ENTER_DATE >=", value, "enterDate");
			return (Criteria) this;
		}

		public Criteria andEnterDateLessThan(LocalDateTime value) {
			addCriterion("ENTER_DATE <", value, "enterDate");
			return (Criteria) this;
		}

		public Criteria andEnterDateLessThanOrEqualTo(LocalDateTime value) {
			addCriterion("ENTER_DATE <=", value, "enterDate");
			return (Criteria) this;
		}

		public Criteria andEnterDateIn(List<LocalDateTime> values) {
			addCriterion("ENTER_DATE in", values, "enterDate");
			return (Criteria) this;
		}

		public Criteria andEnterDateNotIn(List<LocalDateTime> values) {
			addCriterion("ENTER_DATE not in", values, "enterDate");
			return (Criteria) this;
		}

		public Criteria andEnterDateBetween(LocalDateTime value1, LocalDateTime value2) {
			addCriterion("ENTER_DATE between", value1, value2, "enterDate");
			return (Criteria) this;
		}

		public Criteria andEnterDateNotBetween(LocalDateTime value1, LocalDateTime value2) {
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

		public Criteria andUpdateDateEqualTo(LocalDateTime value) {
			addCriterion("UPDATE_DATE =", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateNotEqualTo(LocalDateTime value) {
			addCriterion("UPDATE_DATE <>", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateGreaterThan(LocalDateTime value) {
			addCriterion("UPDATE_DATE >", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateGreaterThanOrEqualTo(LocalDateTime value) {
			addCriterion("UPDATE_DATE >=", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateLessThan(LocalDateTime value) {
			addCriterion("UPDATE_DATE <", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateLessThanOrEqualTo(LocalDateTime value) {
			addCriterion("UPDATE_DATE <=", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateIn(List<LocalDateTime> values) {
			addCriterion("UPDATE_DATE in", values, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateNotIn(List<LocalDateTime> values) {
			addCriterion("UPDATE_DATE not in", values, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateBetween(LocalDateTime value1, LocalDateTime value2) {
			addCriterion("UPDATE_DATE between", value1, value2, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateNotBetween(LocalDateTime value1, LocalDateTime value2) {
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
	 * This class was generated by MyBatis Generator. This class corresponds to the database table MENU_MST
	 * @mbg.generated  Sat Feb 29 16:49:29 JST 2020
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
	 * This class corresponds to the database table MENU_MST
	 *
	 * @mbg.generated do_not_delete_during_merge Fri Oct 18 08:45:46 JST 2019
	 */
	public static class Criteria extends GeneratedCriteria {

		protected Criteria() {
			super();
		}
	}
}