package com.login.dao;

import java.sql.*;

public class LoginDao {
	String query="Select * from users where User_Name=? and Password=?";
	String url = "jdbc:mysql://localhost:3306/login_reg";
	String username="root";
	String pass="Kolhe2003@";
	public boolean check(String name,String password) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url,username,pass);
			PreparedStatement st = con.prepareStatement(query);
			
			st.setString(1,name);
			st.setString(2, password);
			
			ResultSet rs=st.executeQuery();
			
			if(rs.next()) {
				return true;
			}
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return false;
	}
}
