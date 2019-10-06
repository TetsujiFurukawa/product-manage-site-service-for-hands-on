package com.example.demo.service.rest;

import org.springframework.stereotype.Service;

import com.example.demo.entity.domain.UserMst;
import com.example.demo.entity.dto.responce.SignInResponceDto;
import com.example.demo.service.security.AuthenticationService;
import com.example.demo.service.session.SessionService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SignInRestService extends BaseRestService{

	private final AuthenticationService principalService;
	private final SessionService sessionService;

	public SignInResponceDto signIn() {

		// Gets user mst data.
		UserMst userMst=principalService.getUserMst();

		// sets user mst data to session.
		sessionService.setupSession(userMst);

		// Returns user data.
		SignInResponceDto signInResponceDto = new SignInResponceDto(userMst.getUserAccount(), userMst.getUserName(),userMst.getUserLang(),userMst.getUserTimezone());

		return signInResponceDto;

	}

}
