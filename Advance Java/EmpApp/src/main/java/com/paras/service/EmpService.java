package com.paras.service;

import paras.dao.EmpDao;
import paras.entity.Employee;

public class EmpService {

	EmpDao dao=new EmpDao();
	
	public String insertEmp(Employee employee)
	{
		return dao.insertEmp(employee);
	}
}
