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
		url : "ajaxlogin", 
 		data : {"id":$("#id").val(), "pw":$("#pw").val()}, 
/* 		data : {"id":"테스트", "pw":"아작스"}, 
*/		type : "POST",
		dataType:"json", 
		success : function(resp){
			// callback 함수 ( 작동했을 시 연계로 호출 )  
			//alert(resp.process);
			//{ "process" : "condition"} JSON 값이 들어가는 것
		
		$("#ajaxresult").html(resp.process);

			if(resp.process.indexOf("success")>=0){
				$("#ajaxresult").css("color", "green");
			}else if(resp.process.indexOf("fail")>=0){
				$("#ajaxresult").css("color", "red");
			}

		
		
		} //success
	}); // ajax  
	}) // onclick 	
});  //ready
</script>

</head>
<body>
<h2>로그인 페이지</h2>

아이디 : <input type="text" id="id"><br>
비번 : <input type="text" id="pw"><br>
<input id="ajaxbtn" type="button" value="ajax로그인"> <br> 


<!-- <form action="ajaxlogin" method="post">
</form>
 -->
<!-- <input type="submit" value="로그인"><br> 
 -->


<div id="ajaxresult">


</div>

</body>
</html>