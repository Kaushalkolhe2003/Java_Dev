package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String username= request.getParameter("username").toString();
		
		String password = request.getParameter("password").toString();
		
		if(username.equals("kk2003@") && password.equals("Kolhe2003@")) {
			
			HttpSession session = request.getSession();
			session.setAttribute("name", username);
			
			response.sendRedirect("welcome.jsp");
		}
		else {
			response.sendRedirect("Login.jsp");
		}
		
	}
}
