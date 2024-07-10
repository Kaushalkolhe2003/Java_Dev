package com.httpsession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

public class square_servlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException {
		
		//in this we are sending value in session we have to create a seesion referce to 
		//the value 
		Cookie cookies[] =req.getCookies();
		
		int k=0;
		
		for (Cookie c : cookies) {
			if(c.getName().equals("k")) {
				k=Integer.parseInt(c.getValue());
			}
		}
		
		
		
		k=k*k;
		PrintWriter out = res.getWriter();
		out.println("Result is "+k);
		System.out.println("sq is called");
		
//		HttpSession session = req.getSession();
//		int k= (int) session.getAttribute("k");
//		
		
	}
}
