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

  /**
   * Gets the menu.
   *
   * @return the menu
   */
  public List<MenuListResponseDto> getMenu() {

    // Gets user seq.
    String userSubMenuRole = accountService.getUserSubMenuRole();

    // Gets user menu list.
    List<MenuSubMenuMst> menuSubMenuMstList = accountService.getMenuList(userSubMenuRole);

    // returns response.
    return createResponseDto(menuSubMenuMstList);

  }

  private List<MenuListResponseDto> createResponseDto(List<MenuSubMenuMst> menuSubMenuMstList) {
    List<MenuListResponseDto> menuListResponseDto = menuSubMenuMstList.stream()
        .collect(Collectors.groupingBy(MenuSubMenuMst::getMenuCode)).entrySet().stream()
        .map(menu -> createMenuListResponseDto(menu)).collect(Collectors.toList());

    return menuListResponseDto;
  }

  private MenuListResponseDto createMenuListResponseDto(Entry<String, List<MenuSubMenuMst>> menu) {

    List<String> subMenuCodeList = menu.getValue().stream().map(e -> e.getSubMenuCode())
        .collect(Collectors.toList());

    MenuListResponseDto menuListResponseDto = new MenuListResponseDto(menu.getKey(),
        subMenuCodeList);

    return menuListResponseDto;

  }

  /**
   * Gets the available pages.
   *
   * @return the available pages
   */
  public List<String> getAvailablePages() {

    // Gets user role.
    String userSubMenuRole = accountService.getUserSubMenuRole();

    // Gets available pages
    List<String> availablePages = accountService.getAvailablePages(userSubMenuRole).stream()
        .map(pageRoleMst -> pageRoleMst.getPageCode()).collect(Collectors.toList());

    return availablePages;

  }

}
