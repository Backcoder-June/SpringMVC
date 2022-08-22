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

 <table border="5">
  <tr>
    <th>아이디</th>
    <th>이름</th>
  </tr>
<c:forEach items="${memberlist}" var="dto" >
  <tr>
    <td>${dto.id}</td>
    <td>${dto.name}</td>
  </tr>
</c:forEach>
</table>

<h3>
<%
int totalpage = (Integer)request.getAttribute("totalpage");

for(int i = 1; i<=totalpage; i++){ %>
	<a href="pagememberlist?page=<%=i%>"> <%=i%></a>	
<%}%>
</h3>

<br> <a href='http://localhost:8090/test/logined'>홈으로</a>

</body>
</html>
