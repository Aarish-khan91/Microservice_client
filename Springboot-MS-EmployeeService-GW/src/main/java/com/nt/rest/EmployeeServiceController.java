package com.nt.rest;

import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee-api")
public class EmployeeServiceController {

	@GetMapping("/report")
	public ResponseEntity<String>  show(){
		return new ResponseEntity<>("<h1 style=\"text-align:center;color:red\">Employee Service is available now : "+new Date()+"  </h1>",org.springframework.http.HttpStatus.ACCEPTED);
	}
	
}
