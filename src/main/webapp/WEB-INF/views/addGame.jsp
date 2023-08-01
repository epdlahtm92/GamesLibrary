<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="${ pageContext.request.contextPath }/resources/css/bootstrap.min.css"
	rel="stylesheet">
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
					<label class="col-sm-2 control-label">타이틀</label>
					<div class="col -sm-3">
						<form:input path="title" id="titleText" class="form-control" />
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
						<form:select path="genre" class="form-control">
							<option value="Action">액션</option>
							<option value="Adventure">어드벤쳐</option>
							<option value="RolePlaying">롤플레잉</option>
							<option value="Shooting">슈팅</option>
							<option value="Puzzle">퍼즐</option>
							<option value="Arcade">아케이드</option>
							<option value="Simulation">시뮬레이션</option>
							<option value="Casual">캐주얼</option>
							<option value="Strategy">전략</option>
							<option value="MOBA">MOBA/AOS</option>
							<option value="Unique">유니크</option>
							<option value="Sports">스포츠</option>
							<option value="Racing">레이싱</option>
							<option value="Fighting">격투</option>
							<option value="Horror">공포</option>
							<option value="Music">음악</option>
							<option value="Quiz">퀴즈</option>
							<option value="Education">교육</option>
							<option value="Adult">성인</option>
							<option value="Fitness">피트니스</option>
							<option value="Others">기타</option>
						</form:select>
					</div>
				</div>
				<div class="form-group row" >
					<label class="col-sm-2 control-label">지원 플랫폼</label>
					<div class="col -sm-3">
						<div class="input-group-text">
							<span>PC</span><form:checkbox path="platform" value="pc" class="form-control" />
							<span>Playstation</span><form:checkbox path="platform" value="playstation" class="form-control" />
							<span>XBOX</span><form:checkbox path="platform" value="xbox" class="form-control" />
							<span>NINTENDO</span><form:checkbox path="platform" value="nintendo" class="form-control"  />
						</div>
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
						<form:textarea path="description" cols="50" rows="2"
							class="form-control"></form:textarea>
					</div>
				</div>
				<div class="form-group row">
					<label class="col-sm-2 control-label">사진 추가</label>
					<div class="col -sm-3">
						<form:input path="imageFile" type="file" cols="50" rows="2"
							class="form-control" />
						<input type="hidden" name="${_csrf.parameterName}"
							value="${_csrf.token}" />
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