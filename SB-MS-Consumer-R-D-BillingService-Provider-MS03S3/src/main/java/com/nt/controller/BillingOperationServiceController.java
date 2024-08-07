package com.nt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/billing-api")
@Slf4j
public class BillingOperationServiceController {

	@Value("${server.port}")
	private Integer port;

	@Value("${eureka.instance.instance-id}")
	private String instanceId;

	@GetMapping("/billing")
	public ResponseEntity<String> getInfo() {
		log.debug("start of the getInfo() method");

		return new ResponseEntity<>("We accept UPI payment Debitcards , Creditcards and etc... from the instanceId : "
				+ instanceId + " ... " + port, HttpStatus.OK);
	}
}
