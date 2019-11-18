package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ExclusiveProcessingException extends RuntimeException {

	private static final String MESSAGE = "Exclusive error occurred.";

	public ExclusiveProcessingException() {
		super(MESSAGE);
	}

}
