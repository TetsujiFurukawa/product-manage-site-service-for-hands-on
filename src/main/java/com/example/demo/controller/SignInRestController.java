package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.dto.response.SignInResponseDto;
import com.example.demo.service.rest.SignInRestService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/sign-in")
@RequiredArgsConstructor
public class SignInRestController {


	private final SignInRestService signInRestService;

	@PostMapping
	public SignInResponseDto signIn() {

		return signInRestService.signIn();

	}
}
