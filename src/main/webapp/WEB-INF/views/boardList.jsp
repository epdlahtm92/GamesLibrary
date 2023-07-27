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
	href="${ pageContext.request.contextPath }/resources/css/bootstrap.min.css"
	rel="stylesheet">
<meta charset="UTF-8">
<title>Welcome to Game Library</title>
<script type="text/javascript">
	function searchingGame() {
		var path = pageContextPath;
		var searchText = document.getElementById("search").value;
		if (searchText != null) {
			location.href = "../title/" + searchText;
		}
		return false
	}
</script>
</head>
<body>
	<%@ include file="./inc/header.jsp"%>

	<div class="container" style="margin-bottom:80px;">
		<div class="row" align="center">
			<table class="table">
				<thead>
					<tr>
						<th scope="col">#</th>
						<th scope="col">Title</th>
						<th scope="col">Content</th>
						<th scope="col">User Name</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${ boardList }" var="boardList">
						<tr>
							<td>${ boardList.postId }</td>
							<td>${ boardList.title }</td>
							<td>${ boardList.content }</td>
							<td>${ boardList.userName }</td>
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