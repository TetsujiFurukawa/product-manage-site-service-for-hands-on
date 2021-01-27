package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.domain.ProductMstProductPurchaseTbl;
import com.example.demo.entity.domain.ProductPurchaseTbl;
import com.example.demo.repository.ProductPurchaseTblMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductPurchaseService {

  private final ProductPurchaseTblMapper productPurchaseTblMapper;

  /**
   * Select product mst product purchase tbl.
   *
   * @param productMstProductPurchaseTbl the product mst product purchase tbl
   * @param limit the limit
   * @param offset the offset
   * @return the list
   */
  public List<ProductMstProductPurchaseTbl> selectProductMstProductPurchaseTbl(
      ProductMstProductPurchaseTbl productMstProductPurchaseTbl, Integer limit, Long offset) {

    return productPurchaseTblMapper.selectProductMstProductPurchaseTbl(productMstProductPurchaseTbl,
        limit, offset);

  }

  /**
   * Count product mst product purchase tbl.
   *
   * @param productMstProductPurchaseTbl the product mst product purchase tbl
   * @return the long
   */
  public Long countProductMstProductPurchaseTbl(
      ProductMstProductPurchaseTbl productMstProductPurchaseTbl) {

    return productPurchaseTblMapper.countProductMstProductPurchaseTbl(productMstProductPurchaseTbl);

  }

  /**
   * Insert purchase.
   *
   * @param productPurchaseTbl the product purchase tbl
   */
  public void insertPurchase(ProductPurchaseTbl productPurchaseTbl) {

    productPurchaseTblMapper.insert(productPurchaseTbl);

  }

}
