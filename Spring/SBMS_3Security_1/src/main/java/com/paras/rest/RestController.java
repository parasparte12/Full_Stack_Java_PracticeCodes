package com.paras.rest;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@GetMapping("/welcome") // for ex admin
	public String welcome() {
		return "Welcome to Paras";
	}
	@GetMapping("/welcom")  //for ex user
	public String welcom() {
		return "Welcome to Paras";
	}

}
