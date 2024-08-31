package com.nt.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer-api")
@RefreshScope
public class CustomerOpreationsController {

	@Value("${db.username}")
	private String uname;
	@Value("${db.password}")
	private String pword;
	
	@GetMapping("/show")
	public ResponseEntity<String> showData(){
		return new ResponseEntity<>("DB Properties :: "+uname+" == "+pword,HttpStatus.OK);
	}
}
