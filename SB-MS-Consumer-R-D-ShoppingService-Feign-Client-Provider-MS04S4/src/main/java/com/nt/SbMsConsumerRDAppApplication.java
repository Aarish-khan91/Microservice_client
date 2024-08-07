package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
@EnableFeignClients
public class SbMsConsumerRDAppApplication {

	public static void main(String[] args) {
		log.debug("start of main() method");
		SpringApplication.run(SbMsConsumerRDAppApplication.class, args);
		log.debug("end of main() method");
	}

}
