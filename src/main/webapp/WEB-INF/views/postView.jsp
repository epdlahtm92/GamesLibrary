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
	<title>${ board.title }</title>
</head>
	<body>
		<%@ include file="./inc/header.jsp" %>

		<div class="container" style="margin-bottom:70px;">
			<div class="row">
				<div class="col -md-4">
					<h3><c:out value="${ board.title }" /></h3>
					<p><b>작성자 : </b><c:out value="${ board.userName } | ${ board.postDate }" />
					<p><b>내용 : </b>${ board.content }
					<br />
					<p><a href="" class="btn btn-primary">게임 주문 &raquo;</a>
						 <a href="${ pageContext.request.contextPath }/boardList" class="btn btn-secondary">글 목록 &raquo;</a>
						 <sec:authorize access="hasAuthority('ROLE_ADMIN')" var="isAdmin" ></sec:authorize>
						 	<c:choose>
						 		<c:when test="${ isAdmin }">
						 			<a href="${ pageContext.request.contextPath }/admin/updatePost?boardId=${ board.boardId }" class="btn btn-warning">수정하기 &raquo;</a>
						 			<a href="<c:url value="${ pageContext.request.contextPath }/admin/deletePost?boardId=${ board.boardId }"/>"class="btn btn-danger">삭제하기 &raquo;</a>
						 		</c:when>
						 	</c:choose>
				</div>
			</div>
			<c:set var="category" value="board" />
			<%@ include file="./inc/reply.jsp" %>
		</div>
		
		<%@ include file="./inc/footer.jsp" %>
	</body>
</html>