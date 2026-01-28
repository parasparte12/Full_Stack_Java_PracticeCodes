package com.paras;

import org.springframework.context.ApplicationContext;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		PaymentService pay=context.getBean(PaymentService.class);
		System.out.println(pay.hashCode());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		PaymentService pay=new PaymentService();
//		pay.paym=new DebitCardPayment();
//		pay.doPayment(1111);
	}

}
