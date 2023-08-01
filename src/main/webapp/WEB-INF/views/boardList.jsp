<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<style>
body {
	background-color: gray;
}
</style>
<link
	href="${ pageContext.request.contextPath }/resources/css/bootstrap.min.css" rel="stylesheet">
<meta charset="UTF-8">
<title>Welcome to Game Library</title>
</head>
<body>
	<%@ include file="./inc/header.jsp"%>

	<div class="container" style="margin-bottom:80px;">
		<div class="row" align="center">
			<table class="table table-hover">
				<thead class="thead-dark">
					<tr>
						<th scope="col">#</th>
						<th scope="col">Title</th>
						<th scope="col">User Name</th>
						<th scope="col">Post Date</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${ boardList }" var="boardList">
						<tr>
							<td>${ boardList.postId }</td>
							<td><a style="color:black; text-decoration:none" href="${ pageContext.request.contextPath }/postView?id=${ boardList.postId }">${ boardList.title }</a></td>
							<td>${ boardList.userName }</td>
							<td>${ boardList.postDate }</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<div class="float-right">
			<a href="<c:url value='./member/addPost'/>" class="btn btn-primary">NEW</a> 
		</div>
	</div>
	
	<%@ include file="./inc/footer.jsp"%>

</body>
</html>