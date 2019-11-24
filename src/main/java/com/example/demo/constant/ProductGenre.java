package com.example.demo.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ProductGenre {

	SHOES(1, "productGenre.shoes"), TOPS(2, "productGenre.tops"), BAGS(3, "productGenre.bags");

	private final int code;
	private final String property;

}
