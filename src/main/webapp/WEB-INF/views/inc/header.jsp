<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>header</title>
<link rel="faivicon" href="${ pageContext.request.contextPath }/resources/imagFiles/icon/favicon.ico">
</head>
<body>	
	<div class="jumbotron" style="height:200px; background-color:black; padding:45px; display:flex; margin-bottom:0px; border-radios:0px;">
		<div class="container" style="width:350px; margin-left:0px; width:450px;">
			<span><a href="${ pageContext.request.contextPath }/all"><img height="100px" src="${ pageContext.request.contextPath }/resources/img/jumbotronBackgroundImg.gif"></a></span><span style="display:inline-block; height:85px; font-size:2.5em; color:white; font-weight:bold; margin-top:25px; text-align:center; vertical-align:middle;"><a style="color:white; text-decoration:none " href="${ pageContext.request.contextPath }/all">GAME LIBRARY</a></span>
		</div>
		<form class="form-inline" >
			  <div class="form-group mx-sm-3 mb-2">
			    <input type="text" class="form-control" id="search" placeholder="타이틀을 입력하세요">
			  </div>
			  <button type="button" onclick="location.href=''" class="btn btn-primary mb-2">search</button>
		</form>
	</div>
	
	<nav class="navbar navbar-expand navbar-dark bg-dark" style="margin-bottom:50px; display:flex;">
		<div class="container" style="margin-left:10px;">
			<div class="navbar-header">
				<a class="navbar-brand" href="${ pageContext.request.contextPath }/home"><img height="35px" src="${ pageContext.request.contextPath }/resources/imageFiles/icon/iconHome.png"></a> 
				<a class="navbar-brand" href="${ pageContext.request.contextPath }/all">게임 목록</a> 
				<a class="navbar-brand" href="${ pageContext.request.contextPath }/boardList">게시판</a>
				<a class="navbar-brand" href="${ pageContext.request.contextPath }/admin/add">신규 등록</a>
			</div>
			<div class="container" style="width:500px; height:45px; margin-right:10px; align:right;">
				<sec:authorize access="isAuthenticated()" var="isAuthenicated" ></sec:authorize>
					<c:choose>
						<c:when test="${ isAuthenicated }">
							<span style="color:white; font-weight:bold;"><sec:authentication property="principal.username" /> 님</span>
							<span><form action="./logout" method="POST">
											<button type="submit" class="btn btn-secondary mb-1">LOGOUT</button>
											<input name="${_csrf.parameterName }" type="hidden" value="${_csrf.token }" />
									   </form></span>
						</c:when>
						<c:otherwise> 
							<button type="button" onclick="location.href='${ pageContext.request.contextPath }/login'" class="btn btn-secondary mb-1">Log In</button>
 						</c:otherwise>
					</c:choose>
			</div>
		</div>
	</nav>
</body>
</html>


	
	