package com.server;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.*;
public class secondservlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req ,HttpServletResponse res) throws IOException {
		
		PrintWriter out = res.getWriter();
		
		out.print("hello ");
		
		ServletContext ctx= getServletContext();
		String str = ctx.getInitParameter("name");
		out.print(str);
		
		
	}

}
