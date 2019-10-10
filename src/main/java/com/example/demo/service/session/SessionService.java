package com.example.demo.service.session;

import org.springframework.stereotype.Service;

import com.example.demo.entity.domain.UserMst;
import com.example.demo.entity.session.SessionData;

import lombok.RequiredArgsConstructor;

/**
 * @author tetsuji
 *
 */
@Service
@RequiredArgsConstructor
public class SessionService {

	private final SessionData sessionData;

	public String getDeleted() {
		return sessionData.getDeleted();
	}

	public String getUserAccount() {
		return sessionData.getUserAccount();
	}

	public String getUserLang() {
		return sessionData.getUserLang();
	}

	public String getUserName() {
		return sessionData.getUserName();
	}

	public Integer getUserSeq() {
		return sessionData.getUserSeq();
	}

	public String getUserTimezone() {
		return sessionData.getUserTimezone();
	}

	public String getUserSubMenuRole() {
		return sessionData.getUserSubMenuRole();
	}

	public void setDeleted(String deleted) {
		sessionData.setDeleted(deleted);
	}

	public void setUserAccount(String userAccount) {
		sessionData.setUserAccount(userAccount);
	}

	public void setUserLang(String userLang) {
		sessionData.setUserLang(userLang);
	}

	public void setUserName(String userName) {
		sessionData.setUserName(userName);
	}

	public void setUserSeq(Integer userSeq) {
		sessionData.setUserSeq(userSeq);
	}

	public void setUserTimezone(String userTimezone) {
		sessionData.setUserTimezone(userTimezone);
	}

	public void setUserSubMenuRole(String userSubMenuRole) {
		sessionData.setUserSubMenuRole(userSubMenuRole);
	}


	public void setupSession(UserMst userMst) {

		setUserSeq(userMst.getUserSeq());
		setUserAccount(userMst.getUserAccount());
		setUserName(userMst.getUserName());
		setUserLang(userMst.getUserLang());
		setUserTimezone(userMst.getUserTimezone());
		setUserSubMenuRole(userMst.getUserSubMenuRole());

	}

}
