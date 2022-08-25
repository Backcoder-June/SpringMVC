<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="resources/js/jquery-3.6.0.min.js" ></script>
<script>
$(document).ready(function(){
	$("#ajaxbtn").on("click", function(){
	$.ajax({
		url : "ajaxlogin2", 
 		data : {"id":$("#id").val(), "pw":$("#pw").val()}, 
		type : "POST",
		dataType:"json", 
		success : function(resp){
			// memberDTO 객체 응답 

			$("#ajaxresult").html(resp.name);
			$("#ajaxresult").append(resp.id);
			$("#ajaxresult").append(resp.pw);
			
			
			
		
		
		} //success
	}); // ajax  
	}) // onclick
	
	
	
	
	$("#allmember").on("click", function(){
		$.ajax({
			url : "ajaxmemberlist", 
			dataType:"json", 
			success : function(resp){
				// memberDTO 객체 응답
				
				for(var i =0; i<resp.length; i++){
				var onemember = '<h3>' + resp[i].id + " : "
								+ resp[i].name + " : "
								+ resp[i].pw + '</h3>';   
				$("#ajaxresult2").append(onemember);
				}								
				
			} //success
		}); // ajax  
		}) // onclick 	

	
	
	
});  //ready
</script>

</head>
<body>
<h2>로그인 페이지</h2>

<form action="ajaxlogin2" method="post">
아이디 : <input type="text" id="id" name="id"><br>
비번 : <input type="text" id="pw" name="pw"><br>
<input id="ajaxbtn" type="button" value="ajax로그인"> <br> 
</form>


<h2> 전체회원 조회 </h2>
<form action="ajaxmemberlist" method="post">
아이디 : <input type="text" id="id" name="id"><br>
비번 : <input type="text" id="pw" name="pw"><br>
<input id="allmember" type="button" value="전체회원 조회"> <br> 
</form>

<br>

<input id="oneboard" type="button" value="게시물 하나"> <br> 

<div id="ajaxresult3"> 게시물 정보 출력 </div>







<div id="ajaxresult">
처음에 디브에 써논 내용

</div>



<div id="ajaxresult2">
처음에 디브에 써논 내용

</div>



</body>
</html>