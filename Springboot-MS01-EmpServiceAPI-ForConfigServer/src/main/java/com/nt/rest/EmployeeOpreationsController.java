package com.nt.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee-api")
public class EmployeeOpreationsController {

	@Value("${db.username}")
	private String username;
	@Value("${db.password}")
	private String password;

	@GetMapping("/show")
	public ResponseEntity<String> showData() {
		return new ResponseEntity<>("DB Properties :: " + username + " == " + password, HttpStatus.OK);
	}
}
