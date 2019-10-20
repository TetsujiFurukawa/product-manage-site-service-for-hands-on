package com.example.demo.mybatis;

import com.example.demo.entity.domain.SubMenuMst;
import com.example.demo.entity.domain.SubMenuMstExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubMenuMstMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SUB_MENU_MST
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	long countByExample(SubMenuMstExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SUB_MENU_MST
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	int deleteByExample(SubMenuMstExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SUB_MENU_MST
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	int deleteByPrimaryKey(Long subMenuSeq);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SUB_MENU_MST
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	int insert(SubMenuMst record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SUB_MENU_MST
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	int insertSelective(SubMenuMst record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SUB_MENU_MST
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	List<SubMenuMst> selectByExample(SubMenuMstExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SUB_MENU_MST
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	SubMenuMst selectByPrimaryKey(Long subMenuSeq);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SUB_MENU_MST
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	int updateByExampleSelective(@Param("record") SubMenuMst record, @Param("example") SubMenuMstExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SUB_MENU_MST
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	int updateByExample(@Param("record") SubMenuMst record, @Param("example") SubMenuMstExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SUB_MENU_MST
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	int updateByPrimaryKeySelective(SubMenuMst record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SUB_MENU_MST
	 * @mbg.generated  Sun Oct 20 01:03:53 JST 2019
	 */
	int updateByPrimaryKey(SubMenuMst record);
}