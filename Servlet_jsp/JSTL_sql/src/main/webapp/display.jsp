<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>  
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
   
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost/goatrip" user="root" password="Kolhe2003@" />

<sql:query var="rs"  dataSource="${db}">
select *from profiles
</sql:query>

<c:forEach items="${rs.rows}" var="x">
<br>
<c:out value="${x.Sr_no}"></c:out> : <c:out value="${x.Name}"></c:out> --> <c:out value="${x.Saving}"></c:out>
</c:forEach>

</body>
</html>