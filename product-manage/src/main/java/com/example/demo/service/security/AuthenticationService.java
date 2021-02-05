package com.example.demo.service.security;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import com.example.demo.entity.UserMstEx;
import com.example.demo.entity.security.LoginUserDetails;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthenticationService {


  /**
   * Gets the user mst ex.
   *
   * @return the user mst ex
   */
  public final UserMstEx getUserMstEx() {

    Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

    LoginUserDetails loginUserDetails = ((LoginUserDetails) principal);

    return loginUserDetails.getUserMstEx();

  }

}
