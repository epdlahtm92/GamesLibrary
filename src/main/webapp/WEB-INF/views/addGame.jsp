<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<link href="${ pageContext.request.contextPath }/resources/css/bootstrap.min.css" rel="stylesheet">
<meta charset="UTF-8">
<title>Add Game Page</title>
</head>
<body>
	<%@ include file="./inc/header.jsp" %>

	<div class="container">
		<form:form modelAttribute="newGame" class="form-horizontal" method="post" enctype="multipart/form-data">
			<fieldset>
			<legend>${ addTitle }</legend>
			<div class="form-group row">
				<label class="col-sm-2 control-label">게임 코드</label>
				<div class="col -sm-3">
					<form:input path="gameId" class="form-control" />
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2 control-label">타이틀</label>
				<div class="col -sm-3">
					<form:input path="title" class="form-control" />
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2 control-label">개발사</label>
				<div class="col -sm-3">
					<form:input path="developer" class="form-control" />
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2 control-label">개발사 국가</label>
				<div class="col -sm-3">
					<form:input path="developerCountry" class="form-control" />
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2 control-label">배급사</label>
				<div class="col -sm-3">
					<form:input path="publisher" class="form-control" />
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2 control-label">배급사 국가</label>
				<div class="col -sm-3">
					<form:input path="publisherCountry" class="form-control" />
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2 control-label">시리즈 이름</label>
				<div class="col -sm-3">
					<form:input path="seriesName" class="form-control" />
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2 control-label">시리즈 넘버</label>
				<div class="col -sm-3">
					<form:input path="seriesNumber" class="form-control" />
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2 control-label">장르</label>
				<div class="col -sm-3">
					<form:input path="genre" class="form-control" />
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2 control-label">가격</label>
				<div class="col -sm-3">
					<form:input path="price" class="form-control" />
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2 control-label">발매일</label>
				<div class="col -sm-3">
					<form:input path="releaseDate" class="form-control" />
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2 control-label">상세 설명</label>
				<div class="col -sm-3">
					<form:textarea path="description" cols="50" rows="2" class="form-control"></form:textarea>
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2 control-label">사진 추가</label>
				<div class="col -sm-3">
					<form:input path="imageFile" type="file" cols="50" rows="2" class="form-control" />
					<input type="hidden"  name="${_csrf.parameterName}" value="${_csrf.token}" />
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