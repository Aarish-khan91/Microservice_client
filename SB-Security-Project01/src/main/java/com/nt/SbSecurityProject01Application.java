package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
@EnableWebSecurity
public class SbSecurityProject01Application {

	public static void main(String[] args) {
		log.debug("main() start");
		SpringApplication.run(SbSecurityProject01Application.class, args);
		log.debug("main() end");

	}

}
