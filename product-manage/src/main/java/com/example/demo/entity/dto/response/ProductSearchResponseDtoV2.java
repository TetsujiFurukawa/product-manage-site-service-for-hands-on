package com.example.demo.entity.dto.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=false)
@NoArgsConstructor
public class ProductSearchResponseDtoV2 extends ProductSearchResponseDto{

	private String productCurrency;

}