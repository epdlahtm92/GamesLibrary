<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="${ pageContext.request.contextPath }/resources/css/bootstrap.min.css"
	rel="stylesheet">
<title>회원 가입</title>
</head>
<body>
	<%@ include file="./inc/header.jsp" %>
	
	<div class="container">
		<form:form modelAttribute="newUser" class="form-horizontal" method="post">
			<fieldset>
				<legend>${ addTitle }</legend>
				<div class="form-group row">
					<label class="col-sm-2 control-label">아이디</label>
					<div class="col -sm-3">
						<form:input path="userName" class="form-control" />
					</div>
				</div>
				<div class="form-group row">
					<label class="col-sm-2 control-label">비밀번호</label>
					<div class="col -sm-3">
						<form:input path="password" class="form-control" />
					</div>
				</div>
				<div class="form-group row">
					<label class="col-sm-2 control-label">비밀번호 확인</label>
					<div class="col -sm-3">
						<form:input path=""  class="form-control" />
					</div>
				</div>
				<div class="form-group row">
					<label class="col-sm-2 control-label">이메일</label>
					<div class="col -sm-3">
						<form:input path="eMail" class="form-control" />
					</div>
				</div>	
				<div class="float-right">
					<div class="col -sm-offset-2 col -sm-10" style="padding-right:0px;">
						<input type="reset" class="btn btn-warning" value="다시쓰기" />
						<input type="submit" class="btn btn-primary" value="확인" /> 
					</div>
				</div>		
			</fieldset>
		</form:form>
	</div>
	
	<%@ include file="./inc/footer.jsp"%>
</body>
</html>