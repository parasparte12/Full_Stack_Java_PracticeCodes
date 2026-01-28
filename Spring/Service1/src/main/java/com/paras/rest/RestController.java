package com.paras.rest;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@GetMapping("/welcome")
	public String Welcome() {
		return "<h2>Welcome From Service 1</h2>	";
	}

}
