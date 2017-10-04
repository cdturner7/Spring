<html>
<%@ include file = "header.jsp" %>
	<body>
    	<p><font color="red">${errorMessage}</font></p>
    	<form action="/spring/login" method="POST">
        	Username : <input name="name" type="text" /> 
        	Password : <input name="password" type="password" /> 
        	<input type="submit" />
    	</form>
	</body>
</html>