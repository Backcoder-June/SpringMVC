<%--
  Created by IntelliJ IDEA.
  User: skyst
  Date: 2022-08-15
  Time: 오후 4:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>myboard</title>
</head>
<body>

<hr>
<h1>내 게시물</h1>
<hr>
<br>
<table border="5">
  <tr>
    <th>번호</th>
    <th>제목</th>
    <th>내용</th>
    <th>작성자</th>
  </tr>
    <tr>

      <td>${myboard.id}</td>
      <td>${myboard.title}</td>
      <td>${myboard.contents}</td>
      <td>${myboard.writer}</td>
    </tr>

</table>




<br>
<hr>

<form action="http://localhost:8090/webServlet_war_exploded/starting">
  <input type="hidden" name="id" value="${myboard.id}">
  <input type="submit" name="menu" value="수정하기">
</form>

<br>
<a href="http://localhost:8090/webServlet_war_exploded/starting?menu=allboard">게시판 이동</a>
<br>
<a href="http://localhost:8090/webServlet_war_exploded/MVC/logined_Home.jsp">홈으로</a>

</body>
</html>
