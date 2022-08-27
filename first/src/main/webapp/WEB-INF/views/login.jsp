<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="resources/js/jquery-3.6.0.min.js"></script>

<style>
#loginform {
	width: 100%;
	margin: auto;
}
</style>

<script>
	$(document).ready(function() {
		$("#login").on("click", function(e) {
			if (document.querySelector("#id").value == "") {
				e.preventDefault();
				alert("아이디를 입력해 주세요");
			}

			$.ajax({
				url : "login",
				data : {
					"id" : $("#id").val(),
					"pw" : $("#pw").val()},
				type : "POST",
				dataType : "json",

				success : function(resp) {
					alert(resp.result);
				}
			}); // ajax
		});
	});
</script>
</head>

<body>
	<div id="loginform" align="center">
		<h1>로그인</h1>
		<hr>
		<form action="">
			<table>
				<tr>
					<td>아이디&emsp;</td>
					<td><input type="text" name="id" id="id"></td>
				</tr>
				<tr>
					<td>비밀번호&emsp;</td>
					<td><input type="password" name="pw" id="pw"></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<th></th>
					<th><input type="button" value="로그인" id="login">
						&nbsp;&nbsp; <input type="reset" value="취 소" id="loginReset">
					</th>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>



