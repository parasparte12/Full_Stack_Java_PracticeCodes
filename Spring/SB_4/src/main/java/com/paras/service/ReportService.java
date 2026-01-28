package com.paras.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paras.dao.Reoprt;

@Service
public class ReportService {
	
	@Autowired
	Reoprt mysql;  /// byName injection 
	
	
	public void generateReport() {
		
		mysql.getreoprt();
		System.out.println("Report Generated.");
		
	}

}
