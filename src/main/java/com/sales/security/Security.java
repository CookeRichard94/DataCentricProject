package com.sales.security;

import org.springframework.beans.factory.annotation.Autowired;

/*@EnableWebSecurity
public class Security   {

	@Override
	public void configure(HttpSecurity httpSecurity) throws Exception {
		// URLs on which spring security should be applied
		httpSecurity.authorizeRequests().antMatchers("").hasRole("USER")
				.and().formLogin();
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("user")// username is "user"
				.password("user") // password is "user"
				.roles("USER");// spring security role
}*/