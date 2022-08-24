<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>boardediting</title>
</head>
<body>


<h1> Board </h1>

<form action="http://localhost:8090/test/editboard" method="post">
  <table border = 5>
    
    <tr><th>번호</th><td><input type ='text' name = 'id' value="${editTarget.id}" readonly></td></tr>
    <tr><th>제목</th><td><input type ='text' name = 'title' value="${editTarget.title}"></td></tr>
    <tr><th>내용</th><td><textarea name = 'contents' rows=5 cols=50>${editTarget.contents}</textarea></td></tr>
    <tr><th>작성자</th><td><input type ='text' name = 'writer'
                               value="${editTarget.writer}" readonly></td></tr>
  </table>

  <input type="hidden" name="boardeditid" value="${editTarget.id}">
  <input type="submit" value="수정" name="menu">
</form>

<br>

<a href="http://localhost:8090/test/logined">홈으로</a>



</body>
</html>
