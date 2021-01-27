package com.example.demo.entity.dto.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductListRequestDto {

  @Size(max = 50)
  private String productName;

  @Size(max = 20)
  private String productCode;

  @Size(max = 50)
  private String productGenre;

  @NotNull
  private Boolean endOfSale;

}
