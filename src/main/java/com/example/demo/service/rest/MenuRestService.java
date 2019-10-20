package com.example.demo.service.rest;

import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.entity.domain.MenuSubMenuMst;
import com.example.demo.entity.dto.response.MenuListResponseDto;
import com.example.demo.service.AccountService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MenuRestService extends BaseRestService {

	private final AccountService accountService;

	public List<MenuListResponseDto> getMenu() {

		// Gets user seq.
		String userSubMenuRole = accountService.getUserSubMenuRole();

		// Gets user menu list.
		List<MenuSubMenuMst> menuSubMenuMstList = accountService.getMenuList(userSubMenuRole);

		// returns response.
		return createResponseDto(menuSubMenuMstList);

	}

	private List<MenuListResponseDto> createResponseDto(List<MenuSubMenuMst> menuSubMenuMstList) {
		List<MenuListResponseDto> menuListResponseDto = menuSubMenuMstList.stream().collect(
				Collectors.groupingBy(MenuSubMenuMst::getMenuCode))
				.entrySet().stream().map(menu -> createMenuListResponseDto(menu)).collect(Collectors.toList());

		return menuListResponseDto;
	}

	private MenuListResponseDto createMenuListResponseDto(Entry<String, List<MenuSubMenuMst>> menu) {

		List<String> subMenuCodeList = menu.getValue().stream().map(e -> e.getSubMenuCode())
				.collect(Collectors.toList());

		MenuListResponseDto menuListResponseDto = new MenuListResponseDto(menu.getKey(), subMenuCodeList);

		return menuListResponseDto;

	}

}
