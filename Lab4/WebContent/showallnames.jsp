<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Names</title>
</head>
<body>
	<c:if test="${list!=null && clicked == true}">
		<p>List of all names</p>
		<table>
			<c:forEach var="key" items="${list}">
				<tr>
					<td>Key= ${key.key}</td>
					<td>First Name= ${key.value.firstName}</td>
					<td>Last Name= ${key.value.lastName}</td>
				</tr>
			</c:forEach>
		</table>
		<br />
	</c:if>
	<div>
		<form method="get" action="showName">
			<input type="submit" value="Show Names" />
		</form>
	</div>
	<div>
		<form method="get" action="addName">
			Key=<input type="text" name="key" /> First Name=<input type="text"
				name="firstName" /> Last Name=<input type="text" name="lastName" />
			<input type="submit" value="Add" />
		</form>
	</div>
	<div>
		<form method="get" action="removeName">
			Key=<input type="text" name="key" /> <input type="submit"
				value="Remove" />
		</form>
	</div>
</body>
</html>
