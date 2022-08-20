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

${empty sessionScope.userid? "Guest" : sessionScope.userid} 님 어서오세요
<table border="5">
  <tr>
    <th>아이디</th>
    <th>이름</th>
  </tr>
<c:forEach items="${allmember}" var="dto" >
  <tr>
    <td>${dto.id}</td>
    <td>${dto.name}</td>
  </tr>
</c:forEach>

</table>




<br> <a href='http://localhost:8090/webServlet_war_exploded/MVC/logined_Home.jsp'>홈으로</a>

</body>
</html>
