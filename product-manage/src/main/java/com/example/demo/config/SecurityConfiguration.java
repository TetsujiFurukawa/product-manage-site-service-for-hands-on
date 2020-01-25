package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	private static final String API_SIGN_OUT = "/api/sign-out/*";
	private static final String API_SIGN_IN = "/api/sign-in/*";

	private static final String PRODUCT_IMAGES = "/product-images/*";

	@Override
	public void configure(WebSecurity webSecurity) throws Exception {

		webSecurity.ignoring().antMatchers("/*", PRODUCT_IMAGES);

	}

	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		httpSecurity
				.httpBasic()
				.and()
				.authorizeRequests().anyRequest().authenticated()
				.and()
				.csrf().ignoringAntMatchers(API_SIGN_IN, API_SIGN_OUT)
				.csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());

		httpSecurity.logout()
				.logoutRequestMatcher(new AntPathRequestMatcher(API_SIGN_OUT));
	}

	@Bean
	PasswordEncoder passwordEncoder() {

		return new Pbkdf2PasswordEncoder();

	}

}