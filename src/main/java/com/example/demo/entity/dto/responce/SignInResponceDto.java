package com.example.demo.entity.dto.responce;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SignInResponceDto {

	private String userAccount;

	private String userName;

	private String userLang;

	private String userTimezone;

}
