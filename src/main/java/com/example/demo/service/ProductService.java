package com.example.demo.service;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.domain.ProductMst;
import com.example.demo.entity.domain.ProductMstExample;
import com.example.demo.entity.domain.ProductMstStockMst;
import com.example.demo.properties.ProductImageProperties;
import com.example.demo.repository.ProductMstMapper;
import com.example.demo.service.file.ImageFileService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {

	private final ProductMstMapper productMstMapper;
	private final AccountService accountService;
	private final ImageFileService imageFileService;
	private final ProductImageProperties productImagesProperties;

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

	public ProductMst insertProduct(ProductMst productMst) {
		// TODO I will correct it lator.
		Date now = new Date();
		setupEnterInfo(productMst);
		setupUpdateInfo(productMst, now);

		productMstMapper.insert(productMst);
		return getProductListByCode(productMst.getProductCode()).get(0);
	}

	public ProductMst updateProduct(ProductMst productMst) {
		// TODO I will correct it lator.
		productMstMapper.updateByPrimaryKey(productMst);
		return productMstMapper.selectByPrimaryKey(productMst.getProductSeq());
	}

	public void writeProductImage(String productCode, String base64string) throws IOException {

		String filePath = getFilePath(productCode);

		imageFileService.write(filePath, base64string);
	}

	public String readProductImage(String productCode) throws IOException {

		String filePath = getFilePath(productCode);

		return imageFileService.read(filePath);
	}

	private void setupUpdateInfo(ProductMst productMst, Date now) {
		productMst.setEnterDate(now);
		productMst.setUpdateDate(now);
	}

	private void setupEnterInfo(ProductMst productMst) {
		productMst.setEnterUser(accountService.getUserName());
		productMst.setUpdateUser(accountService.getUserName());
	}

	private String getFilePath(String productCode) {

		Path path = Paths.get(productImagesProperties.getUploadDirectory() + productCode
				+ productImagesProperties.getDefaultExtension());

		return path.toString();
	}
}
