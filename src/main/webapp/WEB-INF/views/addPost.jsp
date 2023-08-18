<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>

<!-- ====================================================================== -->

<script src="https://code.jquery.com/jquery-3.5.1.min.js"
crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
	integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
	crossorigin="anonymous"></script>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
	integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
	crossorigin="anonymous"></script>

<link
	href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-bs4.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-bs4.min.js"></script>


<!-- ====================================================================== -->

<!DOCTYPE html>
<html>
<head>
<link
	href="${ pageContext.request.contextPath }/resources/css/bootstrap.min.css"
	rel="stylesheet">
<meta charset="UTF-8">
<title>Add Post Page</title>
</head>
<body>
	<%@ include file="./inc/header.jsp"%>

	<div class="container">
		<form:form modelAttribute="newPost" class="form-horizontal"
			method="post" enctype="multipart/form-data">
			<fieldset>
				<legend>${ addTitle }</legend>
				<div class="form-group row">
					<label class="col-sm-2 control-label">타이틀</label>
					<div class="col -sm-3">
						<form:input path="title" class="form-control" />
					</div>
				</div>
				<div class="form-group row">
					<label class="col-sm-2 control-label" >내용</label>
					<div class="col -sm-3">
						<form:textarea id="summernote" path="content"></form:textarea>>
					</div>
				</div>
				<div class="form-group row">
					<label class="col-sm-2 control-label">유저 이름</label>
					<div class="col -sm-3">
						<form:input type="text" path="userName" class="form-control"
							value="${ username }" readonly="true" />
						<input name="${_csrf.parameterName }" type="hidden"
							value="${_csrf.token }" />
					</div>
				</div>
				<div class="float-right">
					<div class="col -sm-offset-2 col -sm-10"
						style="padding-right: 0px;">
						<input type="submit" class="btn btn-primary" value="등록" /> <input
							type="reset" class="btn btn-warning" value="다시쓰기" />
					</div>
				</div>
			</fieldset>
		</form:form> 
	</div>

	<%@ include file="./inc/footer.jsp"%>
</body>

 	<script>
      $('#summernote').summernote({
        placeholder: '내용을 입력하세요', tabsize: 2, height: 400
      });
    </script>
    
</html>