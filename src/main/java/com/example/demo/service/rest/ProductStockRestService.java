package com.example.demo.service.rest;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.domain.ProductMst;
import com.example.demo.entity.domain.ProductStockMst;
import com.example.demo.entity.dto.request.ProductStockRequestDto;
import com.example.demo.entity.dto.response.ProductStockResponseDto;
import com.example.demo.exception.DataNotFoundException;
import com.example.demo.exception.ExclusiveProcessingException;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductStockService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductStockRestService extends BaseRestService {

	private final ProductService productService;

	private final ProductStockService productStockService;

	public ProductStockResponseDto getProductStockByCode(String productCode) throws IOException {

		ProductMst productMst = getProductMstByCode(productCode);

		ProductStockMst productStockMst = getProductStockMst(productMst.getProductSeq());

		return createProductStockResponseDto(productMst, productStockMst);

	}

	public ProductStockResponseDto updateProductStock(ProductStockRequestDto productStockRequestDto)
			throws IOException {

		ProductMst productMst = getProductMstByCode(productStockRequestDto.getProductCode());
		ProductStockMst productStockMst = getProductStockMst(productMst.getProductSeq());

		validateStockQuantity(productStockMst, productStockRequestDto);

		ProductStockMst updProductStockMst = createProductStockMst(productStockMst, productStockRequestDto);
		productStockService.updateStock(updProductStockMst);

		return getProductStockByCode(productStockRequestDto.getProductCode());

	}

	// --------------------------------------------------------------------------------
	// private methods
	// --------------------------------------------------------------------------------
	private ProductMst getProductMstByCode(String productCode) {
		List<ProductMst> productMstList = productService.getProductListByCode(productCode);

		if (productMstList.size() != 1) {
			throw new DataNotFoundException();
		}

		ProductMst productMst = productMstList.get(0);
		return productMst;

	}

	private ProductStockMst getProductStockMst(Long productSeq) {
		List<ProductStockMst> productStockMstList = productStockService.getProductStockMst(productSeq);

		if (productStockMstList.size() != 1) {
			throw new DataNotFoundException();
		}

		ProductStockMst productStockMst = productStockMstList.get(0);
		return productStockMst;

	}

	private ProductStockResponseDto createProductStockResponseDto(ProductMst productMst,
			ProductStockMst productStockMst) throws IOException {

		ProductStockResponseDto productStockResponseDto = new ProductStockResponseDto();

		productStockResponseDto.setProductCode(productMst.getProductCode());
		productStockResponseDto.setProductName(productMst.getProductName());
		productStockResponseDto.setProductGenre(productMst.getProductGenre());
		productStockResponseDto.setProductImage(productService.readProductImage(productMst.getProductCode()));
		productStockResponseDto.setProductSizeStandard(productMst.getProductSizeStandard());
		productStockResponseDto.setProductColor(productMst.getProductColor());
		productStockResponseDto.setProductStockQuantity(productStockMst.getProductStockQuantity());

		return productStockResponseDto;

	}

	private void validateStockQuantity(ProductStockMst productStockMst,
			ProductStockRequestDto productStockRequestDto) {

		if (!productStockMst.getProductStockQuantity().equals(productStockRequestDto.getProductStockQuantity())) {
			throw new ExclusiveProcessingException();
		}

	}

	private ProductStockMst createProductStockMst(ProductStockMst productStockMst,
			ProductStockRequestDto productStockRequestDto) {

		ProductStockMst updProductStockMst = new ProductStockMst();
		updProductStockMst.setProductStockSeq(productStockMst.getProductStockSeq());
		updProductStockMst.setProductStockQuantity(
				productStockMst.getProductStockQuantity() + productStockRequestDto.getUpdateProductStockQuantity());

		return updProductStockMst;
	}

}
