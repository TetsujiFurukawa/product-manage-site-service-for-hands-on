package com.example.demo.entity.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDto {

	private Boolean login;

	private Boolean adimn;

	private String userId;

	private String firstName;

	private String lastName;

}
