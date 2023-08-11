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
					<h3><a style="color:black; text-decoration:none" href="./game?gameId=${ game.gameId }"><c:out value="${ game.title }" /></a></h3>
					<p><a style="color:black; text-decoration:none" href="./game?gameId=${ game.gameId }">
						<img width=460 height=230 src="${ pageContext.request.contextPath }/resources/imageFiles/${ game.imgPath }" alt="사진 없음"/>
					   </a></p>
						<br><c:out value="시리즈 : ${ game.seriesName } 의 ${ game.seriesNumber } 번 째 작품" />
						<br><c:out value="개발사 : ${ game.developer } | 국가 : ${ game.developerCountry }" /> 
						<br><c:out value="배급사 : ${ game.publisher } | 국가 : ${ game.publisherCountry }" /> 
						<br><c:out value="장르 : ${ game.genre } | 발매일 : ${ game.releaseDate }" />
					<p align=left><c:out value="${fn:substring(game.description, 0, 60)}..." />
					<p><c:out value="${ game.priceToString }" />
				</div>
			</c:forEach>
		</div>
	</div>
	
	<%@ include file="./inc/footer.jsp" %>
	
</body>
</html>