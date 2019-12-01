package com.example.demo.controller;

import java.io.IOException;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.dto.request.PagenatorRequestDto;
import com.example.demo.entity.dto.request.PurchaseHistoryRequestDto;
import com.example.demo.entity.dto.request.PurchaseRequestDto;
import com.example.demo.entity.dto.response.PurchaseHistorySearchListResponseDto;
import com.example.demo.entity.dto.response.PurchaseResponseDto;
import com.example.demo.service.rest.PurchaseRestService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class PurchaseRestController {

	private final PurchaseRestService purchaseRestService;

	@GetMapping("/purchase-history-search/v1")
	public PurchaseHistorySearchListResponseDto searchPurchaseHistoryListV1(
			@Validated PurchaseHistoryRequestDto purchaseHistoryRequestDto, PagenatorRequestDto pagenatorRequestDto) {

		return purchaseRestService.getPurchaseHistoryList(purchaseHistoryRequestDto, pagenatorRequestDto);

	}

	@GetMapping("/purchase/v1")
	public PurchaseResponseDto getByCodeV1(@NotNull String productCode) throws IOException {

		return purchaseRestService.getByCode(productCode);

	}

	@PostMapping("/purchase/v1")
	public PurchaseResponseDto createV1(@RequestBody @Validated PurchaseRequestDto purchaseRequestDto)
			throws IOException {

		return purchaseRestService.insertPurchase(purchaseRequestDto);

	}
}
