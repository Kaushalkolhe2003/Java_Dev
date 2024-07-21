package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.login.dao.LoginDao;

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

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Username= request.getParameter("username").toString();
		
		String Password= request.getParameter("password").toString();
		
		LoginDao dao = new LoginDao();
		
		if(dao.check(Username, Password)) {
			HttpSession session = request.getSession();
			session.setAttribute("uname", Username);
			session.setAttribute("pass", Password);
			
			response.sendRedirect("Welcome.jsp");
		}
		else {
			response.sendRedirect("Login.jsp");
		}
		
	}

}
