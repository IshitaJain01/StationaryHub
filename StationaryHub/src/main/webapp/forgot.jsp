<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>


     body {
    background-position: center;
    background-color: #eee;
    background-repeat: no-repeat;
    background-size: cover;
    color: #505050;
    font-family: "Rubik",Helvetica,Arial,sans-serif;
    font-size: 14px;
    font-weight: normal;
    line-height: 1.5;
    text-transform: none;
}

.forgot{
	    background-color: #fff;
    padding: 12px;
    border: 1px solid #dfdfdf;
}

.padding-bottom-3x {
    padding-bottom: 72px !important;
}

.card-footer{
	background-color: #fff;
}

.btn{ 

	font-size: 13px;
}

.form-control:focus {
    color: #495057;
    background-color: #fff;
    border-color: #76b7e9;
    outline: 0;
    box-shadow: 0 0 0 0px #28a745;
}
               
</style>
</head>
<body>
  
     <div class="container padding-bottom-3x mb-2 mt-5">
      <div class="row justify-content-center">
        <div class="col-lg-8 col-md-10">
          <div class="forgot">
          	
          	<h2>Forgot your password?</h2>
          <p>Change your password. But first verify your email.
          
          <form class="card mt-4" action="EnterOtp.jsp" method="post">
            <div class="card-body">
              <div class="form-group">
                <label for="email-for-pass">Enter your email address</label>
                <input class="form-control" type="text" name="email" id="email-for-pass" required=""><small class="form-text text-muted">Enter the email address you used during the registration . Then we'll email a link to this address.</small>
              </div>
            </div>
            <div class="card-footer">
               
               <button  class="btn btn-success" type="submit">Verify</button>
              <a href="login.jsp">Back to login</a>
            </div>
          </form>
        </div>
      </div>
    </div>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css">
  </body>
</html>