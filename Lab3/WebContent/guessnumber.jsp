<%@page import="java.util.Random"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Number Guess</title>
</head>
<body>
	<%
		int numToGuess = 3;
		String num = request.getParameter("guess");
		if (num != null) {
			int guess = Integer.parseInt(num);
			if (guess == numToGuess) {
	%>
	Congratulations, your guess is correct
	<%
		} else {
				if (guess < numToGuess) {
	%>
	<h3>Too low, try higher</h3>
	<br />
	<%
		} else {
	%>
	<h3>Too high, try lower</h3>
	<br />
	<%
		}
	%>
	<form action='guessnumber.jsp' method='get'>
		Guess a number between 0 and 10 <input type=text name=guess size=5><br>
		<input type=submit value='submit' />
	</form>
	<%
		}

		} else {
	%>
	<form action='guessnumber.jsp' method='get'>
		Guess a number between 0 and 10 <input type=text name=guess size=5><br>
		<input type=submit value='Submit' />
	</form>
	<%
		}
	%>

</body>
</html>
