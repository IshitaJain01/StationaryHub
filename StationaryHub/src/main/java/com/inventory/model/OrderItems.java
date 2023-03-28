package com.inventory.model;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Objects;

public class OrderItems {
	private int orderItem_id;
	private int orderitem_quantity;
	private int orderitem_price;
	private int user_id;
	private int rating;
	private int product_id;
	private Date created_at;
	private String status;

	public OrderItems() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderItems(int orderitem_quantity, int orderitem_price, int user_id, int rating, int product_id,
			Date created_at, String status) {
		super();
		this.orderitem_quantity = orderitem_quantity;
		this.orderitem_price = orderitem_price;
		this.user_id = user_id;
		this.rating = rating;
		this.product_id = product_id;
		this.created_at = created_at;
		this.status = status;
	}

	public OrderItems(int orderItem_id, int orderitem_quantity, int orderitem_price, int user_id, int rating,
			int product_id, Date created_at, String status) {
		super();
		this.orderItem_id = orderItem_id;
		this.orderitem_quantity = orderitem_quantity;
		this.orderitem_price = orderitem_price;
		this.user_id = user_id;
		this.rating = rating;
		this.product_id = product_id;
		this.created_at = created_at;
		this.status = status;
	}

	public int getOrderItem_id() {
		return orderItem_id;
	}

	public void setOrderItem_id(int orderItem_id) {
		this.orderItem_id = orderItem_id;
	}

	public int getOrderitem_quantity() {
		return orderitem_quantity;
	}

	public void setOrderitem_quantity(int orderitem_quantity) {
		this.orderitem_quantity = orderitem_quantity;
	}

	public int getOrderitem_price() {
		return orderitem_price;
	}

	public void setOrderitem_price(int orderitem_price) {
		this.orderitem_price = orderitem_price;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		return Objects.hash(orderItem_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItems other = (OrderItems) obj;
		return orderItem_id == other.orderItem_id;
	}

	@Override
	public String toString() {
		return "OrderItems [orderItem_id=" + orderItem_id + ", orderitem_quantity=" + orderitem_quantity
				+ ", orderitem_price=" + orderitem_price + ", user_id=" + user_id + ", rating=" + rating
				+ ", product_id=" + product_id + ", created_at=" + created_at + ", status=" + status + "]";
	}
    
}
