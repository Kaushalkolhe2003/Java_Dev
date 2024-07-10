package com.addition;

import javax.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

public class Square_of_sum extends HttpServlet {

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		PrintWriter out= res.getWriter();
		out.println("Hello to sq");
		
		int ans =(int) req.getAttribute("k");
		ans=ans*ans;
		out.println("square of the ans is : "+ans);
		
		
	}
}
