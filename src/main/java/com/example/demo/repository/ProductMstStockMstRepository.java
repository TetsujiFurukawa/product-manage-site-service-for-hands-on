package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.domain.ProductMstStockMst;

public interface ProductMstStockMstRepository extends JpaRepository<ProductMstStockMst, Long> {

	@Query(value = "SELECT" +
			"  PRD.PRODUCT_CODE" +
			"  , PRD.PRODUCT_NAME" +
			"  , PRD.PRODUCT_GENRE" +
			"  , PRD.PRODUCT_SIZE_STANDARD" +
			"  , PRD.PRODUCT_COLOR" +
			"  , PRD.PRODUCT_UNIT_PRICE" +
			"  , PRD.END_OF_SALE" +
			"  , STK.PRODUCT_STOCK_QUANTITY " +
			"FROM" +
			"  PRODUCT_MST PRD " +
			"  INNER JOIN PRODUCT_STOCK_MST STK " +
			"    ON STK.PRODUCT_SEQ = PRD.PRODUCT_SEQ " +
			"WHERE" +
			"  1 = 1 " +
			"  AND PRD.PRODUCT_NAME = :productName " +
			"  AND PRD.PRODUCT_CODE = :productCode " +
			"  AND PRD.PRODUCT_GENRE = :productGenre " +
			"  AND PRD.DELETED = :deleted", nativeQuery = true)

	List<ProductMstStockMst> getProductMstStockMstList(

			@Param("productName") String productName,
			@Param("productCode") String productCode,
			@Param("productGenre") String productGenre,
			@Param("deleted") Boolean deleted);

}