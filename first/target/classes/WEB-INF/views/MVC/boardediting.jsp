<%--
  Created by IntelliJ IDEA.
  User: skyst
  Date: 2022-08-15
  Time: 오후 4:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>boardediting</title>
</head>
<body>


<h1> Board </h1>

<form action="http://localhost:8090/webServlet_war_exploded/starting" method="get">
  <table border = 5>
    <tr><th>제목</th><td><input type ='text' name = 'title' value="${myboard.title}"></td></tr>
    <tr><th>내용</th><td><textarea name = 'contents' rows=5 cols=50>${myboard.contents}</textarea></td></tr>
    <tr><th>작성자</th><td><input type ='text' name = 'writer'
                               value="${myboard.writer}" readonly></td></tr>
  </table>

  <input type="hidden" name="id" value="${myboard.id}">

  <input type="submit" value="수정" name="menu">
</form>

<br>

<a href="http://localhost:8090/webServlet_war_exploded/MVC/logined_Home.jsp">홈으로</a>



</body>
</html>
