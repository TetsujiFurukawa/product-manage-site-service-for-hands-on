package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.domain.MenuSubMenuMst;
import com.example.demo.repository.MenuMstMapper;
import com.example.demo.service.session.SessionService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AccountService {

	private final SessionService sessionService;

	private final MenuMstMapper menuMstMapper;

	public Long getUserSeq() {
		return sessionService.getUserSeq();
	}

	public String getUserAccount() {
		return sessionService.getUserAccount();
	}

	public String getUserName() {
		return sessionService.getUserName();
	}

	public String getUserLocale() {
		return sessionService.getUserLocale();
	}

	public String getUserLangage() {
		return sessionService.getUserLangage();
	}

	public String getUserTimezone() {
		return sessionService.getUserTimezone();
	}

	public String getUserCurrency() {
		return sessionService.getUserCurrency();
	}

	public String getUserSubMenuRole() {
		return sessionService.getUserSubMenuRole();
	}

	public String toString() {
		return "UserSeq:" + sessionService.getUserSeq()
				+ ", UserSeq:" + sessionService.getUserAccount()
				+ ", UserName:" + sessionService.getUserName()
				+ ", UserLocale:" + sessionService.getUserLocale()
				+ ", UserLanguage:" + sessionService.getUserLangage()
				+ ", UserTimezone:" + sessionService.getUserTimezone()
				+ ", UserCurrency:" + sessionService.getUserCurrency();
	}

	public List<MenuSubMenuMst> getMenuList(String userSubMenuRole) {

		return menuMstMapper.getMenuList(userSubMenuRole);

	}

}
