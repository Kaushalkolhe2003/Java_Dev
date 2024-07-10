package com.redirect;

import javax.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

public class square_servlet extends HttpServlet {

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		
		System.out.println("sq called");
		PrintWriter out= res.getWriter();
		out.println("Hello to sq");
		
		int ans=Integer.parseInt(req.getParameter("k"));
		ans=ans*ans;
		out.println("square of the ans is : "+ans);

		
	}
}
