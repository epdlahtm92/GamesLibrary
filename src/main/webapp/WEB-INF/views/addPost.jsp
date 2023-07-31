<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<link href="${ pageContext.request.contextPath }/resources/css/bootstrap.min.css" rel="stylesheet">
<meta charset="UTF-8">
<title>Add Post Page</title>
</head>
<body>
	<%@ include file="./inc/header.jsp" %>

	<div class="container">
		<form:form modelAttribute="newPost" class="form-horizontal" method="post" enctype="multipart/form-data">
			<fieldset>
			<legend>${ addTitle }</legend>
			<div class="form-group row">
				<label class="col-sm-2 control-label">타이틀</label>
				<div class="col -sm-3">
					<form:input path="title" class="form-control" />
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2 control-label">내용</label>
				<div class="col -sm-3">
					<form:input path="content" class="form-control" />
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2 control-label">유저 이름</label>
				<div class="col -sm-3">
					<form:input path="userName" class="form-control" />
				</div>
			</div>
			<div class="form-group row">
				<div class="col -sm-offset-2 col -sm-10">
					<input type="submit" class="btn btn-primary" value="등록" />
					<input type="reset" value="다시쓰기" />
				</div>
			</div>
			</fieldset>
		</form:form>
	</div>
	
	<%@ include file="./inc/footer.jsp" %>
</body>
</html>