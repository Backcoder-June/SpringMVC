<%@page import="nonspringMVC.HelloDTO"%>
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

<%
HelloDTO dto = (HelloDTO)request.getAttribute("message");
%>

<h1>여기 가져왔다 이놈아</h1> 
<h3><%=dto.getMessage()%></h3>




</body>
</html>