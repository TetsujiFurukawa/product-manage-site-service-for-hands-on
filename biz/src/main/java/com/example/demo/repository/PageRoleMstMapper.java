package com.example.demo.repository;

import com.example.demo.entity.domain.PageRoleMst;
import com.example.demo.entity.domain.PageRoleMstExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PageRoleMstMapper {

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table PAGE_ROLE_MST
   * @mbg.generated  Tue Feb 02 01:04:07 JST 2021
   */
  long countByExample(PageRoleMstExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table PAGE_ROLE_MST
   * @mbg.generated  Tue Feb 02 01:04:07 JST 2021
   */
  int deleteByExample(PageRoleMstExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table PAGE_ROLE_MST
   * @mbg.generated  Tue Feb 02 01:04:07 JST 2021
   */
  int deleteByPrimaryKey(Long pageRollSeq);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table PAGE_ROLE_MST
   * @mbg.generated  Tue Feb 02 01:04:07 JST 2021
   */
  int insert(PageRoleMst record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table PAGE_ROLE_MST
   * @mbg.generated  Tue Feb 02 01:04:07 JST 2021
   */
  int insertSelective(PageRoleMst record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table PAGE_ROLE_MST
   * @mbg.generated  Tue Feb 02 01:04:07 JST 2021
   */
  List<PageRoleMst> selectByExample(PageRoleMstExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table PAGE_ROLE_MST
   * @mbg.generated  Tue Feb 02 01:04:07 JST 2021
   */
  PageRoleMst selectByPrimaryKey(Long pageRollSeq);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table PAGE_ROLE_MST
   * @mbg.generated  Tue Feb 02 01:04:07 JST 2021
   */
  int updateByExampleSelective(@Param("record") PageRoleMst record,
      @Param("example") PageRoleMstExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table PAGE_ROLE_MST
   * @mbg.generated  Tue Feb 02 01:04:07 JST 2021
   */
  int updateByExample(@Param("record") PageRoleMst record,
      @Param("example") PageRoleMstExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table PAGE_ROLE_MST
   * @mbg.generated  Tue Feb 02 01:04:07 JST 2021
   */
  int updateByPrimaryKeySelective(PageRoleMst record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table PAGE_ROLE_MST
   * @mbg.generated  Tue Feb 02 01:04:07 JST 2021
   */
  int updateByPrimaryKey(PageRoleMst record);
}