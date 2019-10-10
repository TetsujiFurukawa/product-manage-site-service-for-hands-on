package com.example.demo.service;

import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.entity.domain.MenuSubMenuMst;
import com.example.demo.entity.dto.response.MenuListResponseDto;
import com.example.demo.entity.session.SessionData;
import com.example.demo.repository.MenuSubMenuMstRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AccountService {

	private final SessionData sessionData;

	private final MenuSubMenuMstRepository menuSubMenuMstRepository;

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

	public String toString() {
		return "UserSeq:" + sessionData.getUserSeq()
				+ ", UserSeq:" + sessionData.getUserAccount()
				+ ", UserName:" + sessionData.getUserName()
				+ ", UserLang:" + sessionData.getUserLang()
				+ ", UserTimezone:" + sessionData.getUserTimezone();
	}

	public List<MenuListResponseDto> getMenuList(String userSubMenuRole) {

		List<MenuSubMenuMst> menuSubMenuMstList = menuSubMenuMstRepository.getMenuSubMenu(userSubMenuRole);

		List<MenuListResponseDto> menuList = menuSubMenuMstList.stream().collect(
				Collectors.groupingBy(MenuSubMenuMst::getMenuCode))
				.entrySet().stream().map(menu -> createMenuListResponseDto(menu)).collect(Collectors.toList());

		//		// 購入サブメニュー
		//		MenuResponseDto menuDto11 = new MenuResponseDto("purchase-history-Listing");
		//		MenuResponseDto menuDto12 = new MenuResponseDto("dummy-purchasing");
		//
		//		// 商品メニュー
		//		MenuResponseDto menuDto21 = new MenuResponseDto("product-listing");
		//
		//		// 在庫メニュー
		//		MenuResponseDto  menuDto31 = new MenuResponseDto("stock-registering");
		//
		//
		//		// 購入メニューリストをセット
		//		List<MenuResponseDto> menuList1 = new ArrayList<MenuResponseDto>();
		//		menuList1.add(menuDto11);
		//		menuList1.add(menuDto12);
		//		MenuListResponseDto menuListResponseDto1 = new MenuListResponseDto("purchase", menuList1);
		//
		//		// 商品メニューリストをセット
		//		List<MenuResponseDto> menuList2 = new ArrayList<MenuResponseDto>();
		//		menuList2.add(menuDto21);
		//		MenuListResponseDto menuListResponseDto2 = new MenuListResponseDto("product", menuList2);
		//
		//		// 在庫メニューリストをセット
		//		List<MenuResponseDto> menuList3 = new ArrayList<MenuResponseDto>();
		//		menuList3.add(menuDto31);
		//		MenuListResponseDto menuListResponseDto3 = new MenuListResponseDto("stock", menuList3);
		//
		//
		//		// 返却値にセットする
		//		List<MenuListResponseDto> res = new ArrayList<MenuListResponseDto>();
		//		res.add(menuListResponseDto1);
		//		res.add(menuListResponseDto2);
		//		res.add(menuListResponseDto3);

		return menuList;

	}

	private MenuListResponseDto createMenuListResponseDto(Entry<String, List<MenuSubMenuMst>> menu) {

		List<String> subMenuCodeList = menu.getValue().stream().map(e -> e.getSubMenuCode()).collect(Collectors.toList());

		MenuListResponseDto menuListResponseDto = new MenuListResponseDto(menu.getKey(),subMenuCodeList);

		return menuListResponseDto;
	}

}
