<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Redirect and forward differences</title>
<%@include file="WEB-INF/include/assets.jsp"%>
</head>
<body>
  <%@include file="WEB-INF/include/menu.jsp"%>
  <h1>Redirect and forward differences</h1>
  <form action="redirect">
    <input type="submit" value="Redirect" />
  </form>
  <form action="" method="post">
    <input type="submit" value="Forward" />
  </form>
</body>
</html>
