package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/offers")
	public String showMaterials(Map <String,Object> map) {
		map.put("Clothes", new String[] {"T-shirt","Trousers","Pents"});
		return "materials";
	}
	
	@GetMapping("/add")
	public String showadd(Map <String,Object> map) {
		map.put("Clothes", new String[] {"T-shirt","Trousers","Pents"});
		return "add";
	}
	
	
	
}
