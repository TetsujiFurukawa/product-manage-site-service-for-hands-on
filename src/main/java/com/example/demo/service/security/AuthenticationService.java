package com.example.demo.service.security;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.example.demo.entity.domain.UserMst;
import com.example.demo.entity.security.LoginUserDetails;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

	public final UserMst getUserMst() {

		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		LoginUserDetails test=((LoginUserDetails)principal);

		return test.getUserMst();


	}

}