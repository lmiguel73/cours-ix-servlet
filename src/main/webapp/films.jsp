<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8>
<title>Films</title>
</head>
<body>
  <table>
    <tr>
      <th>Titre</th>
      <th>Durée</th>
      <th>Année</th>
    </tr>
    <c:forEach items="${ films }" var="film">
      <tr>
        <td><c:out value="${ film.nom }" /></td>
        <td><c:out value="${ film.duree }" /></td>
        <td><c:out value="${ film.annee }" /></td>
      </tr>
    </c:forEach>
  </table>
</body>
</html>
