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

	public Long getUserSeq() {
		return sessionData.getUserSeq();
	}

	public String getUserAccount() {
		return sessionData.getUserAccount();
	}

	public String getUserName() {
		return sessionData.getUserName();
	}

	public String getUserLocale() {
		return sessionData.getUserLocale();
	}

	public String getUserLangage() {
		return sessionData.getUserLanguage();
	}

	public String getUserTimezone() {
		return sessionData.getUserTimezone();
	}

	public String getUserCurrency() {
		return sessionData.getUserCurrency();
	}

	public String getUserSubMenuRole() {
		return sessionData.getUserSubMenuRole();
	}

	public void setUserSeq(Long userSeq) {
		sessionData.setUserSeq(userSeq);
	}

	public void setUserAccount(String userAccount) {
		sessionData.setUserAccount(userAccount);
	}

	public void setUserName(String userName) {
		sessionData.setUserName(userName);
	}

	public void setUserLocale(String userLocale) {
		sessionData.setUserLocale(userLocale);
	}

	public void setUserTimezone(String userTimezone) {
		sessionData.setUserTimezone(userTimezone);
	}

	public void setUserCurrency(String userCurrency) {
		sessionData.setUserCurrency(userCurrency);
	}

	public void setUserSubMenuRole(String userSubMenuRole) {
		sessionData.setUserSubMenuRole(userSubMenuRole);
	}

	public void setupSession(UserMst userMst) {

		setUserSeq(userMst.getUserSeq());
		setUserAccount(userMst.getUserAccount());
		setUserName(userMst.getUserName());
		setUserLocale(userMst.getUserLocale());
		setUserTimezone(userMst.getUserTimezone());
		setUserCurrency(userMst.getUserCurrency());
		setUserSubMenuRole(userMst.getUserSubMenuRole());

	}
}
