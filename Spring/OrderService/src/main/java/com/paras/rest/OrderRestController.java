package com.paras.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paras.entity.Order;
import com.paras.repo.OrderRepo;

@RestController
@RequestMapping("/order")
public class OrderRestController {
	
	
	
	
	@Autowired
	OrderRepo orderRepositry;
	
	@GetMapping("/{id}")
	public ResponseEntity<Order> getOrder(@PathVariable int id)
	{
		Optional<Order> byId = orderRepositry.findById(id);
		if(byId.isPresent())
		{
			Order order = byId.get();
			return new ResponseEntity<Order>(order,HttpStatus.OK);
		}
		throw new OderNotFoundException("Order not Found");
	}

}
