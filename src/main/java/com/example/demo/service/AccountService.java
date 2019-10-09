package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.dto.response.MenuListResponseDto;
import com.example.demo.entity.dto.response.MenuResponseDto;
import com.example.demo.entity.session.SessionData;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AccountService {

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

	public String toString() {
		return "UserSeq:" + sessionData.getUserSeq()
		+ ", UserSeq:" + sessionData.getUserAccount()
		+", UserName:" + sessionData.getUserName()
				+ ", UserLang:" + sessionData.getUserLang()
				+", UserTimezone:" +  sessionData.getUserTimezone();
	}

	public List<MenuListResponseDto> getMenuList(Long userSeq) {

		// 購入メニュー
		MenuResponseDto menuDto11 = new MenuResponseDto("purchase-history-Listing");
		MenuResponseDto menuDto12 = new MenuResponseDto("dummy-purchasing");

		// 商品メニュー
		MenuResponseDto menuDto21 = new MenuResponseDto("product-listing");

		// 在庫メニュー
		MenuResponseDto  menuDto31 = new MenuResponseDto("stock-registering");


		// 購入メニューリストをセット
		List<MenuResponseDto> menuList1 = new ArrayList<MenuResponseDto>();
		menuList1.add(menuDto11);
		menuList1.add(menuDto12);
		MenuListResponseDto menuListResponseDto1 = new MenuListResponseDto("purchase", menuList1);

		// 商品メニューリストをセット
		List<MenuResponseDto> menuList2 = new ArrayList<MenuResponseDto>();
		menuList2.add(menuDto21);
		MenuListResponseDto menuListResponseDto2 = new MenuListResponseDto("product", menuList2);

		// 在庫メニューリストをセット
		List<MenuResponseDto> menuList3 = new ArrayList<MenuResponseDto>();
		menuList3.add(menuDto31);
		MenuListResponseDto menuListResponseDto3 = new MenuListResponseDto("stock", menuList3);


		// 返却値にセットする
		List<MenuListResponseDto> res = new ArrayList<MenuListResponseDto>();
		res.add(menuListResponseDto1);
		res.add(menuListResponseDto2);
		res.add(menuListResponseDto3);

		return res;

	}


}
