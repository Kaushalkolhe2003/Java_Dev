<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile List</title>
</head>
<body>

<%
String url = "jdbc:mysql://localhost:3306/GoaTrip";
String username = "root";
String password = "Kolhe2003@";
String query = "SELECT * FROM Profiles WHERE Saving > 8500";
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection(url, username, password);
Statement st = con.createStatement();
ResultSet rs = st.executeQuery(query);
%>

<h2>Profile List</h2>

<% 
while(rs.next()) { 
%>
    <p>
        Sr_NO: <%= rs.getString(1) %><br>
        Name: <%= rs.getString(2) %><br>
        Date_of_Birth: <%= rs.getString(3) %><br>
        Saving: <%= rs.getString(4) %><br>
    </p>
    <hr>
<% 
} 
rs.close();
st.close();
con.close();
%>

</body>
</html>
