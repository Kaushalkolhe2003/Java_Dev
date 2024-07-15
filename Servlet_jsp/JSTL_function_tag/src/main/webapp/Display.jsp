<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="fn"  uri="http://java.sun.com/jsp/jstl/functions"%>
    <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Function Tags </title>

</head>
<body>
<c:set var="Str" value=" Kaushal Kolhe"></c:set>

<c:if test="${fn:contains(Str,'Kolhe') }"> 
<p style="color:Orange;"><b>Present</b> </p>


</c:if>


<p> <b> Length : ${fn:length(Str)} </b></p><br>

<c:forEach items ="${fn:split(Str,' ') }" var="x">

${x} <br>

</c:forEach>
<c:set var="xyz" value="hello Aditya fuck of !!!!!!!!!!!!!!!!!!!  (virgin) "></c:set>

${fn:toUpperCase( xyz)}
<br>

${fn:indexOf(xyz,"fuck")}



</body>
</html>

