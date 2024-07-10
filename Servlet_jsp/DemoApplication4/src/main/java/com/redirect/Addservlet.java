package com.redirect;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
public class Addservlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		int i=Integer.parseInt(req.getParameter("num1"));
		
		int j=Integer.parseInt(req.getParameter("num2"));
		
		int k=j+i;
		
		res.sendRedirect("sq?k="+k);
		
//		
//		RequestDispatcher rd= req.getRequestDispatcher("sq");
//		rd.forward(req, res);
//		
	}

}
