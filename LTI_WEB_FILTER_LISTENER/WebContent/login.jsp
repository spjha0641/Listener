<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>in login jsp</title>
</head>
<body>

<%
	String username= request.getParameter("username");
	String password = request.getParameter("password");
	
	if(username.equals(password))
	{
		System.out.println(username+" : "+password);
		request.getRequestDispatcher("success.jsp").forward(request, response);
	}
	else
	{
		request.getRequestDispatcher("failure.jsp").forward(request, response);
	}

%>

</body>
</html>