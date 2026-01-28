package service_2.com;
import java.util.ArrayList;

import dao_1.com.EmployeeDAO;
import entity_4.com.Emp;


public class EmpService {
	
	EmployeeDAO dao=new EmployeeDAO();
	
	public String insertEmp(Emp emp)
	{
		String msg=dao.insertEmployee(emp);
		return msg;
	}
	
	public String insertMultiEmp(ArrayList<Emp> emps)
	{
		String msg=dao.insertMultipleEmployee(emps);
		return msg;
	}

}
