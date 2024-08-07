package com.nt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	public void config(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("raja").password("{noop}1313").roles("MANAGER");
		auth.inMemoryAuthentication().withUser("rani").password("{noop}1212").roles("MANAGER");
		auth.inMemoryAuthentication().withUser("baba").password("{noop}1365").roles("MANAGER", "CUSTOMER");
		auth.inMemoryAuthentication().withUser("babu").password("{noop}delhi").roles("VISITOR");

	}
	
	
}
