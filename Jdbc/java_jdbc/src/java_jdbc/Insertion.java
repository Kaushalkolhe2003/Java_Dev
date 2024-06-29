 package java_jdbc;
import java.sql.*;

 
public class Insertion {

	public static void main(String[] args) {
		
	 try {
		 String query ="insert into Emp values(4,'Kaushal'),(5,'Raj')";
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/IT","root","Kolhe2003@");
		 
		 Statement st = con.createStatement();
		 int count=st.executeUpdate(query);
		 
		 System.out.println(count +" row affected");
		 
		 st.close();
		 con.close();
		 
	 }
	 catch(Exception e) {
		 System.out.println(e);
	 }
	}

}
