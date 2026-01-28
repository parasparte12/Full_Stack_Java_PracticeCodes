package com.paras.rest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.paras.OrderDto;

@FeignClient(name="MIcro_1_OrderService",url="http://localhost:9090/order/1")
public interface OrderClient {

	@GetMapping("/order/{orderId}")
	OrderDto getOrder(@PathVariable int orderId);
	
}
