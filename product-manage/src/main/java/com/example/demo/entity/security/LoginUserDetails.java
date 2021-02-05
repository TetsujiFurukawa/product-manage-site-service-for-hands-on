package com.example.demo.entity.security;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import com.example.demo.entity.UserMstEx;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginUserDetails extends User {

  private static final long serialVersionUID = 6528512253200044197L;
  private final UserMstEx userMstEx;


  /**
   * Instantiates a new login user details.
   *
   * @param userMstEx the user mst ex
   */
  public LoginUserDetails(UserMstEx userMstEx) {

    super(userMstEx.getUserAccount(), userMstEx.getUserEncodedPassword(),
        AuthorityUtils.createAuthorityList("ROLE_USER"));

    this.userMstEx = userMstEx;

  }

  /**
   * Equals.
   *
   * @param object the object
   * @return true, if successful
   */
  @Override
  public boolean equals(Object object) {

    return super.equals(object);

  }


  /**
   * Hash code.
   *
   * @return the int
   */
  @Override
  public int hashCode() {

    return super.hashCode();

  }

}
