<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.alert {
	padding: 20px;
	background-color: green;
	color: white;
	margin-bottom: 15px;
}

.closebtn {
	margin-left: 15px;
	color: white;
	font-weight: bold;
	float: right;
	font-size: 22px;
	line-height: 20px;
	cursor: pointer;
	transition: 0.3s;
}

.closebtn:hover {
	color: black;
}
</style>
</head>
<body>
	<%
	String message = (String) session.getAttribute("message");
	if (message != null) {
	%>
	<div class="alert">
		<span class="closebtn"
			onclick="this.parentElement.style.display='none';">&times;</span> <strong><%=message%></strong>
	</div>
	<% 
	session.removeAttribute("message");
	}
	
	%>
	
	<%
	String wrong=(String)session.getAttribute("Wrong");
	if (wrong != null) {
		%>
		<div class="alert" style="background-color:Red">
			<span class="closebtn"
				onclick="this.parentElement.style.display='none';">&times;</span> <strong><%=wrong%></strong>
		</div>
		<%
		session.removeAttribute("Wrong");
		
	}
	
	
	String profile = (String) session.getAttribute("profile_updated");
	if (profile != null) {
	%>
	<div class="alert">
		<span class="closebtn"
			onclick="this.parentElement.style.display='none';">&times;</span> <strong><%=profile%></strong>
	</div>

	<%
	session.removeAttribute("profile_updated");
	}
	%>
	
	
	<%
	String OTPmessage = (String) session.getAttribute("OTPmessage");
	if (OTPmessage != null) {
	%>
	<div class="alert">
		<span class="closebtn"
			onclick="this.parentElement.style.display='none';">&times;</span> <strong><%=OTPmessage%></strong>
	</div>
	<% 
	session.removeAttribute("OTPmessage");
	}
	
	%>
	
		<%
	String gltotp= (String) session.getAttribute("gltotp");
	if (gltotp!= null) {
	%>
	<div class="alert">
		<span class="closebtn"
			onclick="this.parentElement.style.display='none';">&times;</span> <strong><%=gltotp%></strong>
	</div>
	<% 
	session.removeAttribute("gltotp");
	}
	
	%>
	
	<%
	String status= (String) session.getAttribute("status");
	if (status!= null) {
	%>
	<div class="alert">
		<span class="closebtn"
			onclick="this.parentElement.style.display='none';">&times;</span> <strong><%=status%></strong>
	</div>
	<% 
	session.removeAttribute("status");
	}
	
	%>




</body>
</html>