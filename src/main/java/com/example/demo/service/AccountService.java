package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.domain.MenuSubMenuMst;
import com.example.demo.entity.session.SessionData;
import com.example.demo.mybatis.MenuMstMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AccountService {

	private final SessionData sessionData;

	private final MenuMstMapper menuMstMapper;

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

	public Long getUserSeq() {
		return sessionData.getUserSeq();
	}

	public String getUserTimezone() {
		return sessionData.getUserTimezone();
	}

	public String getUserSubMenuRole() {
		return sessionData.getUserSubMenuRole();
	}

	public String toString() {
		return "UserSeq:" + sessionData.getUserSeq()
				+ ", UserSeq:" + sessionData.getUserAccount()
				+ ", UserName:" + sessionData.getUserName()
				+ ", UserLang:" + sessionData.getUserLang()
				+ ", UserTimezone:" + sessionData.getUserTimezone();
	}

	public List<MenuSubMenuMst> getMenuList(String userSubMenuRole) {

		return menuMstMapper.getMenuList(userSubMenuRole);

		//		List<MenuListResponseDto> menuList = menuSubMenuMstList.stream().collect(
		//				Collectors.groupingBy(MenuSubMenuMst::getMenuCode))
		//				.entrySet().stream().map(menu -> createMenuListResponseDto(menu)).collect(Collectors.toList());

		//		return menuList;

	}

	//	private MenuListResponseDto createMenuListResponseDto(Entry<String, List<MenuSubMenuMst>> menu) {
	//
	//		List<String> subMenuCodeList = menu.getValue().stream().map(e -> e.getSubMenuCode())
	//				.collect(Collectors.toList());
	//
	//		MenuListResponseDto menuListResponseDto = new MenuListResponseDto(menu.getKey(), subMenuCodeList);
	//
	//		return menuListResponseDto;
	//
	//	}

}
