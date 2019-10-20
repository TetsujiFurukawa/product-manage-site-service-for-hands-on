package com.example.demo.entity.dto.response;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductListResponseDto {

	private Integer pageIndex;

	private Long resultsLength;

	private List<ProductResponseDto> productResponseDtos;

}
