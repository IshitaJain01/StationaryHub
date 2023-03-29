<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
   .alert {  padding: 20px;
  background-color: green;  color: white;
  margin-bottom: 15px;}
.closebtn {
  margin-left: 15px;  color: white;
  font-weight: bold;  float: right;
  font-size: 22px;  line-height: 20px;
  cursor: pointer;  transition: 0.3s;
}
.closebtn:hover {  color: black;
}
</style>
</head>
<body>
<%
 String message=(String)session.getAttribute("message");
  if(message!=null)
  {
	  %>
	 <div class="alert"> 
  <span class="closebtn" onclick="this.parentElement.style.display='none';">&times;</span>  
  <strong><%=message%></strong> 
</div>
	  
	 <%
	  
	  session.removeAttribute("message");
  }
%>

</body>
</html>