package com.paras;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class UserDao implements InitializingBean,DisposableBean {
	

	public void getData()
	{
		System.out.println("Getting Data from DB");
	}
	@Override
	public void destroy()   //before bean destroy this method will invoke by IOC
	{
		System.out.println("Clossing the DB connection");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Getting the DB connection");
		
	}
}
