<!DOCTYPE html>
<html>
<head>
	<title>My Orders</title>


	<script src="script.js"></script>
 <style type="text/css">
 

 </style>
</head>
<body>
	<header>
		<div class="logo">My Store</div>
		<nav>
			<ul>
				<li><a href="#">Home</a></li>
				<li><a href="#">Shop</a></li>
				<li><a href="#">About Us</a></li>
				<li><a href="#">Contact Us</a></li>
			</ul>
		</nav>
		<div class="cart">
			<a href="#">
				<i class="fa fa-shopping-cart"></i>
				<span class="cart-items">3</span>
			</a>
		</div>
	</header>
	<main>
		<section class="order-items">
			<div class="item">
				<img src="product1.jpg" alt="Product 1">
				<div class="details">
					<h2>Product 1</h2>
					<p>Quantity: 1</p>
					<p>Price: $10.00</p>
				</div>
			</div>
			<div class="item">
				<img src="product2.jpg" alt="Product 2">
				<div class="details">
					<h2>Product 2</h2>
					<p>Quantity: 2</p>
					<p>Price: $20.00</p>
				</div>
			</div>
		</section>
		<div class="total-price">
			<p>Total: $50.00</p>
		</div>
		<div class="buttons">
			<button class="checkout">Checkout</button>
			<button class="cancel">Cancel Order</button>
		</div>
	</main>
</body>
</html>