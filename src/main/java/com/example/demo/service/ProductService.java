package com.example.demo.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.domain.ProductMst;
import com.example.demo.entity.domain.ProductMstExample;
import com.example.demo.entity.domain.ProductMstStockMst;
import com.example.demo.repository.ProductMstMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {

	private final ProductMstMapper productMstMapper;
	private final AccountService accountService;

	public List<ProductMstStockMst> selectProductMstStockMst(ProductMst searchProductMst, Integer limit, Long offset) {

		return productMstMapper.selectProductMstStockMst(searchProductMst, limit, offset);

	}

	public Long countProductMstStockMst(ProductMst productMst) {

		return productMstMapper.countProductMstStockMst(productMst);

	}

	public List<ProductMst> getProductListByCode(String productCode) {

		ProductMstExample producMstExample = new ProductMstExample();
		producMstExample.createCriteria().andProductCodeEqualTo(productCode);

		return productMstMapper.selectByExample(producMstExample);
	}

	public ProductMst create(ProductMst productMst) {
		// TODO I will correct it lator.
		Date now = new Date();
		setupEnterInfo(productMst);
		setupUpdateInfo(productMst, now);

		productMstMapper.insert(productMst);
		return productMstMapper.selectByPrimaryKey(productMst.getProductSeq());
	}

	public ProductMst update(ProductMst productMst) {
		// TODO I will correct it lator.
		productMstMapper.updateByPrimaryKey(productMst);
		return productMstMapper.selectByPrimaryKey(productMst.getProductSeq());
	}

	private void setupUpdateInfo(ProductMst productMst, Date now) {
		productMst.setEnterDate(now);
		productMst.setUpdateDate(now);
	}

	private void setupEnterInfo(ProductMst productMst) {
		productMst.setEnterUser(accountService.getUserName());
		productMst.setUpdateUser(accountService.getUserName());
	}

}
