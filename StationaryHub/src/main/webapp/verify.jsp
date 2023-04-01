<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.inventory.servlet.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="signup">

		<form action="Sign-up" method="post">
			<input type="text" name="otp" placeholder="Enter OTP" /> <input
				type="hidden" placeholder="FIRST NAME" name="fname"
				value="<%=request.getParameter("fname")%>" /> <input type="hidden"
				placeholder="LAST NAME" name="lname"
				value="<%=request.getParameter("lname")%>" /> <input type="hidden"
				placeholder="EMAIL" name="email"
				value="<%=request.getParameter("email")%>" /> <input type="hidden"
				placeholder="PHONE NO." name="phnumber"
				value="<%=request.getParameter("phnumber")%>" /> <input
				type="hidden" placeholder="ADDRESS" name="address"
				value="<%=request.getParameter("address")%>" /> <input
				type="hidden" placeholder="PASSWORD" name="password"
				value="<%=request.getParameter("password")%>" />

			<button type="submit">Verify</button>
		</form>
        <%
	SendEmail se = new SendEmail();
	se.sendMail(request.getParameter("email").trim()+"");
	%>
	

</body>
</html>