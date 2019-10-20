package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.domain.ProductMst;
import com.example.demo.entity.domain.ProductMstStockMst;
import com.example.demo.mybatis.ProductMstMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {

	private final ProductMstMapper productMstMapper;

	public List<ProductMstStockMst> selectProductMstStockMst(ProductMst searchProductMst, Integer limit, Long offset) {

		return productMstMapper.selectProductMstStockMst(searchProductMst, limit, offset);

	}

}
