package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.dto.request.PagenatorRequestDto;
import com.example.demo.entity.dto.request.ProductListRequestDto;
import com.example.demo.entity.dto.response.ProductListResponseDto;
import com.example.demo.service.rest.ProductRestService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class ProductRestController {
	private final ProductRestService productRestService;

	@GetMapping("/product-list")
	public ProductListResponseDto searchProductList(PagenatorRequestDto pagenatorRequestDto,ProductListRequestDto productListRequestDto) {
		return productRestService.getProductList(productListRequestDto,pagenatorRequestDto);
	}

//	@GetMapping("/product")
//	public CompanyDto getCompany(Long companySeq) {
//		return mockCompanyService.getCompany(companySeq);
//	}
//
//	@PostMapping("/product")
//	public CompanyDto createCompany(@RequestBody CompanyDto companyDto) {
//		return mockCompanyService.createCompany(companyDto);
//	}
//
//	@PutMapping("/product")
//	public CompanyDto updateCompany(@RequestBody CompanyDto companyDto) {
//		return mockCompanyService.updateCompany(companyDto);
//	}

}
