package main_5.com;

import java.util.ArrayList;

import controller_3.com.EmpController;
import entity_4.com.Emp;

public class Main {
	public static void main(String[] args) {
		
		EmpController controller=new EmpController();
		Emp e1= new Emp(3,"Prasun",50000,"Product Manager");
		Emp e2= new Emp(4,"Meet",60000,"Bussiness");

		Emp e3= new Emp(5 ,"Ashwin",500000,"Construction");

		ArrayList<Emp> emps=new ArrayList<Emp>();
		emps.add(e1);
		emps.add(e2);

		emps.add(e3);

		
		//String msg=controller.insert(e);
		
		String msg=controller.insertMultiEmp(emps);
		System.out.println(msg);
		
	}

}
