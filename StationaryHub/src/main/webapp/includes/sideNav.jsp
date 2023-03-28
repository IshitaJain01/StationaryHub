<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="com.inventory.model.*" %>    
<div class="profile-cont">
		<div class="cross">
			<i class="fa-solid fa-xmark"></i>
		</div>
		<div class="profile-box">
			<h2>please log in</h2>
		</div>

		<div class="navigation">
			<div>
				<a href="auth/Login.html" class="item"> <i
					class="fa-solid fa-user"></i>
				<h5>profile</h5>
				</a>
			</div>
			<div>
				<a class="item" href="index.html"> <i class="fa-solid fa-house"></i>
				<h5>Home Page</h5>
				</a>
			</div>
			<div>
				<a class="item" href="auth/Login.html"> <i
					class="fa-solid fa-bag-shopping"></i></i>
				<h5>My Cart</h5>
				</a>
			</div>
			<div>
				<a class="item" href="auth/Login.html"> <i
					class="fa-solid fa-heart"></i>
				<h5>favorite</h5>
				</a>
			</div> 
			<div>
			    <%
			    User user=null;
			    int uid=0;
			    if(session.getAttribute("auth")==null){
			    	response.sendRedirect("index.jsp");
			    } 
			    else{
			     user=(User)session.getAttribute("auth");
			    uid=user.getUser_id();
			    }
			    %>
				<a class="item" href="ShowOrderItems?id=<%out.print(uid);%>">
				<i class="fa-solid fa-clipboard-list"></i></i>
				<h5>Orders</h5>
				</a>
			</div>
			<div>
				<a class="item" href="user/notification.html"> <i
					class="fa-solid fa-bell"></i>
				<h5>Notifications</h5>
				</a>
			</div>
			<hr>
			<div>

				<a class="item" href="auth/Login.html"> <i
					class="fa-solid fa-arrow-right-from-bracket"></i>
				<h5>Sign in</h5>
				</a>


			</div>
		</div>

	</div>
    