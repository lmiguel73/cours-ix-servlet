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
<title>Film</title>
</head>
<body class="container">
	<h1 class="well">Détail du film sélectionné</h1>
	<div class="col-md-12 jumbotron">
	<div class="col-md-6">
		<p>Film N° ${film.id}</p>
		<p>Titre du film : ${film.nom}</p>
		<p>Durée : ${film.duree} minutes</p>
		<p>Année de sortie : ${film.annee}</p>
		<div><a class="btn btn-primary btn-lg"  href="./film">Retour à la liste <span class="glyphicon glyphicon-retweet" aria-hidden="true"></span></a> 
		
		</div>
	</div>
	<div class="col-md-6">
	<img alt="${film.nom}" class="img-responsive img-thumbnail" src="img/${film.id}.jpg">
	</div>
	</div>
	
</body>
</html>