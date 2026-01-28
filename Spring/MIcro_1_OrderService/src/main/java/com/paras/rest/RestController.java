package com.paras.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.paras.entity.Order;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	@GetMapping("/order/{orderid}")
	public Order getOrder(@PathVariable int orderid) {
		
		Order order=new Order();
		order.setOrderId(orderid);
		order.setName("Laptop");	
		order.setPrice(90000);
		order.setQty(2);
		
		return order;
		
		
		
	}

}
