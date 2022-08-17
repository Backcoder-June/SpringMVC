<%@page import="nonspringMVC.HelloDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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



</body>
</html>