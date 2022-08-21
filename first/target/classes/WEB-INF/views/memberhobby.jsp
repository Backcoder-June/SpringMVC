<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="/resources/js/jquery-3.6.0.min.js" ></script>
<script>
$(document).ready(function(){
	
	
	
});
</script>

</head>
<body>

<form action="end" method=post>
아이디: <input type="text" name="id"> <br>
암호 : <input type="password" name="pw"> <br>
나이 : <input type="text" name="age"> <br>
취미 : 
<input type="checkbox" name="hobby" value="coding">코딩
<input type="checkbox" name="hobby" value="bike">바이크
<input type="checkbox" name="hobby" value="reading">독서
<input type="checkbox" name="hobby" value="cooking">요리
<input type="checkbox" name="hobby" value="movie">영화
<br>
<br>
<input type="submit" value="회원가입">
</form>

</body>
</html>