package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class DataNotFoundException extends RuntimeException {

	private static final String MESSAGE = "Data not found.";

	public DataNotFoundException() {
		super(MESSAGE);
	}
}
