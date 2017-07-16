<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8>
<title>Forward</title>
</head>
<body>
  <h1>Forwarded : </h1>
  <h2>URI : <%=request.getRequestURI()%></h2>
  <h2>URL : <%=request.getRequestURL().toString()%></h2>
  <a href="<%= request.getContextPath() %>/redirectAndForward">Back</a>
</body>
</html>