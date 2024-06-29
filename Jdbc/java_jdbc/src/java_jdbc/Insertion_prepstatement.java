package java_jdbc;

import java.sql.*;

public class Insertion_prepstatement {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/IT","root","Kolhe2003@");
			
			PreparedStatement st= con.prepareStatement("Insert into Emp values (6,'Isha')");
			
			int count=st.executeUpdate();
			
			System.out.println(count + "Row affected ");
			
			st.close();
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
