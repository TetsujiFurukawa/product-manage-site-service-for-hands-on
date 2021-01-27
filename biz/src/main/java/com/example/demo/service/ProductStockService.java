package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.domain.ProductStockMst;
import com.example.demo.entity.domain.ProductStockMstExample;
import com.example.demo.repository.ProductStockMstMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductStockService {

  private final ProductStockMstMapper productStockMstMapper;

  /**
   * Insert product stock.
   *
   * @param productStockMst the product stock mst
   */
  public void insertProductStock(ProductStockMst productStockMst) {

    productStockMstMapper.insert(productStockMst);

  }

  /**
   * Gets the product stock mst.
   *
   * @param productSeq the product seq
   * @return the product stock mst
   */
  public List<ProductStockMst> getProductStockMst(Long productSeq) {

    ProductStockMstExample productStockMstExample = new ProductStockMstExample();
    productStockMstExample.createCriteria().andProductSeqEqualTo(productSeq);

    return productStockMstMapper.selectByExample(productStockMstExample);

  }

  /**
   * Update stock.
   *
   * @param productStockMst the product stock mst
   */
  public void updateStock(ProductStockMst productStockMst) {

    productStockMstMapper.updateByPrimaryKeySelective(productStockMst);

  }

}
