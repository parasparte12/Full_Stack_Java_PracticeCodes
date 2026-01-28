package controller_3.com;

import java.util.ArrayList;


import entity_4.com.Emp;
import service_2.com.EmpService;

public class EmpController {
	EmpService service=new EmpService();
	
	public String insert(Emp emp)
	{
		String msg=service.insertEmp(emp);
		return msg;
	}
	
	public String insertMultiEmp(ArrayList<Emp> emps)
	{
		String msg=service.insertMultiEmp(emps);
		return msg;
	}

	

}
