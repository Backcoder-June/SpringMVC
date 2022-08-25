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
<h1> Back cloud Service </h1>

<c:forEach items= "${fileArray}" var= "oneFile" > 

<h3> <a href="fileDownResult?filename=${oneFile}" >내 파일 : ${oneFile} </a> </h3>  

</c:forEach>




</body>
</html>