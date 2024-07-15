<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver" 
                   url="jdbc:mysql://localhost/goatrip" 
                   user="root" 
                   password="Kolhe2003@" />

<sql:update dataSource="${db}" var="count">
    insert into profiles values (5, 'Mansi', '2002-10-31', 13300)
</sql:update>

<sql:query dataSource="${db}" var="rs">
    select * from profiles
</sql:query>

<h1 style="color: orange;">Goa Planning</h1>
<table border="2" width="100%">
    <tr>
        <th>Sr_no</th>
        <th>Name</th>
        <th>DOB</th>
        <th>Saving</th>
    </tr>
    <c:forEach var="table" items="${rs.rows}">
        <tr>
            <td><c:out value="${table.Sr_no}"/></td>
            <td><c:out value="${table.Name}"/></td>
            <td><c:out value="${table.DOB}"/></td>
            <td><c:out value="${table.Saving}"/></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
