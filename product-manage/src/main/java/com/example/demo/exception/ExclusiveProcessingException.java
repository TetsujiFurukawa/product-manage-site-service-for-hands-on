package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class ExclusiveProcessingException extends RuntimeException {

	private static final long serialVersionUID = -2291717909225642950L;
	private static final String MESSAGE = "Exclusive error occurred.";

	public ExclusiveProcessingException() {
		super(MESSAGE);
	}

}
