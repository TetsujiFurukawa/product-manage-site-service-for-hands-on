package com.example.demo.entity.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SignInResponseDto {

	private String userAccount;

	private String userName;

	private String userLang;

	private String userTimezone;

}
