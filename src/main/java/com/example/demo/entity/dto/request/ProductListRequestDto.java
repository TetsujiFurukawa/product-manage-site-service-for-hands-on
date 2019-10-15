package com.example.demo.entity.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductListRequestDto {

	private String productName;

	private String productCode;

	private String productGenre;

	private Boolean deleted;

}
