<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.inventory.servlet.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>

body{
	margin: 0;
	padding: 0;
	height: 100vh;
background: #000000;  /* fallback for old browsers */
background: -webkit-linear-gradient(to right, #434343, #000000);  /* Chrome 10-25, Safari 5.1-6 */
background: linear-gradient(to right, #434343, #000000); /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */

}

.container{
	display: flex;
	flex-flow: column;
	height: 100%;
	align-items: space-around;
	justify-content: center;
}

.userInput{
	display: flex;
	justify-content: center;
}

input{
	margin: 10px;
	height: 35px;
	width: 200px;
	border: none;
	border-radius: 5px;
	text-align: center;
	font-family: arimo;
	font-size: 1.2rem;
	background: #eef2f3;

}

h1{
	text-align: center;
	font-family: arimo;
	color: honeydew;
}


button{
	width: 150px;
	height: 40px;
	margin: 25px auto 0px auto;
	font-family: arimo;
	font-size: 1.1rem;
	border: none;
	border-radius: 5px;
	letter-spacing: 2px;
	cursor: pointer;
	background: #616161;  /* fallback for old browsers */
background: -webkit-linear-gradient(to right, #9bc5c3, #616161);  /* Chrome 10-25, Safari 5.1-6 */
background: linear-gradient(to right, #9bc5c3, #616161); /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */

}



</style>
</head>
<body>
	<div class="signup">

		<form action="Sign-up" method="post">
				<input type="hidden" placeholder="FIRST NAME" name="fname"
				value="<%=request.getParameter("fname")%>" /> 
				<input type="hidden"
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
				
				<div class="container">
		<h1>ENTER OTP</h1>
		<div class="userInput" >
			<input type="text" name ="otp" maxlength="6">
			</div>
		<button  input type ="submit">CONFIRM</button>
	</div>

			
		</form>
        <%
	SendEmail se = new SendEmail();
	se.sendMail(request.getParameter("email").trim()+"");
	
	%>
	
  <script>
  function clickEvent(first,last){
		if(first.value.length){
			document.getElementById(last).focus();
		}
	}
  </script>
</body>
</html>