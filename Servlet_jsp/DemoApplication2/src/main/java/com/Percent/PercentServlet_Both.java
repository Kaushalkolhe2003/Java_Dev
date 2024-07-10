package com.Percent;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

public class PercentServlet_Both extends HttpServlet  {
	
	public void doGet(HttpServletRequest req ,HttpServletResponse res) throws IOException {
		
		int gain =Integer.parseInt(req.getParameter("num1"));
		
		int total = Integer.parseInt(req.getParameter("num2"));
		
		double ans =((double) gain/total)*100;
		System.out.println("Your percentage is "+ans);
		PrintWriter out = res.getWriter();
		
		out.print("Your Percentage is  "+ans);
		
		
		
	}

}
