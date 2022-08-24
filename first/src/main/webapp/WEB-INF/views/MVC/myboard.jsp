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
    <th>조회수</th>
  </tr>
    <tr>

      <th>${myboard.id}</th>
      <td>${myboard.title}</td>
      <td>${myboard.contents}</td>
      <td>${myboard.writer}</td>
      <th>${myboard.viewcount}</th>
    </tr>

</table>




<br>
<hr>

<form action="http://localhost:8090/test/editboard">
  <input type="hidden" name="editsessionid" value="${myboard.writer}">
  <input type="hidden" name="editboardid" value="${myboard.id}">
  <input type="submit" name="menu" value="수정하기">
</form>

<form action="http://localhost:8090/test/deleteboard">
  <input type="hidden" name="deletesessionid" value="${myboard.writer}">
  <input type="hidden" name="deleteboardid" value="${myboard.id}">
  <input type="submit" name="delete" value="삭제하기">
</form>



<br>
<a href="http://localhost:8090/test/allboard">게시판 이동</a>
<br>
<a href="http://localhost:8090/test/home">홈으로</a>

</body>
</html>
