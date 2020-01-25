package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.demo.entity.domain.MenuMst;
import com.example.demo.entity.domain.MenuMstExample;
import com.example.demo.entity.domain.MenuSubMenuMst;

public interface MenuMstMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table MENU_MST
	 * @mbg.generated  Thu Jan 16 18:26:50 JST 2020
	 */
	long countByExample(MenuMstExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table MENU_MST
	 * @mbg.generated  Thu Jan 16 18:26:50 JST 2020
	 */
	int deleteByExample(MenuMstExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table MENU_MST
	 * @mbg.generated  Thu Jan 16 18:26:50 JST 2020
	 */
	int deleteByPrimaryKey(Long menuSeq);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table MENU_MST
	 * @mbg.generated  Thu Jan 16 18:26:50 JST 2020
	 */
	int insert(MenuMst record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table MENU_MST
	 * @mbg.generated  Thu Jan 16 18:26:50 JST 2020
	 */
	int insertSelective(MenuMst record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table MENU_MST
	 * @mbg.generated  Thu Jan 16 18:26:50 JST 2020
	 */
	List<MenuMst> selectByExample(MenuMstExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table MENU_MST
	 * @mbg.generated  Thu Jan 16 18:26:50 JST 2020
	 */
	MenuMst selectByPrimaryKey(Long menuSeq);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table MENU_MST
	 * @mbg.generated  Thu Jan 16 18:26:50 JST 2020
	 */
	int updateByExampleSelective(@Param("record") MenuMst record, @Param("example") MenuMstExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table MENU_MST
	 * @mbg.generated  Thu Jan 16 18:26:50 JST 2020
	 */
	int updateByExample(@Param("record") MenuMst record, @Param("example") MenuMstExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table MENU_MST
	 * @mbg.generated  Thu Jan 16 18:26:50 JST 2020
	 */
	int updateByPrimaryKeySelective(MenuMst record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table MENU_MST
	 * @mbg.generated  Thu Jan 16 18:26:50 JST 2020
	 */
	int updateByPrimaryKey(MenuMst record);

	/**
	 * Added Method
	 * Gets available menu list.
	 * @param userSubMenuRole menu role
	 * @return available menu list
	 */
	List<MenuSubMenuMst> getMenuList(String userSubMenuRole);
}