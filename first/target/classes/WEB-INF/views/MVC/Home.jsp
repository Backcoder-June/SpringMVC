<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>home</title>
<script src="resources/js/jquery-3.6.0.min.js" ></script>
<script>
$(document).ready(function(){
        
});
    
</script>
    
    
    
    
</head>
<body>
<h1> BackCoder Homepage </h1>
<hr>
<br>
<br>

<form action="http://localhost:8090/test/login" method="post" >

    <table border="5">
        <caption> <h2> [ Login ] </h2> </caption>
        <tr><th>아이디:&nbsp; &nbsp;&nbsp;<input type="text" id="id" name="id"></th></tr>
        <tr><th>비밀번호 : <input type="password" id="pw" name="pw"></th></tr>
    </table>

    <br>
    <input type="submit" value="로그인" name="menu">

</form>



<a href="http://localhost:8090/test/join">회원가입</a>
<br>
<br>
<a href="http://localhost:8090/test/allmembers">회원정보 보러가기</a>
<br>
<br>
<a href="http://localhost:8090/test/pagememberlist">페이징 회원정보</a>
<br>
<br>
<a href="http://localhost:8090/test/delete">회원탈퇴</a>
<hr>
<hr>
<a href="http://localhost:8090/test/allboard">게시판 보러가기</a>
<br>
<br>
<a id="writing" href="http://localhost:8090/test/boardwriting">게시물 작성하러가기</a>
<br>
<br>
<br>






</body>
</html>
