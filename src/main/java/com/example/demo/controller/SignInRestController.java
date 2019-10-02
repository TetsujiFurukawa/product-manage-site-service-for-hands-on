package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.domain.dto.UserDto;
import com.example.demo.mockService.MockSignInService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/signin")
@CrossOrigin
public class SignInRestController {

	private final MockSignInService mockSignInService;

	@GetMapping
	public UserDto signIn() {
		return mockSignInService.signIn();
	}

}
