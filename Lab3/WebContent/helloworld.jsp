<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lab 3</title>
</head>
<body>
	<h2>Hello World</h2>
	<%
		for (int i = 1; i <= 10; i++) {
			out.print("<h2>");
			out.print(Integer.toString(i));
			out.println("</h2>");
		}
	%>
</body>
</html>