<html> 
<%@ include file = "header.jsp" %>
	<body>
		<h1>
			Welcome ${name}
		</h1>
		<br/>
		<p><font color="Gray">Your Todos</font></p>
    	<form action="/spring/list-todos" method="POST">
        	<input type="submit" value="Click Me" style="padding:5px; margin:1em; border-radius:1em;"/>
    	</form>
	</body>
</html>