package com.example.demo.repository;

import com.example.demo.entity.domain.ProductStockMst;
import com.example.demo.entity.domain.ProductStockMstExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductStockMstMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT_STOCK_MST
	 * @mbg.generated  Thu Jan 16 18:26:50 JST 2020
	 */
	long countByExample(ProductStockMstExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT_STOCK_MST
	 * @mbg.generated  Thu Jan 16 18:26:50 JST 2020
	 */
	int deleteByExample(ProductStockMstExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT_STOCK_MST
	 * @mbg.generated  Thu Jan 16 18:26:50 JST 2020
	 */
	int deleteByPrimaryKey(Long productStockSeq);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT_STOCK_MST
	 * @mbg.generated  Thu Jan 16 18:26:50 JST 2020
	 */
	int insert(ProductStockMst record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT_STOCK_MST
	 * @mbg.generated  Thu Jan 16 18:26:50 JST 2020
	 */
	int insertSelective(ProductStockMst record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT_STOCK_MST
	 * @mbg.generated  Thu Jan 16 18:26:50 JST 2020
	 */
	List<ProductStockMst> selectByExample(ProductStockMstExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT_STOCK_MST
	 * @mbg.generated  Thu Jan 16 18:26:50 JST 2020
	 */
	ProductStockMst selectByPrimaryKey(Long productStockSeq);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT_STOCK_MST
	 * @mbg.generated  Thu Jan 16 18:26:50 JST 2020
	 */
	int updateByExampleSelective(@Param("record") ProductStockMst record,
			@Param("example") ProductStockMstExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT_STOCK_MST
	 * @mbg.generated  Thu Jan 16 18:26:50 JST 2020
	 */
	int updateByExample(@Param("record") ProductStockMst record, @Param("example") ProductStockMstExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT_STOCK_MST
	 * @mbg.generated  Thu Jan 16 18:26:50 JST 2020
	 */
	int updateByPrimaryKeySelective(ProductStockMst record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT_STOCK_MST
	 * @mbg.generated  Thu Jan 16 18:26:50 JST 2020
	 */
	int updateByPrimaryKey(ProductStockMst record);
}