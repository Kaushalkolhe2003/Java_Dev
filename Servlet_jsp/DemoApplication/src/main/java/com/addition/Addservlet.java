package com.addition;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
public class Addservlet extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		 int i = Integer.parseInt(req.getParameter("num1"));
		 
		 int j=Integer.parseInt(req.getParameter("num2"));
		 
		 int ans=i+j;
		 req.setAttribute("k", ans);
		 
		 
		 System.out.println("ADdition of num1 and num2 is "+ans);
		 
		 PrintWriter out=res.getWriter();
		  
		 //out.println("Sum of 2 number is "+ans);
		 RequestDispatcher rd= req.getRequestDispatcher("sq");
		 rd.forward(req, res);
		 
		 
		 
		 
		 
	}

}
