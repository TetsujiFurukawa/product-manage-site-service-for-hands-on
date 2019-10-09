package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.dto.response.MenuListResponseDto;
import com.example.demo.service.rest.MenuRestService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/menu")
@RequiredArgsConstructor
public class MenuRestController {

	private final MenuRestService menuRestService;

	@GetMapping
	public List<MenuListResponseDto> getMenu() {

		return menuRestService.getMenu();

	}
}
