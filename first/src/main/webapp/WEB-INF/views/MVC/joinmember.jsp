<%--
  Created by IntelliJ IDEA.
  User: skyst
  Date: 2022-08-15
  Time: 오후 3:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>join</title>
</head>
<body>


<form action="http://localhost:8090/webServlet_war_exploded/starting" method="get">
  <table border="5">
    <caption> 회원가입 진행 </caption>
    <tr><th>아이디:&nbsp; &nbsp;&nbsp;<input type="text" id="id" name="id"></th></tr>
    <tr><th>비밀번호 : <input type="password" id="pw" name="pw"></th></tr>
    <tr><th>이름 :&nbsp;&nbsp; &nbsp; &nbsp;<input type="text" id="name" name="name"></th></tr>
  </table>

  <input type="submit" value="회원가입" name="menu">
</form>

<br>
<a href="http://localhost:8090/webServlet_war_exploded/MVC/Home.jsp">홈으로</a>




</body>
</html>
