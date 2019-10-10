package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.domain.MenuSubMenuMst;

public interface MenuSubMenuMstRepository extends JpaRepository<MenuSubMenuMst, Long> {

	@Query(value =
			"SELECT " +
			"  MNU.MENU_CODE " +
			"  , SUB.SUB_MENU_CODE  " +
			"FROM " +
			"  MENU_MST AS MNU  " +
			"  INNER JOIN SUB_MENU_MST SUB  " +
			"    ON SUB.MENU_SEQ = MNU.MENU_SEQ  " +
			"WHERE " +
			"  SUB.SUB_MENU_ROLL = :userMenuRoll  " +
			"  AND MNU.DELETED = FALSE  " +
			"  AND SUB.DELETED = FALSE  " +
			"ORDER BY " +
			"  MNU.MENU_ORDER " +
			"  , SUB.SUB_MENU_ORDER;", nativeQuery = true)

	List<MenuSubMenuMst> getMenuSubMenu(@Param("userMenuRoll") String userMenuRoll);

}
