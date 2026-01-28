package com.paras.rest;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.paras.dto.UserDTO;
import com.paras.entity.Order;
import com.paras.entity.User;
import com.paras.repo.USerRepositry;

@RestController
@RequestMapping("/user")
public class UserRestController {
	
	
	@Autowired
	USerRepositry repositry;
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/{id}")
	public ResponseEntity<User> getUSer(@PathVariable("id") int id) {
		
		// Order Rest API called happen from here  
		Order order=restTemplate.getForObject("http://localhost:9090/order/"+id, Order.class);
		
		Optional<User> byId = repositry.findById(id);
		if(byId.isPresent())
		{
			User user = byId.get();
			
			UserDTO dto=new UserDTO();
			//  AGEEEEEEEEEEEEEEEEEEEEEEEEEEEEE ka nahi ata//////////////////////////////////////////////
			
			
			
			
			return new ResponseEntity<User>(user,HttpStatus.OK);
		}
		throw new UserNotFoundException("User not Found");
	}

}
