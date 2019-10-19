package com.example.demo.repository;

public interface MenuSubMenuMstRepository  {

//	@Query(value =
//			"SELECT " +
//			"  MNU.MENU_CODE " +
//			"  , SUB.SUB_MENU_CODE  " +
//			"FROM " +
//			"  MENU_MST AS MNU  " +
//			"  INNER JOIN SUB_MENU_MST SUB  " +
//			"    ON SUB.MENU_SEQ = MNU.MENU_SEQ  " +
//			"WHERE " +
//			"  SUB.SUB_MENU_ROLL = :userMenuRoll  " +
//			"  AND MNU.DELETED = FALSE  " +
//			"  AND SUB.DELETED = FALSE  " +
//			"ORDER BY " +
//			"  MNU.MENU_ORDER " +
//			"  , SUB.SUB_MENU_ORDER;", nativeQuery = true)
//
//	List<MenuSubMenuMst> getMenuSubMenu(@Param("userMenuRoll") String userMenuRoll);

}
