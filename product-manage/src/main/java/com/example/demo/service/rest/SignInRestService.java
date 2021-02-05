package com.example.demo.service.rest;

import org.springframework.stereotype.Service;
import com.example.demo.entity.UserMstEx;
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
    UserMstEx userMstEx = principalService.getUserMstEx();

    // sets user mst data to session.
    sessionService.setupSession(userMstEx);

    SignInResponseDto signInResponseDto = createresponseDto(userMstEx);

    return signInResponseDto;

  }

  private SignInResponseDto createresponseDto(UserMstEx userMstEx) {

    // Returns user data.
    SignInResponseDto signInResponceDto =
        new SignInResponseDto(userMstEx.getUserAccount(), userMstEx.getUserName(),
            userMstEx.getUserLocale(), userMstEx.getUserLanguage(), userMstEx.getUserTimezone(),
            userMstEx.getUserTimezoneOffset(), userMstEx.getUserCurrency());

    return signInResponceDto;

  }

}
