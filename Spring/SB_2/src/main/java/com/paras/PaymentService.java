 package com.paras;

public class PaymentService {
	
	public PaymentService() {
		System.out.println("Payment Service Constructor called");
		// TODO Auto-generated constructor stub
	}
	

	//DebitCardPayment d=new DebitCardPayment();//calling from another class
	
	//object calling is wrong way in Spring so make refrernce 
	
//	DebitCardPayment debit;
//	CreditCardPayment credit;
	
	//now we can make refrences in interface class 
	//call inteface 
	Ipay paym;	////// 2 classes(debit,credit) implements Ipay
	public void doPayment(double amount) {
		paym.processPayment(amount);
		System.out.println("Payment Success..");
	}
}
