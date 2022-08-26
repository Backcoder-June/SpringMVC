<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
div#ajaxresult{width : 300px; border : solid 3px green; }
div#ajaxresult2{width : 300px; border : solid 3px blue; }
div#ajaxresult4{width : 300px; border : solid 3px red; }
div#upload{width : 300px; border : solid 3px pink; }


</style>

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

			$("#ajaxresult").html(resp.name + "<br>"); 
			$("#ajaxresult").append(resp.id + "<br>");
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
				var onemember = "<h3><a id='"+resp[i].id+"' href=''>" + resp[i].id + "</a>" + " : "
								+ resp[i].name + " : "
								+ resp[i].pw + '</h3>';   
				$("#ajaxresult2").append(onemember);
				}								
				
			} //success
		}); // ajax  
		}) // onclick 	

		
		$("#ajaxresult2").on("click","a", function(){
			event.preventDefault();
			$.ajax({
				url : "ajaxMemberPw/" + $(this).attr("id"), 
				
/*				url : "ajaxMemberPw", 
				data:{"id" : $(this).attr("id")},
 */
				success : function(resp){   
					$("#ajaxresult4").html(resp);
													
				} //success
			}); // ajax  
			}) // onclick 	


			
			$("#uploadBTN").on("click", function(e){
				e.preventDefault();  //btn 도 form 태그 동작 방지 
				var form = $("#uploadForm")[0]; 
				// jquery 객체를 자바스크립트 변수로 변환 [0]인덱스로 가져오는 것  
				var data = new FormData(form); 
				
				$.ajax({
					url : "ajaxUpload",
					data : data,
					type : "post",
					dataType : "json",
					
					encType : "multipart/form-data",
					processData : false,  // URL name=value&... 형식의 processData 사용 안함=> request.Param안되는 것    
					contentType : false, // setContentType ( test/html ) 이 기본 타입을 사용하지 않겠다. 
					
					success : function(resp){   
						$("#ajaxresult5").html(resp.result);
						$("#ajaxresult5").append("#man");
														
					} //success
				}); // ajax  
				}) // onclick 	

		
		
		
		
		
	
	
});  //ready
</script>

</head>
<body>
<img id="man" src="http://localhost:8090/test/upload/man(b242eb79-4a57-47b2-8249-b6ee842ece58).jpg">
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
<!-- 
<form action="ajaxUpload" enctype="multipart/form-data" method="post">
 -->
<!-- upload AJAX 처리  -->
<div id="upload">
<form id="uploadForm">
파일선택 : <input type="file" name="uploadfile" >
<input id="uploadBTN" type="button" value="파일업로드">
</form>
</div>





<div id="ajaxresult">
로그인 정보가 출력됩니다. 
</div>

<div id="ajaxresult2">
회원리스트가 출력됩니다.
</div>

<div>
조회 회원님의 암호
<div id="ajaxresult4">
암호가 출력됩니다. 
</div>
</div>


<div id="ajaxresult5">
파일 업로드 결과가 출력됩니다. 
</div>



</body>
</html>