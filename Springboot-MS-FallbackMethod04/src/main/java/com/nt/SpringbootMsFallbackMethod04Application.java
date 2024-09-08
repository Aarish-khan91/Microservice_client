package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
@EnableHystrix
@SpringBootApplication
public class SpringbootMsFallbackMethod04Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMsFallbackMethod04Application.class, args);
	}

}
