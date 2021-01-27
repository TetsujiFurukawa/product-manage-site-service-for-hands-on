package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.dto.response.MenuListResponseDto;
import com.example.demo.service.rest.MenuRestService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class MenuRestController {

  private final MenuRestService menuRestService;

  /**
   * Gets the menu V 1.
   *
   * @return the menu V 1
   */
  @GetMapping("/menu/v1")
  public List<MenuListResponseDto> getMenuV1() {

    return menuRestService.getMenu();

  }

  /**
   * Available pages V 1.
   *
   * @return the list
   */
  @GetMapping("/available-pages/v1")
  public List<String> availablePagesV1() {

    return menuRestService.getAvailablePages();

  }

}
