<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8>
<title>Michel est parmi nous !</title>
<%@include file="include/assets.jsp"%>
</head>
<body>
  <%@include file="include/menu.jsp"%>
  <%
      if (session.getAttribute("id") != null)
      {
          out.append("<p>Utilisateur identifié : " + session.getAttribute("id") + "</p>");
          out.append("<a href=\"" + request.getContextPath()
                  + "/session?logout=true\">Se déconnecter</a>");
      }
      else
      {
  %>
  <form method="post" action="<%=request.getContextPath()%>/session">
    <input name="id" type="text" placeholder="Nom d'utilisateur" /> <input
      type="submit" value="Se connecter" />
  </form>
  <%
      }
  %>
</body>
</html>
