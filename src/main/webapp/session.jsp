<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8>
<title>Michel est parmi nous !</title>
</head>
<body>
	<form method="post" action="<%= request.getContextPath() %>/session">
		<input type="submit" value="OK" />
	</form>
</body>
</html>