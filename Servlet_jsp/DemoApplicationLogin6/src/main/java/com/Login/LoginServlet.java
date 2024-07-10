package com.Login;
import java.io.IOException;

import javax.servlet.http.*;
import javax.servlet.http.HttpServlet;
public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String username = req.getParameter("username");
		String password= req.getParameter("password");
		
		Cookie usernamecookie = new Cookie("username",username);
		res.addCookie(usernamecookie);
		
		
		res.sendRedirect("SecondServlet");
	}

}
