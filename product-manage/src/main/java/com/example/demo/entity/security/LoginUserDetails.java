package com.example.demo.entity.security;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

import com.example.demo.entity.domain.UserMst;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class LoginUserDetails extends User {

  private static final long serialVersionUID = 6528512253200044197L;
  private final UserMst userMst;

  /**
   * Instantiates a new login user details.
   *
   * @param userMst the user mst
   */
  public LoginUserDetails(UserMst userMst) {

    super(userMst.getUserAccount(), userMst.getUserEncodedPassword(),
        AuthorityUtils.createAuthorityList("ROLE_USER"));
    this.userMst = userMst;

  }

}
