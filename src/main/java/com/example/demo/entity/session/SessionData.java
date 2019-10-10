package com.example.demo.entity.session;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@Scope(value="session", proxyMode=ScopedProxyMode.TARGET_CLASS)
public class SessionData implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer userSeq;

	private String userAccount;

	private String userName;

	private String userLang;

	private String userTimezone;

	private String userSubMenuRole;

	private String deleted;

}