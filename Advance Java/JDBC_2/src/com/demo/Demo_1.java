package com.demo;
import java.sql.Connection; 

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo_1 {
		
	static void insertData(Student_3 student_3	)throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");// step 2
		//System.out.println("Driver class loaded");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/paras_2", "root", "Paras08@2006");
		Statement st=con.createStatement();
		
		//ST -5;  
		
		//st.execute("create database paras_2");
		//st.execute("create table student_3(id int ,name varchar(30),marks double)");
		//st.execute("insert into student_3 values(1,'parasbhai',90.43)");
		
//		st.execute("insert into student_3 values('" +id+ "','"+name+"','"+marks+"')" );
//		 
		st.execute("insert into student_3 values('"+ student_3.getId()+ "','"+student_3.getName()+"','"+student_3.getMarks()+"')" );
		 
		
		System.out.println("Data insrted");
		//System.out.println("Table created");
		//System.out.println("DB created"); 
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter ID=");
//		int id=sc.nextInt();
//		System.out.println("Enter Name=");
//		String name=sc.next();
//		System.out.println("Enter Marks=");
//		double  marks=sc.nextDouble();
//		insertData(id,name,marks);
		
		Student_3 student=new Student_3();
		student.setId(7);
		student.setName("hdhuw");
		student.setMarks(30.44);
		insertData(student);
		
		
		
		
	}
	

}
