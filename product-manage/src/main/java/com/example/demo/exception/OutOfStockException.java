package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class OutOfStockException extends RuntimeException {

	private static final long serialVersionUID = 122600596250894482L;
	private static final String MESSAGE = "There is no stock.";

	public OutOfStockException() {
		super(MESSAGE);
	}
}
