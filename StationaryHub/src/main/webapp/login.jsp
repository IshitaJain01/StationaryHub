<%@page import="com.inventory.essentials.Hash"%>
<%@page import="com.inventory.util.DBConnection"%>
<%@page import="com.inventory.servlet.*"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

 <script src="/javascripts/fontawesome.js"></script>
 
    
    <link rel="stylesheet" href=".//stylesheets//Login.css" />

 
<title>Login Page</title>
<%--  <%@include  file="/includes/head.jsp" %>  --%>

</head>
<body>
<%@include file="message.jsp" %>
 <i class="on-off fa-solid fa-toggle-off"></i>
    <div class="container">
      <div class="Landing-Screen">
        <div class="Backside-card-body">
          <div class="Backside-card">
            <div class="Backside-card-Left cursor">
              <h5 id="pagelocation">THE STATIONARY HUB</h5>
            </div>
            <div class="Backside-card-Mid cursor">
              <h1>LOGIN</h1>
            </div>
            <div class="Backside-card-Right">
              <div class="nextproduct"></div>
            </div>
          </div>
        </div>
        <div class="main-body">
          <div class="card-body">
            <div class="card">
              <div class="button">
                <div class="button-cont">
                  <button class="login-btn active-btn">Login</button
                  ><button class="signup-btn">Sign Up</button>
                </div>
              </div>
              <div class="login" style="display: initial">
                <form action="user-login" method="post">
                  <input type="text" required placeholder="EMAIL" name="username" />
                  <input
                    type="password" required
                    placeholder="PASSWORD"
                    name="password"
                  />
                  <button type="submit">Log in</button>
                  <a href="forgot.jsp"><u>Forgot Password</u></a>
                </form>
              </div>
              <div class="signup" style="display: none;">
                <form action="verify.jsp" method="post">
                  <input type="text" required placeholder="FIRST NAME" name="fname" />
                   <input type="text" required placeholder="LAST NAME" name="lname" />
                  <input type="text" required placeholder="EMAIL" name="email" />
                  <input type="number" required placeholder="PHONE NO." name="phnumber" />
                   <input type="text" required placeholder="ADDRESS" name="address" />
                  <input
                    type="password" required
                    placeholder="PASSWORD"
                    name="password"
                  />
                  <%
                  SendEmail se=new SendEmail();
                  %>
                  
                  <button type="submit">Sign Up</button>
                 
                 
                  
               </form>
              
              
               </div>
              <div class="icon-cont">
                <a href="/auth/google" class="icon">
                  <h3>Google</h3>
                  <i class="fa-brands fa-google"></i>
                </a>
                <div class="icon">
                  <h3>Facebook</h3>
                  <i class="fa-brands fa-facebook-f"></i>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    
    <%--  --%>
    
    <script>
      let login = document.querySelector(".login");
      let signup = document.querySelector(".signup");
      let loginbtn = document.querySelector(".login-btn");
      let signupbtn = document.querySelector(".signup-btn");
      loginbtn.addEventListener("click", () => {
        loginbtn.classList.add("active-btn");
        signupbtn.classList.remove("active-btn");
        signup.style.display = "none";
        login.style.display = "initial";
      });
      signupbtn.addEventListener("click", () => {
        signupbtn.classList.add("active-btn");
        loginbtn.classList.remove("active-btn");
        login.style.display = "none";
        signup.style.display = "initial";
      });
   </script>

</body>
</html>