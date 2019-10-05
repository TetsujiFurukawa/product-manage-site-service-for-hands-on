package com.example.demo.entity.dto.responce;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SignInResponceDto {

	private Boolean login;

	private Boolean adimn;

	private String userId;

	private String firstName;

	private String lastName;

}
