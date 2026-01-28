package com.paras;

public class Demo extends Thread{
	
	@Override
	public void run() {
		m1();
		m2();
	}

	
	void m1() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		
	}
	
	void m2() {
		
		for(int i=10;i>=1;i--) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		
		Demo d=new Demo();
		d.start();//start will call run method
		
		Demo d2=new Demo();
		d2.start();
		
	}
}
