package com.example.demo.entity.domain;

import java.time.LocalDateTime;

public class PageRoleMst {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PAGE_ROLE_MST.PAGE_ROLL_SEQ
	 * @mbg.generated  Sun Apr 05 16:51:24 JST 2020
	 */
	private Long pageRollSeq;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PAGE_ROLE_MST.PAGE_CODE
	 * @mbg.generated  Sun Apr 05 16:51:24 JST 2020
	 */
	private String pageCode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PAGE_ROLE_MST.PAGE_ROLL
	 * @mbg.generated  Sun Apr 05 16:51:24 JST 2020
	 */
	private String pageRoll;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PAGE_ROLE_MST.MENU_DISPLAY
	 * @mbg.generated  Sun Apr 05 16:51:24 JST 2020
	 */
	private Boolean menuDisplay;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PAGE_ROLE_MST.MENU_SEQ
	 * @mbg.generated  Sun Apr 05 16:51:24 JST 2020
	 */
	private Long menuSeq;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PAGE_ROLE_MST.MENU_ORDER
	 * @mbg.generated  Sun Apr 05 16:51:24 JST 2020
	 */
	private Short menuOrder;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PAGE_ROLE_MST.ENTER_DATE
	 * @mbg.generated  Sun Apr 05 16:51:24 JST 2020
	 */
	private LocalDateTime enterDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PAGE_ROLE_MST.ENTER_USER
	 * @mbg.generated  Sun Apr 05 16:51:24 JST 2020
	 */
	private String enterUser;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PAGE_ROLE_MST.UPDATE_DATE
	 * @mbg.generated  Sun Apr 05 16:51:24 JST 2020
	 */
	private LocalDateTime updateDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PAGE_ROLE_MST.UPDATE_USER
	 * @mbg.generated  Sun Apr 05 16:51:24 JST 2020
	 */
	private String updateUser;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PAGE_ROLE_MST.PAGE_ROLL_SEQ
	 * @return  the value of PAGE_ROLE_MST.PAGE_ROLL_SEQ
	 * @mbg.generated  Sun Apr 05 16:51:24 JST 2020
	 */
	public Long getPageRollSeq() {
		return pageRollSeq;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PAGE_ROLE_MST.PAGE_ROLL_SEQ
	 * @param pageRollSeq  the value for PAGE_ROLE_MST.PAGE_ROLL_SEQ
	 * @mbg.generated  Sun Apr 05 16:51:24 JST 2020
	 */
	public void setPageRollSeq(Long pageRollSeq) {
		this.pageRollSeq = pageRollSeq;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PAGE_ROLE_MST.PAGE_CODE
	 * @return  the value of PAGE_ROLE_MST.PAGE_CODE
	 * @mbg.generated  Sun Apr 05 16:51:24 JST 2020
	 */
	public String getPageCode() {
		return pageCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PAGE_ROLE_MST.PAGE_CODE
	 * @param pageCode  the value for PAGE_ROLE_MST.PAGE_CODE
	 * @mbg.generated  Sun Apr 05 16:51:24 JST 2020
	 */
	public void setPageCode(String pageCode) {
		this.pageCode = pageCode == null ? null : pageCode.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PAGE_ROLE_MST.PAGE_ROLL
	 * @return  the value of PAGE_ROLE_MST.PAGE_ROLL
	 * @mbg.generated  Sun Apr 05 16:51:24 JST 2020
	 */
	public String getPageRoll() {
		return pageRoll;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PAGE_ROLE_MST.PAGE_ROLL
	 * @param pageRoll  the value for PAGE_ROLE_MST.PAGE_ROLL
	 * @mbg.generated  Sun Apr 05 16:51:24 JST 2020
	 */
	public void setPageRoll(String pageRoll) {
		this.pageRoll = pageRoll == null ? null : pageRoll.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PAGE_ROLE_MST.MENU_DISPLAY
	 * @return  the value of PAGE_ROLE_MST.MENU_DISPLAY
	 * @mbg.generated  Sun Apr 05 16:51:24 JST 2020
	 */
	public Boolean getMenuDisplay() {
		return menuDisplay;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PAGE_ROLE_MST.MENU_DISPLAY
	 * @param menuDisplay  the value for PAGE_ROLE_MST.MENU_DISPLAY
	 * @mbg.generated  Sun Apr 05 16:51:24 JST 2020
	 */
	public void setMenuDisplay(Boolean menuDisplay) {
		this.menuDisplay = menuDisplay;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PAGE_ROLE_MST.MENU_SEQ
	 * @return  the value of PAGE_ROLE_MST.MENU_SEQ
	 * @mbg.generated  Sun Apr 05 16:51:24 JST 2020
	 */
	public Long getMenuSeq() {
		return menuSeq;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PAGE_ROLE_MST.MENU_SEQ
	 * @param menuSeq  the value for PAGE_ROLE_MST.MENU_SEQ
	 * @mbg.generated  Sun Apr 05 16:51:24 JST 2020
	 */
	public void setMenuSeq(Long menuSeq) {
		this.menuSeq = menuSeq;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PAGE_ROLE_MST.MENU_ORDER
	 * @return  the value of PAGE_ROLE_MST.MENU_ORDER
	 * @mbg.generated  Sun Apr 05 16:51:24 JST 2020
	 */
	public Short getMenuOrder() {
		return menuOrder;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PAGE_ROLE_MST.MENU_ORDER
	 * @param menuOrder  the value for PAGE_ROLE_MST.MENU_ORDER
	 * @mbg.generated  Sun Apr 05 16:51:24 JST 2020
	 */
	public void setMenuOrder(Short menuOrder) {
		this.menuOrder = menuOrder;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PAGE_ROLE_MST.ENTER_DATE
	 * @return  the value of PAGE_ROLE_MST.ENTER_DATE
	 * @mbg.generated  Sun Apr 05 16:51:24 JST 2020
	 */
	public LocalDateTime getEnterDate() {
		return enterDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PAGE_ROLE_MST.ENTER_DATE
	 * @param enterDate  the value for PAGE_ROLE_MST.ENTER_DATE
	 * @mbg.generated  Sun Apr 05 16:51:24 JST 2020
	 */
	public void setEnterDate(LocalDateTime enterDate) {
		this.enterDate = enterDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PAGE_ROLE_MST.ENTER_USER
	 * @return  the value of PAGE_ROLE_MST.ENTER_USER
	 * @mbg.generated  Sun Apr 05 16:51:24 JST 2020
	 */
	public String getEnterUser() {
		return enterUser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PAGE_ROLE_MST.ENTER_USER
	 * @param enterUser  the value for PAGE_ROLE_MST.ENTER_USER
	 * @mbg.generated  Sun Apr 05 16:51:24 JST 2020
	 */
	public void setEnterUser(String enterUser) {
		this.enterUser = enterUser == null ? null : enterUser.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PAGE_ROLE_MST.UPDATE_DATE
	 * @return  the value of PAGE_ROLE_MST.UPDATE_DATE
	 * @mbg.generated  Sun Apr 05 16:51:24 JST 2020
	 */
	public LocalDateTime getUpdateDate() {
		return updateDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PAGE_ROLE_MST.UPDATE_DATE
	 * @param updateDate  the value for PAGE_ROLE_MST.UPDATE_DATE
	 * @mbg.generated  Sun Apr 05 16:51:24 JST 2020
	 */
	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PAGE_ROLE_MST.UPDATE_USER
	 * @return  the value of PAGE_ROLE_MST.UPDATE_USER
	 * @mbg.generated  Sun Apr 05 16:51:24 JST 2020
	 */
	public String getUpdateUser() {
		return updateUser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PAGE_ROLE_MST.UPDATE_USER
	 * @param updateUser  the value for PAGE_ROLE_MST.UPDATE_USER
	 * @mbg.generated  Sun Apr 05 16:51:24 JST 2020
	 */
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser == null ? null : updateUser.trim();
	}
}