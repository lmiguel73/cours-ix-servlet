<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8>
<title>Redirected</title>
<%@include file="WEB-INF/include/assets.jsp"%>
</head>
<body>
  <%@include file="WEB-INF/include/menu.jsp"%>
  <h1>Redirected :</h1>
  <h2>
    URI :
    <%=request.getRequestURI()%></h2>
  <h2>
    URL :
    <%=request.getRequestURL().toString()%></h2>
  <a href="<%=request.getContextPath()%>/redirectAndForward">Back</a>
</body>
</html>
