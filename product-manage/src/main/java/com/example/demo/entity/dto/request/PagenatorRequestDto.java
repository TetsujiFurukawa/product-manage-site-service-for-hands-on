package com.example.demo.entity.dto.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PagenatorRequestDto {

	@NotNull
	@Min(1)
	private Integer pageSize;

	@NotNull
	@Min(1)
	private Integer pageIndex;

}
