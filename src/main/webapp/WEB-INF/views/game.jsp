<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<style>
		body {background-color:gray;}
	</style>
	<link href="${ pageContext.request.contextPath }/resources/css/bootstrap.min.css" rel="stylesheet">
	<meta charset="UTF-8">
	<title>${ game.title }</title>
</head>
	<body>
		<%@ include file="./inc/header.jsp" %>

		<div class="container">
			<div class="row">
				<div class="col -md-4">
					<h3>${ game.title }</h3>
					<p><b>게임 코드 : </b><span class="badge badge-info">${ game.gameId }</span>
					<p><b>개 발 사 : </b>${ game.developer } | ${ game.developerCountry }
					<p><b>배 급 사 : </b>${ game.publisher } | ${ game.publisherCountry }
					<p><b>장   르 : </b>${ game.genre }
					<p><b>출 시 일 : </b>${ game.releaseDate }
					<p><b>상세 설명 : </b>${ game.description }
					<h4>${ game.priceToString }</h4>
					<br />
					<p><a href="#" class="btn btn-primary">게임 주문 &raquo;</a>
						 <a href="<c:url value="./all"/>"class="btn btn-secondary">게임 목록 &raquo;</a>
						 <sec:authorize access="hasAuthority('ROLE_ADMIN')" var="isAdmin" ></sec:authorize>
						 	<c:choose>
						 		<c:when test="${ isAdmin }">
						 			<a href="<c:url value="./admin/update?id=${ game.gameId }"/>"class="btn btn-warning">수정하기 &raquo;</a>
						 			<a href="<c:url value="./admin/delete?id=${ game.gameId }"/>"class="btn btn-danger">삭제하기 &raquo;</a>
						 		</c:when>
						 	</c:choose>
				</div>
				<div class="col -md-6">
					<img style="position: absolute; top:0; left:0; width:100%;" src=${ pageContext.request.contextPath }/resources/imageFiles/${ game.imgPath } />
				</div>
			</div>
		</div>
		<%@ include file="./inc/footer.jsp" %>
	</body>
</html>