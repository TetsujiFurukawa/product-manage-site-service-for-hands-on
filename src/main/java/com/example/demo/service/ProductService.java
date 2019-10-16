package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.domain.ProductMst;
import com.example.demo.entity.domain.ProductMstStockMst;
import com.example.demo.repository.ProductMstStockMstRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {

	private final ProductMstStockMstRepository productMstStockMstRepository;

	public List<ProductMstStockMst> getProductList(ProductMst searchProductMst, Integer pageSize, Integer pageIndex) {

		return productMstStockMstRepository.getProductMstStockMstList(searchProductMst.getProductName(),
				searchProductMst.getProductCode(), searchProductMst.getProductGenre(), searchProductMst.getDeleted());
	}

}
