package com.inventory.model;

import java.util.Objects;

public class Cart {
	private int CartItemId;
	private int Quantity;
	private int TotalPrice;
	private int ProductId;
	private String ProductName;
	private int UserId;
	public Cart() {
		super();
	}
	public Cart(int cartItemId, int quantity, int totalPrice, int productId, String productName, int userId) {
		super();
		CartItemId = cartItemId;
		Quantity = quantity;
		TotalPrice = totalPrice;
		ProductId = productId;
		ProductName = productName;
		UserId = userId;
	}
	public Cart(int quantity, int totalPrice, int productId, String productName, int userId) {
		super();
		Quantity = quantity;
		TotalPrice = totalPrice;
		ProductId = productId;
		ProductName = productName;
		UserId = userId;
	}
	public int getCartItemId() {
		return CartItemId;
	}
	public void setCartItemId(int cartItemId) {
		CartItemId = cartItemId;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public int getTotalPrice() {
		return TotalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		TotalPrice = totalPrice;
	}
	public int getProductId() {
		return ProductId;
	}
	public void setProductId(int productId) {
		ProductId = productId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	@Override
	public int hashCode() {
		return Objects.hash(CartItemId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cart other = (Cart) obj;
		return CartItemId == other.CartItemId;
	}
	@Override
	public String toString() {
		return "Cart [CartItemId=" + CartItemId + ", Quantity=" + Quantity + ", TotalPrice=" + TotalPrice
				+ ", ProductId=" + ProductId + ", ProductName=" + ProductName + ", UserId=" + UserId + "]";
	}
	
	
	
}