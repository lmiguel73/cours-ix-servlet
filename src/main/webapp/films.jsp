<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"
%>
<%@ page import="java.util.List"%>
<%@ page import="edu.formation.model.Film"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8>
<title>Liste des films</title>
</head>
<body>
  <h1>Liste des films</h1>
  <ul>

    <%
        List<Film> films = (List<Film>) request.getAttribute("films");
        for (Film film : films)
        {
    %>
    <li>
      <p>
        <a href="?id=<%=film.getId()%>"><%=film.getNom()%></a>
      </p>
      <ul>
        <li><%=film.getDuree()%> minutes</li>
        <li><%=film.getAnnee()%></li>
      </ul>
    </li>
    <%
        }
    %>
  </ul>
</body>
</html>