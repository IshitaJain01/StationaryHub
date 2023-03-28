package com.inventory.model;

import java.time.LocalDate;
import java.util.Objects;

public class Orders {
	private int order_id;
	private int user_id;
	private int order_quantity;
	private int order_totalPrice;
	private LocalDate order_date;
	private String order_status;

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Orders(int user_id, int order_quantity, int order_totalPrice, LocalDate order_date, String order_status) {
		super();
		this.user_id = user_id;
		this.order_quantity = order_quantity;
		this.order_totalPrice = order_totalPrice;
		this.order_date = order_date;
		this.order_status = order_status;
	}

	public Orders(int order_id, int user_id, int order_quantity, int order_totalPrice, LocalDate order_date,
			String order_status) {
		super();
		this.order_id = order_id;
		this.user_id = user_id;
		this.order_quantity = order_quantity;
		this.order_totalPrice = order_totalPrice;
		this.order_date = order_date;
		this.order_status = order_status;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getOrder_quantity() {
		return order_quantity;
	}

	public void setOrder_quantity(int order_quantity) {
		this.order_quantity = order_quantity;
	}

	public int getOrder_totalPrice() {
		return order_totalPrice;
	}

	public void setOrder_totalPrice(int order_totalPrice) {
		this.order_totalPrice = order_totalPrice;
	}

	public LocalDate getOrder_date() {
		return order_date;
	}

	public void setOrder_date(LocalDate order_date) {
		this.order_date = order_date;
	}

	@Override
	public int hashCode() {
		return Objects.hash(order_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Orders other = (Orders) obj;
		return order_id == other.order_id;
	}

	public String getOrder_status() {
		return order_status;
	}

	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}

	@Override
	public String toString() {
		return "Orders [order_id=" + order_id + ", user_id=" + user_id + ", order_quantity=" + order_quantity
				+ ", order_totalPrice=" + order_totalPrice + ", order_date=" + order_date + ", order_status="
				+ order_status + "]";
	}

}
