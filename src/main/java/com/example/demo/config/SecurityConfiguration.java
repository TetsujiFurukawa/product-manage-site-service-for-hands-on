package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	@Override
	public void configure(WebSecurity webSecurity) throws Exception {

		webSecurity.ignoring().antMatchers("/webjars");

	}

	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		httpSecurity
				.httpBasic()
				.and()
				.authorizeRequests().anyRequest().authenticated()
				.and()
				.csrf().disable();

//TODO csrf for login
//				.csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());

	}

	@Bean
	PasswordEncoder passwordEncoder() {

		return new Pbkdf2PasswordEncoder();

	}

}