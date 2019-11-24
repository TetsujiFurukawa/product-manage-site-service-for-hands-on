package com.example.demo.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.example.demo.entity.domain.ProductStockMst;
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

}
