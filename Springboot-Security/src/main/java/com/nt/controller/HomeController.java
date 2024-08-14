package com.nt.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.User;
import com.nt.service.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {

	@Autowired
	private UserService userService;

	@GetMapping
	public List<User> show() {
		return userService.getAllUsers();
	}

	@GetMapping("/show")
	public String sho(Principal principal) {
		return principal.getName();
	}
}
