<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: skyst
  Date: 2022-08-09
  Time: 오후 4:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jspboard</title>
</head>
<body>
<%--

<%
    String userid = (String)session.getAttribute("userid");
%>
--%>



<h1> Board </h1>

<form action="http://localhost:8090/webServlet_war_exploded/starting" method="get">
<table border = 5>
<tr><th>제목</th><td><input type ='text' name = 'title'></td></tr>
<tr><th>내용</th><td><textarea name = 'contents' rows=5 cols=50></textarea></td></tr>
<tr><th>작성자</th><td><input type ='text' name = 'writer'
value="${empty sessionScope.userid? "Guest" :
        sessionScope.userid }" readonly></td></tr>
</table>

    <input type="submit" value="작성" name="menu">
</form>

<br>

<a href="http://localhost:8090/webServlet_war_exploded/MVC/logined_Home.jsp">홈으로</a>

</body>
</html>
