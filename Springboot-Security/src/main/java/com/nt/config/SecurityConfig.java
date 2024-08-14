package com.nt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig {

	@Bean
	public UserDetailsService get() {

		UserDetails user1 = User.builder().username("aarish").password(getPassword().encode("abc")).roles("ADMIN")
				.build();
		UserDetails user2 = User.builder().username("jhon").password(getPassword().encode("aaa")).roles("ADMIN")
				.build();

		return new InMemoryUserDetailsManager(user1, user2);
	}

	@Bean
	public PasswordEncoder getPassword() {
		return new BCryptPasswordEncoder();
	}
}
