<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: skyst
  Date: 2022-08-15
  Time: 오후 1:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>FBIboards</title>
</head>
<body>

${empty sessionScope.userid? "Guest" : sessionScope.userid} 님이 작성한 글 목록입니다.
<br>
<hr>
<br>
<table border="5">
  <tr>
    <th>번호</th>
    <th>제목</th>
    <th>작성자</th>
  </tr>
  <c:forEach items="${fbi}" var="board" >
    <tr>
      <td>${board.id}</td>
      <td><a href="http://localhost:8090/webServlet_war_exploded/starting?menu=myboard&id=${board.id}">${board.title}</a></td>
      <td>${board.writer}</td>
    </tr>
  </c:forEach>

</table>

<br>
<hr>


<br> <a href='http://localhost:8090/webServlet_war_exploded/MVC/logined_Home.jsp'>홈으로</a>





</body>
</html>
