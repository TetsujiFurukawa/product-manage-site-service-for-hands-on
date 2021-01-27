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
import com.example.demo.entity.dto.request.ProductPurchaseHistoryRequestDto;
import com.example.demo.entity.dto.request.ProductPurchaseRequestDto;
import com.example.demo.entity.dto.response.ProductPurchaseHistorySearchListResponseDto;
import com.example.demo.entity.dto.response.ProductPurchaseResponseDto;
import com.example.demo.service.rest.ProductPurchaseRestService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class ProductPurchaseRestController {

  private final ProductPurchaseRestService productPurchaseRestService;

  /**
   * Search product purchase history list V 1.
   *
   * @param productPurchaseHistoryRequestDto the product purchase history request dto
   * @param pagenatorRequestDto the pagenator request dto
   * @return the product purchase history search list response dto
   */
  @GetMapping("/product-purchase-history-search/v1")
  public ProductPurchaseHistorySearchListResponseDto searchProductPurchaseHistoryListV1(
      @Validated ProductPurchaseHistoryRequestDto productPurchaseHistoryRequestDto,
      PagenatorRequestDto pagenatorRequestDto) {

    return productPurchaseRestService
        .getProductPurchaseHistoryList(productPurchaseHistoryRequestDto, pagenatorRequestDto);

  }

  /**
   * Gets the product purhase by code V 1.
   *
   * @param productCode the product code
   * @return the product purhase by code V 1
   * @throws IOException Signals that an I/O exception has occurred.
   */
  @GetMapping("/product-purchase/v1")
  public ProductPurchaseResponseDto getProductPurhaseByCodeV1(@NotNull String productCode)
      throws IOException {

    return productPurchaseRestService.getProductPurchaseByCode(productCode);

  }

  /**
   * Creates the product purchase V 1.
   *
   * @param productPurchaseRequestDto the product purchase request dto
   * @return the product purchase response dto
   * @throws IOException Signals that an I/O exception has occurred.
   */
  @PostMapping("/product-purchase/v1")
  public ProductPurchaseResponseDto createProductPurchaseV1(
      @RequestBody @Validated ProductPurchaseRequestDto productPurchaseRequestDto)
      throws IOException {

    return productPurchaseRestService.insertProductPurchase(productPurchaseRequestDto);

  }
}
