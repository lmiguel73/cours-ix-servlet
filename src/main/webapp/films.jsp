<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<title>Films</title>
</head>
<body class="container">
	<h1 class="text-center">Liste de tous les films</h1>
		<c:forEach items="${ films }" var="film">
		<div class="col-md-6 jumbotron">	
			<h2>
			<span class="glyphicon glyphicon-facetime-video btn btn-info" aria-hidden="true"></span>
			<span class="glyphicon glyphicon-hd-video btn btn-info" aria-hidden="true"></span>
			<span class="glyphicon glyphicon-sound-5-1 btn btn-info" aria-hidden="true"></span>
			<span class="glyphicon glyphicon-film btn btn-info" aria-hidden="true"></span>
			
				<c:out value="${ film.nom }" />
			</h2>
			<p>
				<c:out value="${ film.duree } Minutes" />
			</p>
			<p>
				<c:out value="Année ${ film.annee }" />
			</p>
			<p class="btn btn-info"><span class="badge">${film.id}</span> <a class="" href="?id=${ film.id }">Plus d'infos</a></p>
		
	</div>
		</c:forEach>
	
</body>
</html>
