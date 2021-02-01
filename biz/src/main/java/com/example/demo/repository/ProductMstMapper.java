package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.demo.entity.domain.ProductMst;
import com.example.demo.entity.domain.ProductMstExample;
import com.example.demo.entity.domain.ProductMstStockMst;

public interface ProductMstMapper {

	/**
   * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT_MST
   * @mbg.generated  Tue Feb 02 01:04:07 JST 2021
   */
  long countByExample(ProductMstExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT_MST
   * @mbg.generated  Tue Feb 02 01:04:07 JST 2021
   */
  int deleteByExample(ProductMstExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT_MST
   * @mbg.generated  Tue Feb 02 01:04:07 JST 2021
   */
  int deleteByPrimaryKey(Long productSeq);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT_MST
   * @mbg.generated  Tue Feb 02 01:04:07 JST 2021
   */
  int insert(ProductMst record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT_MST
   * @mbg.generated  Tue Feb 02 01:04:07 JST 2021
   */
  int insertSelective(ProductMst record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT_MST
   * @mbg.generated  Tue Feb 02 01:04:07 JST 2021
   */
  List<ProductMst> selectByExample(ProductMstExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT_MST
   * @mbg.generated  Tue Feb 02 01:04:07 JST 2021
   */
  ProductMst selectByPrimaryKey(Long productSeq);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT_MST
   * @mbg.generated  Tue Feb 02 01:04:07 JST 2021
   */
  int updateByExampleSelective(@Param("record") ProductMst record,
      @Param("example") ProductMstExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT_MST
   * @mbg.generated  Tue Feb 02 01:04:07 JST 2021
   */
  int updateByExample(@Param("record") ProductMst record,
      @Param("example") ProductMstExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT_MST
   * @mbg.generated  Tue Feb 02 01:04:07 JST 2021
   */
  int updateByPrimaryKeySelective(ProductMst record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT_MST
   * @mbg.generated  Tue Feb 02 01:04:07 JST 2021
   */
  int updateByPrimaryKey(ProductMst record);

  /**
	 * Counts product master joins stock master redcords.
	 * @param productMst search conditions
	 * @return search results count
	 */
	long countProductMstStockMst(@Param("productMst") ProductMst productMst);

	/**
	 * Gets product master joins stock master redcords.
	 * @param productMst search conditions
	 * @param limit limit size
	 * @param offset offset size
	 * @return search results
	 */
	List<ProductMstStockMst> selectProductMstStockMst(@Param("productMst") ProductMst productMst,
			@Param("limit") Integer limit, @Param("offset") Long offset);

	/**
	 * Select product master by code with for update option.
	 * @param productMst search conditions
	 * @return ProductMst
	 */
	ProductMst selectForUpdateProductMstByCode(@Param("productMst") ProductMst productMst);

}