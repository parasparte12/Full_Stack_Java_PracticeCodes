package com.paras.rest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.paras.entity.User;
import com.paras.repo.UserRepositry;

@Repository
public class UserRestController {
	
	
	@GetMapping("/Welcome")
	public String WelcomeMsg() { 
		return "Welcome to Every Berozgar IT Engineer Including Me";
		
	}
	
	@Autowired
	UserRepositry repositry;
	@Autowired
	PasswordEncoder encoder;
	
	@PostMapping("/save")
	public ResponseEntity<User> createUsers(@RequestBody User user) {
		
		 user.setPassword(encoder.encode(user.getPassword()));
		 //user.setRole("USER");
		 User savedUser = repositry.save(user);
		 return new ResponseEntity<User>(savedUser,HttpStatus.CREATED);
	}

}
