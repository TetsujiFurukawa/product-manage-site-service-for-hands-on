package com.example.demo.entity.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PagenatorRequestDto {

	private Integer pageSize;
	private Integer pageIndex;

}
