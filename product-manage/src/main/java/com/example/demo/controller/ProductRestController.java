package com.example.demo.controller;

import java.io.IOException;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.dto.ProductDto;
import com.example.demo.entity.dto.request.PagenatorRequestDto;
import com.example.demo.entity.dto.request.ProductListRequestDto;
import com.example.demo.entity.dto.response.ProductSearchListResponseDto;
import com.example.demo.service.rest.ProductRestService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class ProductRestController {
  private final ProductRestService productRestService;

  /**
   * Search product list V 1.
   *
   * @param productListRequestDto the product list request dto
   * @param pagenatorRequestDto the pagenator request dto
   * @return the product search list response dto
   */
  @GetMapping("/product-search/v1")
  public ProductSearchListResponseDto searchProductListV1(
      @Validated ProductListRequestDto productListRequestDto,
      PagenatorRequestDto pagenatorRequestDto) {

    return productRestService.getProductList(productListRequestDto, pagenatorRequestDto);

  }

  /**
   * Gets the product by code V 1.
   *
   * @param productCode the product code
   * @return the product by code V 1
   * @throws IOException Signals that an I/O exception has occurred.
   */
  @GetMapping("/product/v1")
  public ProductDto getProductByCodeV1(@NotNull String productCode) throws IOException {

    return productRestService.getProductByCode(productCode);

  }

  /**
   * Creates the product V 1.
   *
   * @param productDto the product dto
   * @return the product dto
   * @throws IOException Signals that an I/O exception has occurred.
   */
  @PostMapping("/product/v1")
  public ProductDto createProductV1(@RequestBody @Validated ProductDto productDto)
      throws IOException {

    return productRestService.insertProduct(productDto);

  }

  /**
   * Update product V 1.
   *
   * @param productDto the product dto
   * @return the product dto
   * @throws IOException Signals that an I/O exception has occurred.
   */
  @PutMapping("/product/v1")
  public ProductDto updateProductV1(@RequestBody @Validated ProductDto productDto)
      throws IOException {

    return productRestService.updateProduct(productDto);

  }

  /**
   * Gets the product genre V 1.
   *
   * @return the product genre V 1
   */
  @GetMapping("/product-genre/v1")
  public List<String> getProductGenreV1() {

    return productRestService.getProductGenre();

  }

}