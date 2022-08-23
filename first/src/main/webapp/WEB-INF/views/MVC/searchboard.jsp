<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>allboard</title>
</head>
<body>

${empty sessionScope.sessionid? "Guest" : sessionScope.sessionid} 님 어서오세요
<br>
<hr>
<form action="http://localhost:8090/test/searchboard">
<select name="item">
<option>번호</option>
<option>제목</option>
<option>내용</option>
<option>작성자</option>
</select>

 : <input type="text" name="search">
<input type="submit" value="검색">
</form>

<br>
<table border="5">
  <tr>
    <th>번호</th>
    <th>제목</th>
    <th>작성자</th>
  </tr>
  <c:forEach items="${searchResults}" var="board" >
    <tr>
      <td>${board.id}</td>
      <td><a href="http://localhost:8090/test/myboard?id=${board.id}">${board.title}</a></td>
      <td>${board.writer}</td>
    </tr>
  </c:forEach>

</table>


<%-- <% int totalpage = (Integer)request.getAttribute("totalpage");

for(int i = 1; i<=totalpage; i++){ %>
<a href="searchboard?page=<%=i%>"> <%=i%></a>
<%}%>
 --%>		




<br>
<hr>


<br> <a href='http://localhost:8090/test/logined'>홈으로</a>





</body>
</html>
