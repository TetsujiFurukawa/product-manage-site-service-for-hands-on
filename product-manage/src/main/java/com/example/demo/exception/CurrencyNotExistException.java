package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class CurrencyNotExistException extends RuntimeException {

	private static final long serialVersionUID = 7835093425075959014L;
	private static final String MESSAGE = "Currency does not exist.";

	public CurrencyNotExistException() {
		super(MESSAGE);
	}
}
