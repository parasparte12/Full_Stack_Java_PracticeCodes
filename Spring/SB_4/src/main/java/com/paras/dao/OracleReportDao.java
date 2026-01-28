package com.paras.dao;

import org.springframework.stereotype.Repository;

@Repository("oracle")
public class OracleReportDao implements Reoprt {

	@Override
	public void getreoprt() {
		System.out.println("Getting report from Oracle DB");
		// TODO Auto-generated method stub
		
	}
	


}
