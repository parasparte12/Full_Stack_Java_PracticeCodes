package dao_1.com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import entity_4.com.Emp;
import utility.com.DB_Connection_6;
public class EmployeeDAO {
		 
		public  String insertEmployee(Emp emp)
		{
			Connection c=DB_Connection_6.JDBC_Connection();
			try {
				PreparedStatement p=c.prepareStatement("insert into emplyoee values(?,?,?,?)");///???? there are 4 ? of 4 values in EMp.java class
				p.setInt(1, emp.getId());
				p.setString(2, emp.getName());
				p.setDouble(3,emp.getSalary());
				p.setString(4, emp.getDep());
				
				p.executeUpdate();// for insert,update,delete
								
			}catch(SQLException e){
				
				e.printStackTrace();
				
			}
			return "Emplyoee Inserted Successfully ";
			
		}
		///////////   Multiple data insert//////////////////////
		public  String insertMultipleEmployee(ArrayList<Emp> emps)
		{
			Connection c=DB_Connection_6.JDBC_Connection();
			try {
				PreparedStatement p=c.prepareStatement("insert into emplyoee values(?,?,?,?)");///???? there are 4 ? of 4 values in EMp.java class
				for(Emp emp:emps)
				{	
				p.setInt(1, emp.getId());
				p.setString(2, emp.getName());
				p.setDouble(3,emp.getSalary());
				p.setString(4, emp.getDep());
				
				p.executeUpdate();// for insert,update,delete
				}			
			}catch(SQLException e){
				
				e.printStackTrace();
				
			}
			return "Emplyoeess Inserted Successfully ";
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		public static void main(String[] args) {
//			
//			Emp e=new Emp();
//			e.setId(1);
//			e.setName("Paras");
//			e.setSalary(120000);
//			e.setDep("IT");
//
//			new EmployeeDAO().insertEmployee(e);
//		}
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	////////////////////1 st work done////////////////////	
		
//EMp from entity package now we no need of insertEmplyoee(Emp e) isntead of it createTable ()
	}
//		public void createTable() {
//			Connection c=DB_Connection_6.JDBC_Connection();  
//			
//			try {
//				Statement s=c.createStatement();
//				s.execute(	"create table emplyoee(id int,name varchar(30),salary double,dep varchar(30)	) ");
//				System.out.println("Table created");
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		
//
//	}
//	public static void main(String[]args)
//	
//	{
//		
//		
//		new EmployeeDAO().createTable();
//	
//	}
           
                      