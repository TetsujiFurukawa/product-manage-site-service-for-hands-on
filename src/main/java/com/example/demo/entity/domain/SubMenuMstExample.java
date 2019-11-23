package com.example.demo.entity.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SubMenuMstExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table SUB_MENU_MST
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table SUB_MENU_MST
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table SUB_MENU_MST
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SUB_MENU_MST
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	public SubMenuMstExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SUB_MENU_MST
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SUB_MENU_MST
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SUB_MENU_MST
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SUB_MENU_MST
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SUB_MENU_MST
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SUB_MENU_MST
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SUB_MENU_MST
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SUB_MENU_MST
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SUB_MENU_MST
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SUB_MENU_MST
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table SUB_MENU_MST
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
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

		public Criteria andSubMenuSeqIsNull() {
			addCriterion("SUB_MENU_SEQ is null");
			return (Criteria) this;
		}

		public Criteria andSubMenuSeqIsNotNull() {
			addCriterion("SUB_MENU_SEQ is not null");
			return (Criteria) this;
		}

		public Criteria andSubMenuSeqEqualTo(Long value) {
			addCriterion("SUB_MENU_SEQ =", value, "subMenuSeq");
			return (Criteria) this;
		}

		public Criteria andSubMenuSeqNotEqualTo(Long value) {
			addCriterion("SUB_MENU_SEQ <>", value, "subMenuSeq");
			return (Criteria) this;
		}

		public Criteria andSubMenuSeqGreaterThan(Long value) {
			addCriterion("SUB_MENU_SEQ >", value, "subMenuSeq");
			return (Criteria) this;
		}

		public Criteria andSubMenuSeqGreaterThanOrEqualTo(Long value) {
			addCriterion("SUB_MENU_SEQ >=", value, "subMenuSeq");
			return (Criteria) this;
		}

		public Criteria andSubMenuSeqLessThan(Long value) {
			addCriterion("SUB_MENU_SEQ <", value, "subMenuSeq");
			return (Criteria) this;
		}

		public Criteria andSubMenuSeqLessThanOrEqualTo(Long value) {
			addCriterion("SUB_MENU_SEQ <=", value, "subMenuSeq");
			return (Criteria) this;
		}

		public Criteria andSubMenuSeqIn(List<Long> values) {
			addCriterion("SUB_MENU_SEQ in", values, "subMenuSeq");
			return (Criteria) this;
		}

		public Criteria andSubMenuSeqNotIn(List<Long> values) {
			addCriterion("SUB_MENU_SEQ not in", values, "subMenuSeq");
			return (Criteria) this;
		}

		public Criteria andSubMenuSeqBetween(Long value1, Long value2) {
			addCriterion("SUB_MENU_SEQ between", value1, value2, "subMenuSeq");
			return (Criteria) this;
		}

		public Criteria andSubMenuSeqNotBetween(Long value1, Long value2) {
			addCriterion("SUB_MENU_SEQ not between", value1, value2, "subMenuSeq");
			return (Criteria) this;
		}

		public Criteria andSubMenuCodeIsNull() {
			addCriterion("SUB_MENU_CODE is null");
			return (Criteria) this;
		}

		public Criteria andSubMenuCodeIsNotNull() {
			addCriterion("SUB_MENU_CODE is not null");
			return (Criteria) this;
		}

		public Criteria andSubMenuCodeEqualTo(String value) {
			addCriterion("SUB_MENU_CODE =", value, "subMenuCode");
			return (Criteria) this;
		}

		public Criteria andSubMenuCodeNotEqualTo(String value) {
			addCriterion("SUB_MENU_CODE <>", value, "subMenuCode");
			return (Criteria) this;
		}

		public Criteria andSubMenuCodeGreaterThan(String value) {
			addCriterion("SUB_MENU_CODE >", value, "subMenuCode");
			return (Criteria) this;
		}

		public Criteria andSubMenuCodeGreaterThanOrEqualTo(String value) {
			addCriterion("SUB_MENU_CODE >=", value, "subMenuCode");
			return (Criteria) this;
		}

		public Criteria andSubMenuCodeLessThan(String value) {
			addCriterion("SUB_MENU_CODE <", value, "subMenuCode");
			return (Criteria) this;
		}

		public Criteria andSubMenuCodeLessThanOrEqualTo(String value) {
			addCriterion("SUB_MENU_CODE <=", value, "subMenuCode");
			return (Criteria) this;
		}

		public Criteria andSubMenuCodeLike(String value) {
			addCriterion("SUB_MENU_CODE like", value, "subMenuCode");
			return (Criteria) this;
		}

		public Criteria andSubMenuCodeNotLike(String value) {
			addCriterion("SUB_MENU_CODE not like", value, "subMenuCode");
			return (Criteria) this;
		}

		public Criteria andSubMenuCodeIn(List<String> values) {
			addCriterion("SUB_MENU_CODE in", values, "subMenuCode");
			return (Criteria) this;
		}

		public Criteria andSubMenuCodeNotIn(List<String> values) {
			addCriterion("SUB_MENU_CODE not in", values, "subMenuCode");
			return (Criteria) this;
		}

		public Criteria andSubMenuCodeBetween(String value1, String value2) {
			addCriterion("SUB_MENU_CODE between", value1, value2, "subMenuCode");
			return (Criteria) this;
		}

		public Criteria andSubMenuCodeNotBetween(String value1, String value2) {
			addCriterion("SUB_MENU_CODE not between", value1, value2, "subMenuCode");
			return (Criteria) this;
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

		public Criteria andSubMenuRollIsNull() {
			addCriterion("SUB_MENU_ROLL is null");
			return (Criteria) this;
		}

		public Criteria andSubMenuRollIsNotNull() {
			addCriterion("SUB_MENU_ROLL is not null");
			return (Criteria) this;
		}

		public Criteria andSubMenuRollEqualTo(String value) {
			addCriterion("SUB_MENU_ROLL =", value, "subMenuRoll");
			return (Criteria) this;
		}

		public Criteria andSubMenuRollNotEqualTo(String value) {
			addCriterion("SUB_MENU_ROLL <>", value, "subMenuRoll");
			return (Criteria) this;
		}

		public Criteria andSubMenuRollGreaterThan(String value) {
			addCriterion("SUB_MENU_ROLL >", value, "subMenuRoll");
			return (Criteria) this;
		}

		public Criteria andSubMenuRollGreaterThanOrEqualTo(String value) {
			addCriterion("SUB_MENU_ROLL >=", value, "subMenuRoll");
			return (Criteria) this;
		}

		public Criteria andSubMenuRollLessThan(String value) {
			addCriterion("SUB_MENU_ROLL <", value, "subMenuRoll");
			return (Criteria) this;
		}

		public Criteria andSubMenuRollLessThanOrEqualTo(String value) {
			addCriterion("SUB_MENU_ROLL <=", value, "subMenuRoll");
			return (Criteria) this;
		}

		public Criteria andSubMenuRollLike(String value) {
			addCriterion("SUB_MENU_ROLL like", value, "subMenuRoll");
			return (Criteria) this;
		}

		public Criteria andSubMenuRollNotLike(String value) {
			addCriterion("SUB_MENU_ROLL not like", value, "subMenuRoll");
			return (Criteria) this;
		}

		public Criteria andSubMenuRollIn(List<String> values) {
			addCriterion("SUB_MENU_ROLL in", values, "subMenuRoll");
			return (Criteria) this;
		}

		public Criteria andSubMenuRollNotIn(List<String> values) {
			addCriterion("SUB_MENU_ROLL not in", values, "subMenuRoll");
			return (Criteria) this;
		}

		public Criteria andSubMenuRollBetween(String value1, String value2) {
			addCriterion("SUB_MENU_ROLL between", value1, value2, "subMenuRoll");
			return (Criteria) this;
		}

		public Criteria andSubMenuRollNotBetween(String value1, String value2) {
			addCriterion("SUB_MENU_ROLL not between", value1, value2, "subMenuRoll");
			return (Criteria) this;
		}

		public Criteria andSubMenuOrderIsNull() {
			addCriterion("SUB_MENU_ORDER is null");
			return (Criteria) this;
		}

		public Criteria andSubMenuOrderIsNotNull() {
			addCriterion("SUB_MENU_ORDER is not null");
			return (Criteria) this;
		}

		public Criteria andSubMenuOrderEqualTo(Short value) {
			addCriterion("SUB_MENU_ORDER =", value, "subMenuOrder");
			return (Criteria) this;
		}

		public Criteria andSubMenuOrderNotEqualTo(Short value) {
			addCriterion("SUB_MENU_ORDER <>", value, "subMenuOrder");
			return (Criteria) this;
		}

		public Criteria andSubMenuOrderGreaterThan(Short value) {
			addCriterion("SUB_MENU_ORDER >", value, "subMenuOrder");
			return (Criteria) this;
		}

		public Criteria andSubMenuOrderGreaterThanOrEqualTo(Short value) {
			addCriterion("SUB_MENU_ORDER >=", value, "subMenuOrder");
			return (Criteria) this;
		}

		public Criteria andSubMenuOrderLessThan(Short value) {
			addCriterion("SUB_MENU_ORDER <", value, "subMenuOrder");
			return (Criteria) this;
		}

		public Criteria andSubMenuOrderLessThanOrEqualTo(Short value) {
			addCriterion("SUB_MENU_ORDER <=", value, "subMenuOrder");
			return (Criteria) this;
		}

		public Criteria andSubMenuOrderIn(List<Short> values) {
			addCriterion("SUB_MENU_ORDER in", values, "subMenuOrder");
			return (Criteria) this;
		}

		public Criteria andSubMenuOrderNotIn(List<Short> values) {
			addCriterion("SUB_MENU_ORDER not in", values, "subMenuOrder");
			return (Criteria) this;
		}

		public Criteria andSubMenuOrderBetween(Short value1, Short value2) {
			addCriterion("SUB_MENU_ORDER between", value1, value2, "subMenuOrder");
			return (Criteria) this;
		}

		public Criteria andSubMenuOrderNotBetween(Short value1, Short value2) {
			addCriterion("SUB_MENU_ORDER not between", value1, value2, "subMenuOrder");
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
	 * This class was generated by MyBatis Generator. This class corresponds to the database table SUB_MENU_MST
	 * @mbg.generated  Sat Nov 23 17:32:33 JST 2019
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
     * This class corresponds to the database table SUB_MENU_MST
     *
     * @mbg.generated do_not_delete_during_merge Fri Oct 18 08:45:46 JST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}