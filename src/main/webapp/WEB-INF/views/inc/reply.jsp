<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
	<body>
		<div class="row" align="center" style="margin-top:20px;">
			<table class="table table-hover">
				<thead class="thead-light">
					<tr>
						<th scope="col">User Name</th>
						<th scope="col">Content</th>
						<th scope="col">Post Date</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${ replyList }" var="replyList">
						<tr>
							<td><c:out value="${ replyList.userName }" /></td>
							<td><c:out value="${ replyList.content }" /></td>
							<td><c:out value="${ replyList.postDate }" /></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<sec:authorize access="isAuthenticated()" var="isAuthenicated" />
	 	<c:choose>
	 		<c:when test="${ isAuthenicated }">
				<form:form modelAttribute="newReply" method="post">
	  				<div class="container" style="padding-left:0px; padding-right:0px;">
	  					<c:if test="${catetory == 'game' }">
	  						<form:hidden path="rootId" value="${ game.gameId }"/>
	  					</c:if>
				  		<c:if test="${ category == 'board' }">
				  			<form:hidden path="rootId" value="${ board.postId }"/>
				  		</c:if>
				        <form:hidden path="userName" value="${ username }"/>
				        <input name="${_csrf.parameterName }" type="hidden" value="${_csrf.token }" />
				        <form:input type="text" class="form-control mb-2" path="content"  placeholder="댓글을 입력하세요" />
				        <form:hidden path="category" value="${ category }"/>
				       	<div class="float-right">
				       		<input type="submit" class="btn btn-primary mb-2" value="쓰기" />
				       	</div>
					</div>
				</form:form>
			</c:when>
		</c:choose>
	</body>
</html>