package com.example.demo.service.security;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.entity.domain.UserMst;
import com.example.demo.entity.domain.UserMstExample;
import com.example.demo.entity.security.LoginUserDetails;
import com.example.demo.repository.UserMstMapper;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class LoginUserDetailsService implements UserDetailsService {

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

    UserMstExample userMstExample = new UserMstExample();
    userMstExample.createCriteria().andUserAccountEqualTo(userAccount);
    List<UserMst> userMsts = userMstMapper.selectByExample(userMstExample);

    if (userMsts.size() == 0) {
      throw new UsernameNotFoundException("The requested user is not found.");
    }

    return new LoginUserDetails(userMsts.get(0));

  }

}
