<%@page import="annotation.Springmvc.LoginDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="resources/js/jquery-3.6.0.min.js" ></script>
<script>
$(document).ready(function(){

});
</script>



</head>
<body>


<h1>로그인 성공 </h1>
입력하신 아이디는 ${requestScope.dto.id}입니다. <br>
입력하신 비밀번호는 ${requestScope.dto.pw}입니다. <br> 

</body>
</html>