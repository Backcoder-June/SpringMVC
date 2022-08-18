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

<h2> ${dto.id}님 ${dto.age} 살 이시군요. <br>
${result} 
</h2>


<c:forEach items="${dto.hobby}" var="hobbies">
${hobbies} <br> 
</c:forEach>
등이 취미시구요. 
<br>
환영합니다!


</body>
</html>