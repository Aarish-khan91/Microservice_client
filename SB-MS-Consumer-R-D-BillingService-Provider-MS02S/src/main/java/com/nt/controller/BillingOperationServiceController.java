package com.nt.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing-api")
public class BillingOperationServiceController {

	@Bean
	
	@GetMapping("/billing")
	public ResponseEntity<String> getInfo() {
		return new ResponseEntity<>("We accept UPI payment Debit card / Credit card / etc.", HttpStatus.OK);
	}
}
