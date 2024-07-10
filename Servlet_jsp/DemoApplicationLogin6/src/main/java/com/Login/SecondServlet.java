package com.Login;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;
public class SecondServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		 // Retrieve username from cookie
        String username = null;
        Cookie[] cookies = req.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("username")) {
                    username = cookie.getValue();
                    break;
                }
            }
        }

        // Display the username on the second servlet's page
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<html><head><title>Welcome</title></head><body>");
        out.println("<h2>Welcome, " + username + "!</h2>");
        out.println("</body></html>");
	}

}
