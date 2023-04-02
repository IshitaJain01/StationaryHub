<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  
<!-- Mirrored from localhost:3000/ by HTTrack Website Copier/3.x [XR&CO'2014], Fri, 24 Mar 2023 09:31:42 GMT -->
<!-- Added by HTTrack --><meta http-equiv="content-type" content="text/html;charset=utf-8" /><!-- /Added by HTTrack -->
<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="stylesheets/LandingPage.css" />

  <!-- Link Swiper's CSS -->
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/swiper@9/swiper-bundle.min.css" />

    <link rel="stylesheet" href=".//stylesheets//index.css" />

    <title>The Stationary Hub</title>
  </head>
  <body class="flexCenter">
    <i class="on-off fa-solid fa-toggle-off"></i>

    <!-- side nav bar -->
    <div class="profile-cont">
    <div class="cross">
      <i class="fa-solid fa-xmark"></i>
    </div>
    <div class="profile-box">
<h2>please log in</h2>
  </div>

    <div class="navigation">
<div>
<a href="profile.jsp" class="item">
<i class="fa-solid fa-user"></i><h5>profile</h5>
</a>
</div>
<div>
<a class="item" href="index.html">
  <i class="fa-solid fa-house"></i><h5>Home Page</h5>
</a>
</div>
<div>
<a class="item" href="auth/Login.html">
  <i class="fa-solid fa-bag-shopping"></i></i><h5>My Cart</h5>
</a>
</div>
<div>
<a class="item" href="auth/Login.html">
  <i class="fa-solid fa-heart"></i><h5>favorite</h5>
</a>
</div>
<div>
<a class="item" href="user/order.json">
  <i class="fa-solid fa-clipboard-list"></i></i><h5>Orders</h5>
</a>
</div>
<div>
<a class="item" href="user/notification.html">
  <i class="fa-solid fa-bell"></i><h5>Notifications</h5>
</a>
</div>
<hr>
<div>

    <a class="item" href="login.jsp">
      <i class="fa-solid fa-arrow-right-from-bracket"></i><h5>Sign in</h5>
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
    </a>
    <a href="product.html">
      <div class="navitem">Shop</div>
    </a>
    <a href="blog.html">
      <div class="navitem">Blog</div>
    </a>
    <a href="contact.html">
      <div class="navitem">Contact</div>
    </a>
  </div>
  <div class="navRight">
    <div class="search">
      <i class="fa-solid fa-magnifying-glass"></i
      ><input type="text" id="navsearch" placeholder="search" />
    </div>
    <div class="cart">
      <h4 id="navprice">$0</h4>
      <a class="icon" href="auth/Login.html">
        
        <i class="fa-solid nav-ic fa-bag-shopping"></i>
      </a>
    </div>
  </div>
</nav>
<!-- <script>
  let nav = document.querySelector(".navMid").children;
  if (location.pathname === "index.html") {
    nav[0].style.color = "green";
  } else if (location.pathname === "/product") {
    nav[1].style.color = "green";
  }
  document.getElementById("navsearch").addEventListener("keyup", function (e) {
    if (window.location.pathname !== "/product") {
      window.location.replace("product.html");
    }
  });
</script> -->

      <div class="Landing-Screen">
        <div class="Backside-card-body">
          <div class="Backside-card">
            <div class="Backside-card-Left cursor">
              <h5 id="pagelocation">YOUR CHOICE</h5>
            </div>
            <div class="Backside-card-Mid cursor">
              <h1>YOUR CHOICE</h1>
            </div>
            <div class="Backside-card-Right">
              <div class="nextproduct">
                <h4 class="cursor">Next Product</h4>
                <div class="arrow"></div>
              </div>
            </div>
          </div>
        </div>
        <div class="main-body">
          <a class="scroll-to-down">
            <div class="scroll-body cursor">
              <i class="fa-solid fa-arrow-left-long"></i>
              <h5>Scroll To Down</h5>
            </div>
          </a>
          <div class="card-body">
            <div class="card">
              <div class="swiper mySwiper">
                <div class="swiper-wrapper">
                  
                  <div class="swiper-slide swiper-slide1">
                    <div class="product-desc">
                      <a class="icon cursor" href="auth/Login.html">
                        <i class="fa-solid fa-heart"></i>
                      </a>
                      <h1>Kurta</h1>
                      <h5>Diaddl Color: Black, Case Shape: Round, Dial Glass Material: Mineral</h5>

                      <p>Women,kurta</p>
                      <div class="price">
                        <h2>PRICE :</h2>
                        <h2>Rs. 1255</h2>
                      </div>
                      <a href="product/singleproduct0818.html?id=62cc7ac1caf52635f99f4e6e">
                        <button class="cursor">
                          view <i class="fa-solid fa-expand"></i>
                        </button>
                      </a>
                    </div>
                    <div class="product-img cursor">
                      <img src="images/uploads/1657567924011yourchoice4504369700095896women3.jpg" alt="" />
                    </div>
                  </div>
                  
                  <div class="swiper-slide swiper-slide1">
                    <div class="product-desc">
                      <a class="icon cursor" href="auth/Login.html">
                        <i class="fa-solid fa-heart"></i>
                      </a>
                      <h1>Sunglass</h1>
                      <h5></h5>

                      <p>Accessories</p>
                      <div class="price">
                        <h2>PRICE :</h2>
                        <h2>Rs. 200</h2>
                      </div>
                      <a href="product/singleproduct0deb.html?id=62cbde36e76dfba6233d9b3c">
                        <button class="cursor">
                          view <i class="fa-solid fa-expand"></i>
                        </button>
                      </a>
                    </div>
                    <div class="product-img cursor">
                      <img src="images/uploads/1657527858415yourchoice8826970721994936sunglasspng4.jpg" alt="" />
                    </div>
                  </div>
                  
                  <div class="swiper-slide swiper-slide1">
                    <div class="product-desc">
                      <a class="icon cursor" href="auth/Login.html">
                        <i class="fa-solid fa-heart"></i>
                      </a>
                      <h1>Tshirt</h1>
                      <h5>, is a style of fabric shirt named after the T shape of its body and sleeves. Traditionally, it has short sleeves and a round neckline</h5>

                      <p>Men,Tshirt</p>
                      <div class="price">
                        <h2>PRICE :</h2>
                        <h2>Rs. 399</h2>
                      </div>
                      <a href="product/singleproduct2785.html?id=62cc6079245ede6f099cfa68">
                        <button class="cursor">
                          view <i class="fa-solid fa-expand"></i>
                        </button>
                      </a>
                    </div>
                    <div class="product-img cursor">
                      <img src="images/uploads/1657561202963yourchoice9229602196134266tshirt4.webp" alt="" />
                    </div>
                  </div>
                  
                </div>
              </div>
              <div class="swiper-button-next cursor">
                <i class="fa-solid fa-arrow-right-long"></i>
              </div>
              <div class="swiper-button-prev cursor">
                <i class="fa-solid fa-arrow-left-long"></i>
              </div>
              <div class="swiper-pagination"></div>
            </div>
          </div>
          <div class="social-button-body">
            <div class="social-button cursor">
              <h5>follow</h5>
              <a href="#">
                <i class="fa-brands fa-facebook-f"></i>
              </a>
              <a href="#">
                <i class="fa-brands fa-instagram"></i>
              </a>
              <a href="#">
                <i class="fa-brands fa-twitter"></i>
              </a>
            </div>
          </div>
        </div>
      </div>
      <div class="CATEGORY">
        <h1>CATEGORY</h1>
        <div class="cat-container">
          <div class="cat-container-box-1 swiper mySwiper2">
            <div class="swiper-wrapper">
              

              <a
                class="swiper-slide swiper-slide2"
                href="productde8d.html?category=Men"
              >
                <div class="cat-info">
                  <h1>MENS</h1>
                  <button>Shop</button>
                </div>
                <img src="images/uploads/1657561202963yourchoice9229602196134266tshirt4.webp" />
              </a>
              
            </div>
          </div>
          <div class="cat-container-box-1 swiper mySwiper2">
            <div class="swiper-wrapper">
              
              <a
                class="swiper-slide swiper-slide2"
                href="product995e.html?category=Women"
              >
                <div class="cat-info">
                  <h1>WOMENS</h1>
                  <button>Shop</button>
                </div>
                <img src="images/uploads/1657567924011yourchoice4504369700095896women3.jpg" />
              </a>
              
            </div>
          </div>
          <div class="cat-container-box-1 swiper mySwiper2">
            <div class="swiper-wrapper">
              
              <a
                class="swiper-slide swiper-slide2"
                href="product508b.html?category=Accessories"
              >
                <div class="cat-info">
                  <h1>Accessories</h1>
                  <button>Shop</button>
                </div>
                <img src="images/uploads/1657527858415yourchoice8826970721994936sunglasspng4.jpg" />
              </a>
              
            </div>
          </div>
        </div>
      </div>
      <div class="Top-Product">
        <h1>NEW PRODUCTS</h1>

        <div class="swiper mySwiper3">
          <div class="swiper-wrapper">
            
            <div class="swiper-slide swiper-slide3 product-card">
              <div class="nav">
                <a class="icon" href="auth/Login.html">
                  <i class="fa-solid fa-heart"></i>
                </a>
                <div class="icon">
                  <i class="fa-solid nav-ic fa-bag-shopping"></i>
                </div>
              </div>
              <div class="product">
                <div
                  class="product-background"
                  style="
                    background: rgb(
                      243,
                      172,
                      128
                    );
                  "
                >
                  <div class="product-background-circle"></div>
                </div>
                <div class="product-image">
                  <img src="images/uploads/1657567924010yourchoice3052189983817770womenpng.jpg" alt="" />
                </div>
              </div>
              <div class="product-info">
                <h3>Kurta</h3>
                <h4>$1255</h4>
                <a href="product/singleproduct0818.html?id=62cc7ac1caf52635f99f4e6e"
                  ><button>view <i class="fa-solid fa-expand"></i></button
                ></a>
              </div>
            </div>
            
            <div class="swiper-slide swiper-slide3 product-card">
              <div class="nav">
                <a class="icon" href="auth/Login.html">
                  <i class="fa-solid fa-heart"></i>
                </a>
                <div class="icon">
                  <i class="fa-solid nav-ic fa-bag-shopping"></i>
                </div>
              </div>
              <div class="product">
                <div
                  class="product-background"
                  style="
                    background: rgb(
                      58,
                      176,
                      98
                    );
                  "
                >
                  <div class="product-background-circle"></div>
                </div>
                <div class="product-image">
                  <img src="images/uploads/1657561202962yourchoice4744228777935655tshirt1.jpg" alt="" />
                </div>
              </div>
              <div class="product-info">
                <h3>Tshirt</h3>
                <h4>$399</h4>
                <a href="product/singleproduct2785.html?id=62cc6079245ede6f099cfa68"
                  ><button>view <i class="fa-solid fa-expand"></i></button
                ></a>
              </div>
            </div>
            
            <div class="swiper-slide swiper-slide3 product-card">
              <div class="nav">
                <a class="icon" href="auth/Login.html">
                  <i class="fa-solid fa-heart"></i>
                </a>
                <div class="icon">
                  <i class="fa-solid nav-ic fa-bag-shopping"></i>
                </div>
              </div>
              <div class="product">
                <div
                  class="product-background"
                  style="
                    background: rgb(
                      138,
                      145,
                      244
                    );
                  "
                >
                  <div class="product-background-circle"></div>
                </div>
                <div class="product-image">
                  <img src="images/uploads/1657527858413yourchoice6314888914517969sunglasspng.jpg" alt="" />
                </div>
              </div>
              <div class="product-info">
                <h3>Sunglass</h3>
                <h4>$200</h4>
                <a href="product/singleproduct0deb.html?id=62cbde36e76dfba6233d9b3c"
                  ><button>view <i class="fa-solid fa-expand"></i></button
                ></a>
              </div>
            </div>
            
          </div>
          <div class="swiper-pagination"></div>
        </div>
      </div>
      <div class="newslatter">
        <h1>NEWSLATTER</h1>
        <h4>Get update from your favorite products</h4>
        <form action="http://localhost:3000/newsemail" method="post">
          <input type="text" placeholder="enter your email" />
          <button type="submit">Send</button>
        </form>
      </div>
      <footer class="Footer" id="footer">
  <div class="footer-info">
    <h2>MUHAFIZ.</h2>
    <p>
      There are many variations of passages of Lorem Ipsum available, but the
      majority have suffered alteration in some form, by injected humour, or
      randomised words which don’t look even slightly believable.
    </p>
    <div class="social-icon">
      <a href="#">
        <i style="color: #3b5999" class="fa-brands fa-facebook-square"></i>
      </a>
      <a href="#">
        <i style="color: #e4405f" class="fa-brands fa-instagram-square"></i>
      </a>
      <a href="#">
        <i style="color: #55acee" class="fa-brands fa-twitter-square"></i>
      </a>
      <a href="#">
        <i style="color: #e60023" class="fa-brands fa-pinterest-square"></i>
      </a>
    </div>
  </div>
  <div class="Usefull-Links">
    <h2>Usefull Links</h2>
    <ul>
      <li>
        <a href="index.html"> Home </a>
      </li>
      <li>
        <a href="auth/Login.html"> Cart </a>
      </li>
      <li>
        <a href="productde8d.html?category=Men"> Man Fashion </a>
      </li>
      <li>
        <a href="product995e.html?category=Women"> Woman Fashion </a>
      </li>
      <li>
        <a href="product508b.html?category=Accessories"> Accessories </a>
      </li>
      <li>
        <a href="product508b.html?category=Accessories"> My Account </a>
      </li>
      <li>
        <a href="product508b.html?category=Accessories"> Order Tracking </a>
      </li>
      <li>
        <a href="product508b.html?category=Accessories"> Wishlist </a>
      </li>
      <li>
        <a href="product508b.html?category=Accessories"> Wishlist </a>
      </li>
      <li>
        <a href="product508b.html?category=Accessories"> Terms </a>
      </li>
    </ul>
  </div>
  <div class="Contact">
    <h2>Contact</h2>
    <div>
      <i class="fa-solid fa-location-pin"></i>
      622 Dixie Path , South Tobinchester 98336
    </div>
    <div><i class="fa-solid fa-phone"></i>+91 7869073804</div>
    <div><i class="fa-solid fa-at"></i>Muhafiz.ahmed.sa@gmail.com</div>
    <img src="../i.ibb.co/Qfvn4z6/payment.html" />
  </div>
</footer>

    </div>
    <!-- Initialize Swiper -->
    <script></script>
  </body>

  <script src="https://kit.fontawesome.com/d19408b3b1.js" crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/swiper@9/swiper-bundle.min.js"></script>
  <script>
    let profile = document.querySelector(".profile-cont");
let profileoff = document.querySelector("#profile-cont-off");
let swipeDown = document.querySelector(".scroll-to-down");

profile.addEventListener("click", function () {
  profile.classList.toggle("profile-active");
});

profileoff.addEventListener("click", function () {
  profile.classList.toggle("profile-active");
});
swipeDown.addEventListener("click", () => {
  window.scrollTo(0, document.body.scrollHeight);
});

// swiper code
var swiper = new Swiper(".mySwiper", {
  navigation: {
    nextEl: ".swiper-button-next",
    prevEl: ".swiper-button-prev",
  },
  pagination: {
    el: ".swiper-pagination",
    dynamicBullets: true,
  },
  allowTouchMove: false,
  loop: true,
  autoplay: {
    delay: 1500,
    disableOnInteraction: false,
  },
});

var swiper2 = new Swiper(".mySwiper2", {
  effect: "flip",
  grabCursor: false,
  loop: true,
  freeMode: true,
  autoplay: {
    delay: 1500,
    disableOnInteraction: false,
  },
});
var swiper3 = new Swiper(".mySwiper3", {
  slidesPerView: 4,
  spaceBetween: 30,
  pagination: {
    el: ".swiper-pagination",
    clickable: true,
  },
  loop: true,
  loopFillGroupWithBlank: true,
  freeMode: true,
  autoplay: {
    delay: 1500,
    disableOnInteraction: false,
  },
});
  </script>

</html>
    