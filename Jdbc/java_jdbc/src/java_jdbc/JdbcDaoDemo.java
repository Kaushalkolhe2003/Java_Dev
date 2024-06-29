package java_jdbc;
import java.sql.*;

public class JdbcDaoDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		StudentDAO dao = new StudentDAO();
		//Student s1= dao.getStudent(4);
		
		//System.out.println(s1.Name);
	
//		Student s2 = new Student();
//		s2.Sr_no=7;
//		s2.Name="Mahesh";
		dao.connection();
//		dao.addStudent(s2);
//		
		dao.removeStudent(3);
		
		
		

	}

}
class StudentDAO{
	Connection con =null;
	public void connection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost/IT","root","Kolhe2003@");
		} catch (Exception  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
	public Student getStudent(int Sr_no) throws ClassNotFoundException {
		Student s = new Student();
		
		try {
			s.Sr_no=Sr_no;
			String query="select Name from Emp where Sr_no="+Sr_no;
			
			
			Statement st = con.createStatement();
			ResultSet rs= st.executeQuery(query);
			rs.next();
			String name = rs.getString("Name");
			s.Name=name;
			
			return s;
			 
			
			
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

    public void addStudent(Student s) {
    	String query="insert into Emp values (?,?)";
    	try {
			PreparedStatement pt = con.prepareStatement(query);
			pt.setInt(1, s.Sr_no);
			pt.setString(2,s.Name);
			pt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    public void removeStudent(int Sr_no ) {
    	
    	Student s=new Student();
    	s.Sr_no=Sr_no;
    	String query="delete from Emp where Sr_no="+Sr_no;
    	try {
    		Statement st = con.createStatement();
    		int rowaffect = st.executeUpdate(query);
    		System.out.println("no. of row affected"+rowaffect);
    		
    		
    	}
    	catch(Exception e) {
    		System.out.println(e);
    	}
    }
}
class Student{
	int Sr_no;
	String Name;
}
