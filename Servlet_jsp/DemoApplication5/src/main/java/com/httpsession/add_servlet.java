package com.httpsession;

import javax.servlet.http.HttpServlet;

import java.io.IOException;

import javax.servlet.http.*;
public class add_servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int i=Integer.parseInt(req.getParameter("num1"));
		
		int j=Integer.parseInt(req.getParameter("num2"));
		
		int k=i+j;
		Cookie cookie = new Cookie("k",k +"");
		 res.addCookie(cookie);
	
		/* we can also use cookie for the same work of httpsession */
		
		
		
	/*HttpSession session = req.getSession();
		session.setAttribute("k",k);
		*/
		
		res.sendRedirect("sq");
		
		
		
				
	}

}
