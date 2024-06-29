package java_jdbc;

import java.sql.*;
public class Fetch_One_data {

	public static void main(String[] args) {
		try {
			String query="Select Name  from Emp where Sr_no=2";
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/IT","root","Kolhe2003@"); 
			
			Statement st= con.createStatement();
			
			ResultSet rs= st.executeQuery(query);
			
			rs.next();
			String name=rs.getString(1);
			
			System.out.println(name);
			st.close();
			con.close();
				
			
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
