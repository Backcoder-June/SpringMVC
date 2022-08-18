<%@page import="annotation.Springmvc.HelloDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>

</script>

</head>
<body>

<%ArrayList<HelloDTO> list = (ArrayList<HelloDTO>)request.getAttribute("list"); %>
<%
for (HelloDTO dto : list ){
	out.println(dto.getMessage());	
}
%> 

<c:forEach items="${list}" var="dto">
jstl : <h3> ${dto.message}</h3>
</c:forEach>


</body>
</html>