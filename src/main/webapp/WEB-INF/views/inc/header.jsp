<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>header</title>
</head>
<body>
	<div class="jumbotron"
		style="height: 200px; background-color: black; padding: 45px; display: flex; margin-bottom: 0px; border-radios: 0px;">
		<div class="container"
			style="width: 350px; margin-left: 0px; width: 450px;">
			<span><a href="${ pageContext.request.contextPath }/all"><img
					height="100px"
					src="${ pageContext.request.contextPath }/resources/img/jumbotronBackgroundImg.gif"></a></span><span
				style="display: inline-block; height: 85px; font-size: 2.5em; color: white; font-weight: bold; margin-top: 25px; text-align: center; vertical-align: middle;"><a
				style="color: white; text-decoration: none"
				href="${ pageContext.request.contextPath }/all">GAME LIBRARY</a></span>
		</div>
		<form class="form-inline" action="${ pageContext.request.contextPath }/title" method="get">
			<div class="form-group mx-sm-3 mb-2">
				<div class="dropdown">
				  <a class="btn btn-secondary dropdown-toggle" href="#" role="button" data-toggle="dropdown" aria-expanded="false">검색설정</a>
				  <div class="dropdown-menu">
				    <a class="dropdown-item" href="#">타이틀</a>
				    <a class="dropdown-item" href="#">장르</a>
				    <a class="dropdown-item" href="#">개발사</a>
				    <a class="dropdown-item" href="#">배급사</a>
				  </div>
				</div>
				<input type="text" class="form-control" name="gameTitle" placeholder="타이틀을 입력하세요">
			</div>
			<button type="submit" class="btn btn-primary mb-2">검색</button>
		</form>
	</div>
	<nav class="navbar navbar-expand navbar-dark bg-dark" style="margin-bottom: 50px; padding-right:45px;">
		<div class="container" style="margin-left: 10px; margin-right: 10px; display: flex;">
			<div class="navbar-header">
				<a class="navbar-brand" href="${ pageContext.request.contextPath }/home">
					<img height="35px" src="${ pageContext.request.contextPath }/resources/imageFiles/icon/iconHome.png">
				</a>
				<a class="navbar-brand" href="${ pageContext.request.contextPath }/all">게임 목록</a> 
				<a class="navbar-brand" href="${ pageContext.request.contextPath }/admin/add">신규 등록</a>
				<a class="navbar-brand" href="${ pageContext.request.contextPath }/boardList">게시판</a> 
			</div>
		</div>
		<div class="float-right" style="width:200px; displsy:inline-block">
			<sec:authorize access="isAuthenticated()" var="isAuthenicated" />
			<c:choose>
				<c:when test="${ isAuthenicated }">
					<span style="color: white; font-weight: bold; margin-right:20px; displsy:inline-block">
						<sec:authentication property="principal.username" var="username" /> ${ username } 님</span>
						<form class="form-inline" action="./logout" method="post">
							<button type="submit" class="btn btn-primary" href="">마이페이지</button> 
							<button type="submit" class="btn btn-secondary mb-1">로그아웃</button>
							<input name="${_csrf.parameterName }" type="hidden" value="${_csrf.token }" />
						</form>
				</c:when>
				<c:otherwise>
					<a class="btn btn-primary" href="./addUser">가입하기</a>
					<button type="button" onclick="location.href='${ pageContext.request.contextPath }/login'" class="btn btn-secondary mb-1">로그인</button>
				</c:otherwise>
			</c:choose>
		</div>
	</nav>
</body>
</html>



