package com.inventory.model;

import java.sql.Blob;
import java.sql.Date;
import java.util.Objects;

public class Product extends User implements Comparable<Product>{
	private int product_id;
	private String product_name;
	private double product_price;
	private int product_quantity;
	private String product_category;
	private String image;
	private Date created_at;

	public Product() {
		super();
	}
	public Product(int product_id, String product_name, double product_price, int product_quantity,
			String product_category, String image,Date created_at) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_quantity = product_quantity;
		this.product_category = product_category;
		this.image = image;
		this.created_at=created_at;
	}
	public Product(int product_id, String product_name, double product_price, String image,
			Date created_at) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_price = product_price;
		this.image = image;
		this.created_at=created_at;
	}
	public Product( String product_name, double product_price, String image) {
		super();
//		this.product_id = product_id;
		this.product_name = product_name;
		this.product_price = product_price;
		this.image = image;
	}
	
	
	public Product(String product_name, double product_price, int product_quantity, String product_category,
			String image) {
		super();
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_quantity = product_quantity;
		this.product_category = product_category;
		this.image = image;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public double getProduct_price() {
		return product_price;
	}
	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}
	public int getProduct_quantity() {
		return product_quantity;
	}
	public void setProduct_quantity(int product_quantity) {
		this.product_quantity = product_quantity;
	}
	public String getProduct_category() {
		return product_category;
	}
	public void setProduct_category(String product_category) {
		this.product_category = product_category;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	
	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", product_name=" + product_name + ", product_price="
				+ product_price + ", product_quantity=" + product_quantity + ", product_category=" + product_category
				+ ", image=" + image + ", created_at=" + created_at + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(product_id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return product_id == other.product_id;
	}
	@Override
	public int compareTo(Product o) {
		return this.product_id = o.product_id;
		
	}
	


	

}
