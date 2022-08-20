<%--
  Created by IntelliJ IDEA.
  User: skyst
  Date: 2022-08-13
  Time: 오전 9:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>home</title>
</head>
<body>
<h1> BackCoder Homepage </h1>
<hr>
<br>
<br>

<form action="http://localhost:8090/webServlet_war_exploded/starting" >

    <table border="5">
        <caption> <h2> [ Login ] </h2> </caption>
        <tr><th>아이디:&nbsp; &nbsp;&nbsp;<input type="text" id="id" name="id"></th></tr>
        <tr><th>비밀번호 : <input type="password" id="pw" name="pw"></th></tr>
    </table>

    <br>
    <input type="submit" value="로그인" name="menu">

</form>



<a href="http://localhost:8090/webServlet_war_exploded/MVC/joinmember.jsp">회원가입</a>
<br>
<br>
<a href="http://localhost:8090/test/allmembers">회원정보 보러가기</a>
<br>
<br>
<a href="http://localhost:8090/webServlet_war_exploded/MVC/deletemember.jsp">회원탈퇴</a>
<hr>
<hr>
<a href="http://localhost:8090/webServlet_war_exploded/starting?menu=allboard">게시판 보러가기</a>
<br>
<br>
<a href="http://localhost:8090/webServlet_war_exploded/starting?menu=boardwriting">게시물 작성하러가기</a>
<br>
<br>
<br>






</body>
</html>
