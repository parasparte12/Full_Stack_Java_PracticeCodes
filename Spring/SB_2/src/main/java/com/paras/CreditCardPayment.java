package com.paras;

public class CreditCardPayment implements Ipay {
	public void processPayment(double amount) {
		System.out.println("Payment Proccessing via:Credit card rs="+amount);
	}

}	
