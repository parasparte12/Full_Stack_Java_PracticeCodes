package com.paras.entity;

import lombok.Data;

@Data
public class Order {

    private int orderID;
	
	private String productName;
	
	private Double productPrice;
	
	private int productQty;	
}
