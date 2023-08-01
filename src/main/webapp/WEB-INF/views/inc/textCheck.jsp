<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<script>
	function characterCheck(obj){
		  // 허용하고 싶은 특수문자가 있다면 여기서 삭제
		  var regExp = /<!--|-->/gi; 
		 // var regExp = /[ \{\}\[\]\/?.,;:|\)*~`!^\-_+┼<>@\#$%&\'\"\\\(\=]/gi; 
		
		  if( regExp.test(obj.value) ){
		     alert("해당 문자는 입력하실수 없습니다.");
		     obj.value = obj.value.trim().substring( 0 , obj.value.length - 1 ); // 입력한 특수문자 한자리 지움
		  }
		
		}
		
	function spaceCheck(){
		 var titleBox = document.getElementById("name").value.trim(); // 트림 메소드로 공백 삭제
		 document.getElementById("name").value = titleBox; // 대입
	}
	
	function textCheck(){
		var textareaStr = document.getElementById("form").value; // 값 찾아오기
		var titleBoxStr = document.getElementById("titleText").value; // 값 찾아오기
		document.getElementById("form").value = textareaStr.replaceAll("&", "&amp;").replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll("\"", "&quot;").replaceAll("\\", "&#39;"); // 특수문자 변환
		document.getElementById("titleText").value = titleBoxStr.replaceAll("&", "&amp;").replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll("\"", "&quot;").replaceAll("\\", "&#39;"); // 특수문자 변환
		
	}
</script>
