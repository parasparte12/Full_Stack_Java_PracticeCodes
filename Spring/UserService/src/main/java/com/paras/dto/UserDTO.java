package com.paras.dto;

import com.paras.entity.Order;

import lombok.Data;

@Data
public class UserDTO {
	
	  private int orderID;
		
			private String productName;
			
			private Double productPrice;
			
			private int productQty;	
			
			private Order order;
			

}
