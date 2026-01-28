package paras.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.paras.DBconnection.JDBC;

import paras.entity.Employee;

public class EmpDao {
	
	public String insertEmp(Employee employee) {
		
		Connection connection=JDBC.getDbconnection();
		try {
			PreparedStatement pst=connection.prepareStatement("insert into employees value(?,?,?,?)");
			pst.setString(1, employee.getName());
			pst.setString(2, employee.getEmail());
			pst.setString(3, employee.getPassword());
			pst.setString(4, employee.getCity());
			
			pst.executeUpdate();



		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return " Employee Save Successfully ";
	}

}
