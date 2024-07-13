package com.server;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/DemoServlet")
public class Demo_servlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		List<Employee> emps = Arrays.asList(new Employee(1,"Kaushal"), new Employee(2,"Aditya") , new Employee(3,"Yash"), new Employee(4,"Omkar"));
		
		String n1= "AdityaDamare";
		req.setAttribute("cutiya", n1);
		req.setAttribute("Emp", emps);
		RequestDispatcher rs = req.getRequestDispatcher("display.jsp");
		rs.forward(req, res);
	}
}
