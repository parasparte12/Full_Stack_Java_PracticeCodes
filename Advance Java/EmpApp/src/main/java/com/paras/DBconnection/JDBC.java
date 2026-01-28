package com.paras.DBconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC {
	private static final String url="jdbc:mysql://localhost:3306/servlet";
	
	private static final String username="root";
	
	private static final String password="Paras08@2006";
	
	private static final String driverClassName="com.mysql.cj.jdbc.Driver";
	
	public static Connection getDbconnection() {
		Connection connection=null;
		try {
			Class.forName(driverClassName);
		 connection=DriverManager.getConnection(url, username, password);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return connection;
		
		
		
	}

}
