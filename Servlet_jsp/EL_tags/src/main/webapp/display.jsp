<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"   %>
<%@ taglib prefix="fn"  uri="http://java.sun.com/jsp/jstl/functions"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

Hello Kaushal....
<br>

<c:forEach items="${ Emp}" var="s">
${s.name} <br>
</c:forEach>
<br>
<c:set var="String" value="${cutiya}"></c:set>
<c:if test="${fn:contains(String,'Aditya')}">
<p>Found Aditya <p>
</c:if>
</body>
</html>