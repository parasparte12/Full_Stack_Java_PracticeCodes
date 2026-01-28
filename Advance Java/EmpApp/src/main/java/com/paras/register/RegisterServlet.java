package com.paras.register;

import java.io.IOException;

import com.paras.service.EmpService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import paras.entity.Employee;
@WebServlet("/save")
public class RegisterServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html"); 
		EmpService service= new EmpService();
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		String city=req.getParameter("city");

		
		
		 Employee emplyoee=new Employee(name, email, password, city);
		 String mssg=service.insertEmp(emplyoee);
		 // FOT HTML
		// resp.getWriter().print("<h2 style='color:red'>"+mssg+"</h2>");
		 //FOR JSP
		 req.setAttribute("message",mssg);
		 
		 req.getRequestDispatcher("index.jsp").include(req, resp);
		 	
	}
	
		
}
	
