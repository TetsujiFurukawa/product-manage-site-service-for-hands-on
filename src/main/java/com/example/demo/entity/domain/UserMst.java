package com.example.demo.entity.domain;

import java.util.Date;

public class UserMst {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column USER_MST.USER_SEQ
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	private Long userSeq;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column USER_MST.USER_ACCOUNT
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	private String userAccount;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column USER_MST.USER_ENCODED_PASSWORD
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	private String userEncodedPassword;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column USER_MST.USER_NAME
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	private String userName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column USER_MST.USER_LANG
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	private String userLang;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column USER_MST.USER_TIMEZONE
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	private String userTimezone;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column USER_MST.USER_SUB_MENU_ROLE
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	private String userSubMenuRole;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column USER_MST.DELETED
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	private Boolean deleted;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column USER_MST.ENTER_DATE
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	private Date enterDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column USER_MST.ENTER_USER
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	private String enterUser;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column USER_MST.UPDATE_DATE
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	private Date updateDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column USER_MST.UPDATE_USER
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	private String updateUser;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column USER_MST.USER_SEQ
	 * @return  the value of USER_MST.USER_SEQ
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	public Long getUserSeq() {
		return userSeq;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column USER_MST.USER_SEQ
	 * @param userSeq  the value for USER_MST.USER_SEQ
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	public void setUserSeq(Long userSeq) {
		this.userSeq = userSeq;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column USER_MST.USER_ACCOUNT
	 * @return  the value of USER_MST.USER_ACCOUNT
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	public String getUserAccount() {
		return userAccount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column USER_MST.USER_ACCOUNT
	 * @param userAccount  the value for USER_MST.USER_ACCOUNT
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount == null ? null : userAccount.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column USER_MST.USER_ENCODED_PASSWORD
	 * @return  the value of USER_MST.USER_ENCODED_PASSWORD
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	public String getUserEncodedPassword() {
		return userEncodedPassword;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column USER_MST.USER_ENCODED_PASSWORD
	 * @param userEncodedPassword  the value for USER_MST.USER_ENCODED_PASSWORD
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	public void setUserEncodedPassword(String userEncodedPassword) {
		this.userEncodedPassword = userEncodedPassword == null ? null : userEncodedPassword.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column USER_MST.USER_NAME
	 * @return  the value of USER_MST.USER_NAME
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column USER_MST.USER_NAME
	 * @param userName  the value for USER_MST.USER_NAME
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	public void setUserName(String userName) {
		this.userName = userName == null ? null : userName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column USER_MST.USER_LANG
	 * @return  the value of USER_MST.USER_LANG
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	public String getUserLang() {
		return userLang;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column USER_MST.USER_LANG
	 * @param userLang  the value for USER_MST.USER_LANG
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	public void setUserLang(String userLang) {
		this.userLang = userLang == null ? null : userLang.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column USER_MST.USER_TIMEZONE
	 * @return  the value of USER_MST.USER_TIMEZONE
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	public String getUserTimezone() {
		return userTimezone;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column USER_MST.USER_TIMEZONE
	 * @param userTimezone  the value for USER_MST.USER_TIMEZONE
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	public void setUserTimezone(String userTimezone) {
		this.userTimezone = userTimezone == null ? null : userTimezone.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column USER_MST.USER_SUB_MENU_ROLE
	 * @return  the value of USER_MST.USER_SUB_MENU_ROLE
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	public String getUserSubMenuRole() {
		return userSubMenuRole;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column USER_MST.USER_SUB_MENU_ROLE
	 * @param userSubMenuRole  the value for USER_MST.USER_SUB_MENU_ROLE
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	public void setUserSubMenuRole(String userSubMenuRole) {
		this.userSubMenuRole = userSubMenuRole == null ? null : userSubMenuRole.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column USER_MST.DELETED
	 * @return  the value of USER_MST.DELETED
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	public Boolean getDeleted() {
		return deleted;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column USER_MST.DELETED
	 * @param deleted  the value for USER_MST.DELETED
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column USER_MST.ENTER_DATE
	 * @return  the value of USER_MST.ENTER_DATE
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	public Date getEnterDate() {
		return enterDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column USER_MST.ENTER_DATE
	 * @param enterDate  the value for USER_MST.ENTER_DATE
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	public void setEnterDate(Date enterDate) {
		this.enterDate = enterDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column USER_MST.ENTER_USER
	 * @return  the value of USER_MST.ENTER_USER
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	public String getEnterUser() {
		return enterUser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column USER_MST.ENTER_USER
	 * @param enterUser  the value for USER_MST.ENTER_USER
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	public void setEnterUser(String enterUser) {
		this.enterUser = enterUser == null ? null : enterUser.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column USER_MST.UPDATE_DATE
	 * @return  the value of USER_MST.UPDATE_DATE
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	public Date getUpdateDate() {
		return updateDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column USER_MST.UPDATE_DATE
	 * @param updateDate  the value for USER_MST.UPDATE_DATE
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column USER_MST.UPDATE_USER
	 * @return  the value of USER_MST.UPDATE_USER
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	public String getUpdateUser() {
		return updateUser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column USER_MST.UPDATE_USER
	 * @param updateUser  the value for USER_MST.UPDATE_USER
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser == null ? null : updateUser.trim();
	}
}