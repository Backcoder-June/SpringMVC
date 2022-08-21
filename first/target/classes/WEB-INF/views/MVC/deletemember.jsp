<%--
  Created by IntelliJ IDEA.
  User: skyst
  Date: 2022-08-15
  Time: 오후 3:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>deletememeber</title>
</head>
<body>

<form action="http://localhost:8090/webServlet_war_exploded/starting" method="get">
  <table border="5" >
    <caption> 회원 탈퇴 </caption>
    <tr><th>아이디:&nbsp; &nbsp;&nbsp;<input type="text" id="id" name="id"></th></tr>
    <tr><th>비밀번호 : <input type="password" id="pw" name="pw"></th></tr>
  </table>

  <input type="submit" value="회원탈퇴" name="menu">
</form>

<br>
<a href="jsplogin.jsp">홈으로</a>


</body>
</html>
