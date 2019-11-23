package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.domain.MenuSubMenuMst;
import com.example.demo.entity.session.SessionData;
import com.example.demo.repository.MenuMstMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AccountService {

	private final SessionData sessionData;

	private final MenuMstMapper menuMstMapper;

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

	public String getUserTimezone() {
		return sessionData.getUserTimezone();
	}

	public String getUserCurrency() {
		return sessionData.getUserCurrency();
	}

	public String getUserSubMenuRole() {
		return sessionData.getUserSubMenuRole();
	}

	public String toString() {
		return "UserSeq:" + sessionData.getUserSeq()
				+ ", UserSeq:" + sessionData.getUserAccount()
				+ ", UserName:" + sessionData.getUserName()
				+ ", UserLocale:" + sessionData.getUserLocale()
				+ ", UserTimezone:" + sessionData.getUserTimezone()
				+ ", UserCurrency:" + sessionData.getUserCurrency();
	}

	public List<MenuSubMenuMst> getMenuList(String userSubMenuRole) {

		return menuMstMapper.getMenuList(userSubMenuRole);

	}

}
