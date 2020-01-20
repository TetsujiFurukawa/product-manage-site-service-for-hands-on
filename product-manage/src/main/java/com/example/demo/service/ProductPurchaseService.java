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

	public List<ProductMstProductPurchaseTbl> selectProductMstProductPurchaseTbl(
			ProductMstProductPurchaseTbl productMstProductPurchaseTbl, Integer limit, Long offset) {

		return productPurchaseTblMapper.selectProductMstProductPurchaseTbl(productMstProductPurchaseTbl, limit, offset);

	}

	public Long countProductMstProductPurchaseTbl(ProductMstProductPurchaseTbl productMstProductPurchaseTbl) {

		return productPurchaseTblMapper.countProductMstProductPurchaseTbl(productMstProductPurchaseTbl);

	}

	public void insertPurchase(ProductPurchaseTbl productPurchaseTbl) {

		productPurchaseTblMapper.insert(productPurchaseTbl);

	}

}
