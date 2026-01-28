package com.paras.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paras.Repo.UserRepositry;
import com.paras.entity.User;

@RestController
@RequestMapping("/auth")  /// Ite mapping srva class la lagu hote
public class UserRestController {
	
	@Autowired
	UserRepositry repositry;
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@GetMapping("/welcome")
	public String Welcome() {
		return "Paras";
	}
	
	
	
	@PostMapping("/save")
	public ResponseEntity<User> saveUser(@RequestBody User user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		if(user.getUsername().equals("Paras"))
		{
			user.setRole("Admin");	
		}
		else
		{
			user.setRole("User");
		}
		
		User savedUser=repositry.save(user);
		return new ResponseEntity<User>(savedUser,HttpStatus.OK);
		}

}
