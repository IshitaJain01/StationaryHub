<%@page import="com.inventory.dao.OrderItemsDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" %>	
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<script src="https://kit.fontawesome.com/d19408b3b1.js"	crossorigin="anonymous" defer></script>

<link rel="stylesheet" href=".//stylesheets//order.css" />

<title>YourChoice</title>

</head>
<body>
	<i class="on-off fa-solid fa-toggle-off"></i>
	<%@include file=".//includes//sideNav.jsp"%>
	
	<div class="container">
		<nav>
			<div class="navLeft">
				<div class="icon" id="profile-cont-off">
					<i class="fa-solid fa-bars"></i>
				</div>
				<h2>
					<a href="index.html">THE  STATIONARY  HUB </a>
				</h2>
			</div>
			<div class="navMid">
				<a href="index.html">
					<div class="navitem">Home</div>
				</a> <a href="product.html">
					<div class="navitem">Shop</div>
				</a> <a href="blog.html">
					<div class="navitem">Blog</div>
				</a> <a href="contact.html">
					<div class="navitem">Contact</div>
				</a>
			</div>
			<div class="navRight">
				<div class="search">
					<i class="fa-solid fa-magnifying-glass"></i><input type="text"
						id="navsearch" placeholder="search" />
				</div>
				<div class="cart">
					<h4 id="navprice">$0</h4>
					<a class="icon" href="auth/Login.html"> <i
						class="fa-solid nav-ic fa-bag-shopping"></i>
					</a>
				</div>
			</div>
		</nav>
		<div class="Landing-Screen">
			<div class="Backside-card-body">
				<div class="Backside-card">
					<div class="Backside-card-Left cursor">
						<h5 id="pagelocation">THE  STATIONARY  HUB</h5>
					</div>
					<div class="Backside-card-Mid cursor">
						<h1>CHECKOUT PAGE</h1>
					</div>
					<div class="Backside-card-Right">
						<div class="nextproduct"></div>
					</div>
				</div>
			</div>
	          <div class="main-body">
				<div class="card-body">
					<div class="card">
						<div class="checkout-product-cont">
			     <h2>PRODUCTS</h2>
							<div class="checkout-product-box">
	       <%
	       List<OrderItems>list=(ArrayList<OrderItems>)request.getAttribute("items"); 
	       
	       OrderItemsDao oid=new OrderItemsDao();
	       for(OrderItems orderItem:list){
	       %>
	        				
								<div class="checkout-product" id="">
									<img src="http://weknowyourdreams.com/images/pencil/pencil-04.jpg" alt="" />
									<%
									String name=oid.findOneByProductId(orderItem.getProduct_id()).getProduct_name();
									%>
									<h2><%out.print(name);%></h2>
									
									<div class="product-size">
										<h2><%out.print("QUANTITY "+orderItem.getOrderitem_quantity()); %></h2>
									</div>

									<div class="product-price">
										<i class="fa-solid fa-indian-rupee-sign"></i>
										<h2><%out.print(orderItem.getOrderitem_price());%></h2>
									</div>
									<div class="delivery-status">
										<h3>Delivery Status</h3>
										<div class="status-cont"></div>
								    </div>
								</div>
						
	           
	     <%
	      }
	    %>
	    	</div>
						
	    </div>
					</div>
				</div>
			</div>
		</div>
			
		<div class="newslatter">
			<h1>NEWSLATTER</h1>
			<h4>Get update from your favorite products</h4>
			<form action="/newsemail" method="post">
				<input type="text" placeholder="enter your email" />
				<button type="submit">Send</button>
			</form>
		</div>
		<footer class="Footer" id="footer">
			<div class="footer-info">
				<h2>MUHAFIZ.</h2>
				<p>There are many variations of passages of Lorem Ipsum
					available, but the majority have suffered alteration in some form,
					by injected humour, or randomised words which don’t look even
					slightly believable.</p>
				<div class="social-icon">
					<a href=""> <i style="color: #3b5999"
						class="fa-brands fa-facebook-square"></i>
					</a> <a href=""> <i style="color: #e4405f"
						class="fa-brands fa-instagram-square"></i>
					</a> <a href=""> <i style="color: #55acee"
						class="fa-brands fa-twitter-square"></i>
					</a> <a href=""> <i style="color: #e60023"
						class="fa-brands fa-pinterest-square"></i>
					</a>
				</div>
			</div>
			<div class="Usefull-Links">
				<h2>Usefull Links</h2>
				<ul>
					<li><a href="/"> Home </a></li>
					<li><a href="/cart/usercart"> Cart </a></li>
					<li><a href="/product?category=Men"> Man Fashion </a></li>
					<li><a href="/product?category=Women"> Woman Fashion </a></li>
					<li><a href="/product?category=Accessories"> Accessories </a>
					</li>
					<li><a href="/product?category=Accessories"> My Account </a></li>
					<li><a href="/product?category=Accessories"> Order
							Tracking </a></li>
					<li><a href="/product?category=Accessories"> Wishlist </a></li>
					<li><a href="/product?category=Accessories"> Wishlist </a></li>
					<li><a href="/product?category=Accessories"> Terms </a></li>
				</ul>
			</div>
			<div class="Contact">
				<h2>Contact</h2>
				<div>
					<i class="fa-solid fa-location-pin"></i> 622 Dixie Path , South
					Tobinchester 98336
				</div>
				<div>
					<i class="fa-solid fa-phone"></i>+91 7869073804
				</div>
				<div>
					<i class="fa-solid fa-at"></i>Muhafiz.ahmed.sa@gmail.com
				</div>
				<img src="https://i.ibb.co/Qfvn4z6/payment.png" />
			</div>
		</footer>
	</div>
	<script>
		let profile = document.querySelector(".profile-cont")
		let onof = document.querySelector("#profile-cont-off")
		profile.addEventListener("click", function() {
			profile.classList.toggle("profile-active");
		});
		document.querySelector("#profile-cont-off").addEventListener("click",
				function() {
					profile.classList.toggle("profile-active");
				});
	</script>
</body>
</html>
