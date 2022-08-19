<%--
  Created by IntelliJ IDEA.
  User: skyst
  Date: 2022-08-12
  Time: 오후 5:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>success</title>
</head>
<body>

<h1> 내가 작성한 글 보기 </h1>
<table border="5">
    <tr>
        <th>제목</th>
        <td>${param.title}</td>
    </tr>
    <tr>
        <th>내용</th>
        <td>${param.contents}</td>

    </tr>
    <tr>
        <th>작성자</th>
        <td>${param.writer}</td>
    </tr>


</table>
<br>
<a href="http://localhost:8090/webServlet_war_exploded/MVC/logined_Home.jsp">홈으로</a>


</body>
</html>
