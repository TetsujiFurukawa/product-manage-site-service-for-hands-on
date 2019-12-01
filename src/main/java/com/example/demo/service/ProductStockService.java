package com.example.demo.service;

import java.util.Date;
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

	public void insertProductStock(ProductStockMst productStockMst) {
		Date now = new Date();

		productStockMst.setEnterUser("system");
		productStockMst.setEnterDate(now);
		productStockMst.setUpdateUser("system");
		productStockMst.setUpdateDate(now);

		productStockMstMapper.insert(productStockMst);

	}

	public List<ProductStockMst> getProductStockMst(Long productSeq) {

		ProductStockMstExample productStockMstExample = new ProductStockMstExample();
		productStockMstExample.createCriteria().andProductSeqEqualTo(productSeq);

		return productStockMstMapper.selectByExample(productStockMstExample);

	}

	public void updateStock(ProductStockMst productStockMst) {

		productStockMstMapper.updateByPrimaryKeySelective(productStockMst);

	}

}
