package com.example.demo.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.entity.domain.UserMst;
import com.example.demo.entity.security.LoginUserDetails;
import com.example.demo.repository.UserMstRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class LoginUserDetailsService implements UserDetailsService {

	private final UserMstRepository userMstRepository;

	@Override
	public UserDetails loadUserByUsername(String userAccount) throws UsernameNotFoundException {
		UserMst userMst = userMstRepository.findUserMstByAccount(userAccount);

		if (userMst == null) {
			throw new UsernameNotFoundException("The requested user is not found.");
		}

		return new LoginUserDetails(userMst);
	}

}
