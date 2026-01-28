package com.paras;

public class DebitCardPayment implements Ipay{
	
	
	public void processPayment(double amount) {
		System.out.println("Payment Proccessing via:Dedit card rs="+amount);
	}

}
