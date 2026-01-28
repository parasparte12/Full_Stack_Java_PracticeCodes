package utility.com;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB_Connection_6 {
	private static final String url="jdbc:mysql://localhost:3306/jdbc";//jdbc is database name
	private static final String username="root";
	private static final String password="Paras08@2006";
	
	public static Connection JDBC_Connection() //First here was void after c globally we write the return type inplace of void that is Connection 
	{
		Connection c=null;//to access c after block so make it global so we have to write here // value should be null only 
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 c=DriverManager.getConnection(url, username, password);
		
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
		return c;
	}
	

}
// go to DAO class