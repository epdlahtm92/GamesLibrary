<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
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
		<form:form modelAttribute="updatePost" class="form-horizontal" method="post" enctype="multipart/form-data">
			<fieldset>
			<legend>${ addTitle }</legend>
			<div class="form-group row">
				<label class="col-sm-2 control-label">타이틀</label>
				<div class="col -sm-3">
					<form:input path="title" class="form-control" value="${ updatePost.title }" />
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2 control-label">내용</label>
				<div class="col -sm-3">
					<form:textarea path="content" cols="50" rows="2" class="form-control" value="${ updatePost.content }" />
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2 control-label">유저 이름</label>
				<div class="col -sm-3">
					<form:input type="text" path="userName" class="form-control" value="${ username }" readonly="true" />
					<input name="${_csrf.parameterName }" type="hidden" value="${_csrf.token }" />
				</div>
			</div>
			<div class="float-right">
				<div class="col -sm-offset-2 col -sm-10" style="padding-right:0px;">
					<input type="submit" class="btn btn-primary" value="등록" />
					<input type="reset" class="btn btn-warning" value="다시쓰기" />
				</div>
			</div>
			</fieldset>
		</form:form>
	</div>
	
	<%@ include file="./inc/footer.jsp" %>
</body>
</html>