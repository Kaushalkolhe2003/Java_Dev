package java_jdbc;
import java.sql.*;
/* import ---> java.sql
 * load and register the driver--> com.mysql.jdbc.Driver
 * create connection--> Connection interface 
 * create a statement--> statement
 * execute the query
 * process the result
 * close
 * 
 * 
 * 
 * 
 */



public class Demo {

	public static void main(String[] args) {
		
		try{
			//query 
			String query = "select * from Emp ";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/IT","root","Kolhe2003@");
			Statement st = con.createStatement();
			
			ResultSet rs =st.executeQuery(query);
			
			while(rs.next()) {
			String name = rs.getInt(1) + " " +rs.getString(2);
			System.out.println(name);
			}
			
			
			
			
			st.close();
			con.close();
			
			
			
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
