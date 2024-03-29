package com.example.demo.service.security;

import java.util.List;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.example.demo.entity.UserMstEx;
import com.example.demo.entity.domain.UserMst;
import com.example.demo.entity.domain.UserMstExample;
import com.example.demo.entity.security.LoginUserDetails;
import com.example.demo.repository.UserMstMapper;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class LoginUserDetailsService implements UserDetailsService {

  private static final int MAX_DIGIT_USER_ACCOUNT = 100;

  private static final String THE_REQUESTED_USER_IS_NOT_FOUND = "The requested user is not found.";

  private final UserMstMapper userMstMapper;

  /**
   * Load user by username.
   *
   * @param userAccount the user account
   * @return the user details
   * @throws UsernameNotFoundException the username not found exception
   */
  @Override
  public UserDetails loadUserByUsername(String userAccount) throws UsernameNotFoundException {

    if (MAX_DIGIT_USER_ACCOUNT < userAccount.length()) {
      throw new UsernameNotFoundException(THE_REQUESTED_USER_IS_NOT_FOUND);
    }

    UserMstExample userMstExample = new UserMstExample();
    userMstExample.createCriteria().andUserAccountEqualTo(userAccount);
    List<UserMst> userMsts = userMstMapper.selectByExample(userMstExample);

    if (userMsts.size() == 0) {
      throw new UsernameNotFoundException(THE_REQUESTED_USER_IS_NOT_FOUND);
    }

    UserMstEx userMstEx = createUserMstEx(userMsts.get(0));

    return new LoginUserDetails(userMstEx);

  }

  private UserMstEx createUserMstEx(UserMst userMst) {

    UserMstEx userMstEx = new UserMstEx();
    userMstEx.setUserSeq(userMst.getUserSeq());
    userMstEx.setUserAccount(userMst.getUserAccount());
    userMstEx.setUserEncodedPassword(userMst.getUserEncodedPassword());
    userMstEx.setUserName(userMst.getUserName());
    userMstEx.setUserLocale(userMst.getUserLocale());
    userMstEx.setUserTimezone(userMst.getUserTimezone());
    userMstEx.setUserTimezoneOffset(userMst.getUserTimezoneOffset());
    userMstEx.setUserCurrency(userMst.getUserCurrency());
    userMstEx.setUserSubMenuRole(userMst.getUserSubMenuRole());

    return userMstEx;

  }

}
