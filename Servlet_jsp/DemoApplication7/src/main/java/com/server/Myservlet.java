package com.server;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.*;

import javax.servlet.http.*;

public class Myservlet  extends HttpServlet{
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		PrintWriter out = res.getWriter();
		out.print("hi ");
		/*
		ServletContext ctx= getServletContext();
		 String str=ctx.getInitParameter("name");
		out.println(str); 
		
		String str2= ctx.getInitParameter("Surname");
		out.println(str2);
		*/
		ServletConfig cg= getServletConfig();
		String st= cg.getInitParameter("name");
		out.print(st); 
		
		
		
	}

}
