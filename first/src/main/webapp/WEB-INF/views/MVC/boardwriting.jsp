<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jspboard</title>
</head>
<body>

<h1> Board </h1>

<form action="http://localhost:8090/test/boardwriting" method="post">
<table border = 5>
<tr><th>제목</th><td><input type ='text' name = 'title'></td></tr>
<tr><th>내용</th><td><textarea name = 'contents' rows=5 cols=50></textarea></td></tr>
<tr><th>작성자</th><td><input type ='text' name = 'writer'
value="${empty sessionScope.sessionid? 'Guest' :
        sessionScope.sessionid }" readonly></td></tr>
</table>

    <input type="submit" value="작성" name="menu">
</form>

<br>

<a href="http://localhost:8090/test/logined">홈으로</a>

</body>
</html>
