package com.example.demo.service.rest;

import org.springframework.stereotype.Service;

import com.example.demo.entity.domain.UserMst;
import com.example.demo.entity.dto.response.SignInResponseDto;
import com.example.demo.service.security.AuthenticationService;
import com.example.demo.service.session.SessionService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SignInRestService extends BaseRestService {

  private final AuthenticationService principalService;
  private final SessionService sessionService;

  /**
   * Sign in.
   *
   * @return the sign in response dto
   */
  public SignInResponseDto signIn() {

    // Gets user mst data.
    UserMst userMst = principalService.getUserMst();

    // sets user mst data to session.
    sessionService.setupSession(userMst);

    SignInResponseDto signInResponseDto = createresponseDto(userMst);

    return signInResponseDto;

  }

  private SignInResponseDto createresponseDto(UserMst userMst) {

    // Returns user data.
    SignInResponseDto signInResponceDto = new SignInResponseDto(userMst.getUserAccount(),
        userMst.getUserName(), userMst.getUserLocale(), userMst.getUserLanguage(),
        userMst.getUserTimezone(), userMst.getUserTimezoneOffset(), userMst.getUserCurrency());
    return signInResponceDto;

  }

}
