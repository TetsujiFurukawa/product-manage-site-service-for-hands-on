package com.example.demo.entity.security;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

import com.example.demo.entity.domain.UserMst;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class LoginUserDetails extends User{

	private final UserMst userMst;

	public LoginUserDetails(UserMst userMst) {

		super(userMst.getUserAccount(),userMst.getUserEncodedPassword(),AuthorityUtils.createAuthorityList("ROLE_USER"));
		this.userMst=userMst;

	}

}
