package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.session.SessionData;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AccountService {

	private final SessionData sessionData;

	public String getDeleted() {
		return sessionData.getDeleted();
	}

	public String getUserAccount() {
		return sessionData.getUserAccount();
	}

	public String getUserLang() {
		return sessionData.getUserLang();
	}

	public String getUserName() {
		return sessionData.getUserName();
	}

	public Integer getUserSeq() {
		return sessionData.getUserSeq();
	}

	public String getUserTimezone() {
		return sessionData.getUserTimezone();
	}

	public String toString() {
		return "UserSeq:" + sessionData.getUserSeq()
		+ ", UserSeq:" + sessionData.getUserAccount()
		+", UserName:" + sessionData.getUserName()
				+ ", UserLang:" + sessionData.getUserLang()
				+", UserTimezone:" +  sessionData.getUserTimezone();
	}

}
