<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
	<style>
		body {background-color:gray;}
	</style>
<link href="${ pageContext.request.contextPath }/resources/css/bootstrap.min.css" rel="stylesheet">
<meta charset="UTF-8">
<title>Welcome to Game Library</title>
<script type="text/javascript">
	function searchingGame() {
		var path = pageContextPath;
		var searchText = document.getElementById("search").value;
		if (searchText != null) {
			location.href= "../title/" + searchText;
		}
		return false
	}
</script>
</head>
<body>
	<%@ include file="./inc/header.jsp" %>

	<div class="container">
		<div class="row" align="center">
			<c:forEach items="${ gameList }" var="game">
				<div class="col -md-4">
					<h3><a style="color:black; text-decoration:none" href=./game?id=${ game.gameId }>${ game.title }</a></h3>
					<p><a style="color:black; text-decoration:none" href=./game?id=${ game.gameId }>
						<img width=460 height=230 src=${ pageContext.request.contextPath }/resources/imageFiles/${ game.imgPath } />
					   </a></p>
						<br> 시리즈 : ${ game.seriesName } 시리즈  ${ game.seriesNumber } 번 째 작품
						<br> 개발사 : ${ game.developer } | 국가 : ${ game.developerCountry } 
						<br> 배급사 : ${ game.publisher } | 국가 : ${ game.publisherCountry } 
						<br> 장르 : ${ game.genre } | 발매일 : ${ game.releaseDate }
					<p align=left>${fn:substring(game.description, 0, 60)}...
					<p> ${ game.priceToString }
				</div>
			</c:forEach>
		</div>
	</div>
	
	<%@ include file="./inc/footer.jsp" %>
	
</body>
</html>