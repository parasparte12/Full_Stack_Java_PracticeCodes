package com.paras.dao;

import org.springframework.stereotype.Repository;

@Repository("mysql")
public class MySQL_ReportDao implements Reoprt {

	@Override
	public void getreoprt() {
		System.out.println("Getting Report from MYSQL DB");
		// TODO Auto-generated method stub
		
	}

}
