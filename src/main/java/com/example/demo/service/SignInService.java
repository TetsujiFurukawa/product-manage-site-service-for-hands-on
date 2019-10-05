package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.dto.UserDto;

@Service
public class SignInService {

	public UserDto signIn() {

		UserDto userDto = new UserDto(true, true, "user0001", "福岡", "太郎");

		return userDto;

	}

}
