package com.example.demo.entity.dto.response;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PurchaseHistorySearchListResponseDto {

	private Integer pageIndex;

	private Long resultsLength;

	private List<PurchaseHistorySearchResponseDto> purchaseHistorySearchResponseDtos;

}
