<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="Board.memberDAO" %>
<%@ page import="Board.memberDTO" %>
<%@ page import="java.util.ArrayList" %>
  
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>members</title>
</head>
<body>

${empty sessionScope.sessionid? "Guest" : sessionScope.sessionid} 님 어서오세요

<Br> 
<br>
<form action="searchmember">
<select name="item">
<option>아이디</option>
<option>이름</option>
</select>

 : <input type="text" name="search">
<input type="submit" value="검색">
</form>
<br>



<table border="5">
  <tr>
    <th>아이디</th>
    <th>이름</th>
  </tr>
<c:forEach items="${searchlist}" var="target" >
  <tr>
    <td>${target.id}</td>
    <td>${target.name}</td>
  </tr>
</c:forEach>

</table>

왜 다찾냐 
<br> <a href='http://localhost:8090/test/logined'>홈으로</a>

</body>
</html>
