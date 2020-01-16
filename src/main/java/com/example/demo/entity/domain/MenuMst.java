package com.example.demo.entity.domain;

import java.util.Date;
import java.time.LocalDateTime;

public class MenuMst {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column MENU_MST.MENU_SEQ
	 * @mbg.generated  Thu Jan 16 18:26:50 JST 2020
	 */
	private Long menuSeq;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column MENU_MST.MENU_CODE
	 * @mbg.generated  Thu Jan 16 18:26:50 JST 2020
	 */
	private String menuCode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column MENU_MST.MENU_ORDER
	 * @mbg.generated  Thu Jan 16 18:26:50 JST 2020
	 */
	private Short menuOrder;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column MENU_MST.ENTER_DATE
	 * @mbg.generated  Thu Jan 16 18:26:50 JST 2020
	 */
	private LocalDateTime enterDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column MENU_MST.ENTER_USER
	 * @mbg.generated  Thu Jan 16 18:26:50 JST 2020
	 */
	private String enterUser;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column MENU_MST.UPDATE_DATE
	 * @mbg.generated  Thu Jan 16 18:26:50 JST 2020
	 */
	private LocalDateTime updateDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column MENU_MST.UPDATE_USER
	 * @mbg.generated  Thu Jan 16 18:26:50 JST 2020
	 */
	private String updateUser;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column MENU_MST.MENU_SEQ
	 * @return  the value of MENU_MST.MENU_SEQ
	 * @mbg.generated  Thu Jan 16 18:26:50 JST 2020
	 */
	public Long getMenuSeq() {
		return menuSeq;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column MENU_MST.MENU_SEQ
	 * @param menuSeq  the value for MENU_MST.MENU_SEQ
	 * @mbg.generated  Thu Jan 16 18:26:50 JST 2020
	 */
	public void setMenuSeq(Long menuSeq) {
		this.menuSeq = menuSeq;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column MENU_MST.MENU_CODE
	 * @return  the value of MENU_MST.MENU_CODE
	 * @mbg.generated  Thu Jan 16 18:26:50 JST 2020
	 */
	public String getMenuCode() {
		return menuCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column MENU_MST.MENU_CODE
	 * @param menuCode  the value for MENU_MST.MENU_CODE
	 * @mbg.generated  Thu Jan 16 18:26:50 JST 2020
	 */
	public void setMenuCode(String menuCode) {
		this.menuCode = menuCode == null ? null : menuCode.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column MENU_MST.MENU_ORDER
	 * @return  the value of MENU_MST.MENU_ORDER
	 * @mbg.generated  Thu Jan 16 18:26:50 JST 2020
	 */
	public Short getMenuOrder() {
		return menuOrder;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column MENU_MST.MENU_ORDER
	 * @param menuOrder  the value for MENU_MST.MENU_ORDER
	 * @mbg.generated  Thu Jan 16 18:26:50 JST 2020
	 */
	public void setMenuOrder(Short menuOrder) {
		this.menuOrder = menuOrder;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column MENU_MST.ENTER_DATE
	 * @return  the value of MENU_MST.ENTER_DATE
	 * @mbg.generated  Thu Jan 16 18:26:50 JST 2020
	 */
	public LocalDateTime getEnterDate() {
		return enterDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column MENU_MST.ENTER_DATE
	 * @param enterDate  the value for MENU_MST.ENTER_DATE
	 * @mbg.generated  Thu Jan 16 18:26:50 JST 2020
	 */
	public void setEnterDate(LocalDateTime enterDate) {
		this.enterDate = enterDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column MENU_MST.ENTER_USER
	 * @return  the value of MENU_MST.ENTER_USER
	 * @mbg.generated  Thu Jan 16 18:26:50 JST 2020
	 */
	public String getEnterUser() {
		return enterUser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column MENU_MST.ENTER_USER
	 * @param enterUser  the value for MENU_MST.ENTER_USER
	 * @mbg.generated  Thu Jan 16 18:26:50 JST 2020
	 */
	public void setEnterUser(String enterUser) {
		this.enterUser = enterUser == null ? null : enterUser.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column MENU_MST.UPDATE_DATE
	 * @return  the value of MENU_MST.UPDATE_DATE
	 * @mbg.generated  Thu Jan 16 18:26:50 JST 2020
	 */
	public LocalDateTime getUpdateDate() {
		return updateDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column MENU_MST.UPDATE_DATE
	 * @param updateDate  the value for MENU_MST.UPDATE_DATE
	 * @mbg.generated  Thu Jan 16 18:26:50 JST 2020
	 */
	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column MENU_MST.UPDATE_USER
	 * @return  the value of MENU_MST.UPDATE_USER
	 * @mbg.generated  Thu Jan 16 18:26:50 JST 2020
	 */
	public String getUpdateUser() {
		return updateUser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column MENU_MST.UPDATE_USER
	 * @param updateUser  the value for MENU_MST.UPDATE_USER
	 * @mbg.generated  Thu Jan 16 18:26:50 JST 2020
	 */
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser == null ? null : updateUser.trim();
	}
}