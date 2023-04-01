<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="com.inventory.model.*"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />




<!-- Link Swiper's CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/swiper@9/swiper-bundle.min.css" />

<link rel="stylesheet" href="./stylesheets/profile.css" />


<title>YourChoice</title>
</head>
<body>
	<%
	User user = (User) session.getAttribute("auth");
	%>
    
   <%@include file="message.jsp" %>
	<i class="on-off fa-solid fa-toggle-off"></i>
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
				<a class="item" href="user/order.json"> <i
					class="fa-solid fa-clipboard-list"></i></i>
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

	<div class="container">
		<nav>
			<div class="navLeft">
				<div class="icon" id="profile-cont-off">
					<i class="fa-solid fa-bars"></i>
				</div>
				<h2>
					<a href="index.html">YOUR CHOICE </a>
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
						<h5 id="pagelocation">YOUR CHOICE</h5>
					</div>
					<div class="Backside-card-Mid cursor">
						<h1>PROFILE</h1>
					</div>
					<div class="Backside-card-Right">
						<div class="nextproduct"></div>
					</div>
				</div>
			</div>
			<div class="main-body">
				<div class="card-body">
					<div class="card">
						<div class="setting-cont">

							<div class="setting">
								<div class="acc-setting">
									<i class="fa-solid fa-user"></i>
									<h2>Account setting</h2>
								</div>
								<div class="menu-item">
									<div class="item" onclick="showprofile()">
										<i class="fa-solid fa-user-gear"></i>
										<h4>profile information</h4>
									</div>

								</div>
							</div>
						</div>
						<div class="persnal-info-cont">
							<h2>PERSONAL INFORMATION</h2>
							<form class="persnal-info-box" action="User-Profile"
								method="post">
								<input type="text" placeholder="FIRST NAME"
									value="<%out.print(user.getUser_firstname());%>" name="fname" />
								<input type="text" placeholder="LAST NAME" name="lname"
									value="<%out.print(user.getUser_lastname());%>" /> 
								<input
									type="text" placeholder="EMAIL" name="email"
									value="<%out.print(user.getUser_email());%>" /> 
									<input
									type="number" placeholder="PHONE NO." name="phoneNo"
									value="<%out.print(user.getUser_contact());%>" />
									
									<input type="text" style="width:90%;" placeholder="ADDRESS"
									value="<%out.print(user.getUser_address());%>" name="address" />
                                    <input type="hidden" name="id" value="<%out.print(user.getUser_id());%>">
                                 
								<button type="submit">Update</button>
							</form>
						</div>


					</div>
				</div>
			</div>
		</div>


		<footer class="Footer" id="footer">
			<div class="footer-info">
				<h2>MUHAFIZ.</h2>
				<p>There are many variations of passages of Lorem Ipsum
					available, but the majority have suffered alteration in some form,
					by injected humour, or randomised words which don’t look even
					slightly believable.</p>
				<div class="social-icon">
					<a href="#"> <i style="color: #3b5999"
						class="fa-brands fa-facebook-square"></i>
					</a> <a href="#"> <i style="color: #e4405f"
						class="fa-brands fa-instagram-square"></i>
					</a> <a href="#"> <i style="color: #55acee"
						class="fa-brands fa-twitter-square"></i>
					</a> <a href="#"> <i style="color: #e60023"
						class="fa-brands fa-pinterest-square"></i>
					</a>
				</div>
			</div>
			<div class="Usefull-Links">
				<h2>Usefull Links</h2>
				<ul>
					<li><a href="index.html"> Home </a></li>
					<li><a href="auth/Login.html"> Cart </a></li>
					<li><a href="productde8d.html?category=Men"> Man Fashion </a>
					</li>
					<li><a href="product995e.html?category=Women"> Woman
							Fashion </a></li>
					<li><a href="product508b.html?category=Accessories">
							Accessories </a></li>
					<li><a href="product508b.html?category=Accessories"> My
							Account </a></li>
					<li><a href="product508b.html?category=Accessories"> Order
							Tracking </a></li>
					<li><a href="product508b.html?category=Accessories">
							Wishlist </a></li>
					<li><a href="product508b.html?category=Accessories">
							Wishlist </a></li>
					<li><a href="product508b.html?category=Accessories"> Terms
					</a></li>
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
				<img src="../i.ibb.co/Qfvn4z6/payment.html" />
			</div>
		</footer>
	</div>

</body>

<script src="https://kit.fontawesome.com/d19408b3b1.js"
	crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/swiper@9/swiper-bundle.min.js"></script>
<script>
    let profile = document.querySelector(".profile-cont");

    profile.addEventListener("click", function () {
      profile.classList.toggle("profile-active");
    });
    document
      .querySelector("#profile-cont-off")
      .addEventListener("click", function () {
        profile.classList.toggle("profile-active");
      });
    let profileCont = document.querySelector(".persnal-info-cont");
    let addressCont = document.querySelector(".address-info-cont");
    const showprofile = () => {
      addressCont.style.display = "none";
      profileCont.style.display = "flex";
    };
    const showaddress = () => {
      profileCont.style.display = "none";
      addressCont.style.display = "flex";
    };
  </script>


</html>
