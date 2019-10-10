package com.example.demo.service.rest;

import java.util.List;

import org.springframework.stereotype.Service;

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
		return accountService.getMenuList(userSubMenuRole);

	}

}
