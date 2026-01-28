package com.paras;

public class Daemon_Thread implements Runnable {
	
	@Override
	public void run() {
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Thread is daemon");
		}
		else {
			System.out.println("Thread is not daemon");
		}
			
		
	}
	public static void main(String[] args) {
		Daemon_Thread d=new Daemon_Thread();
		
		Thread t1=new Thread(d);
		t1.setName("Paras");
		t1.setDaemon(true);
		t1.start();
		
	}

}
