package com.nt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SearchServiceConsumerController {

	@GetMapping("/info")
	public String getInfo() {
		return "Welcome to Amazon.com";
	}
}
