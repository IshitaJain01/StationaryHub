package com.inventory.model;

import java.util.Objects;

public class User {
	private int user_id;
	private String user_firstname;
	private String user_lastname;
	private String user_email;
	private long user_contact;
	private String user_address;
	private String user_password;
	private String user_status;
	
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


   

	public User(String user_firstname, String user_lastname, String user_email, long user_contact, String user_address,
			String user_password,String user_status) {
		super();
		this.user_firstname = user_firstname;
		this.user_lastname = user_lastname;
		this.user_email = user_email;
		this.user_contact = user_contact;
		this.user_address = user_address;
		this.user_password = user_password;
		this.user_status = user_status;
	}




	public User(int user_id, String user_firstname, String user_lastname, String user_email, long user_contact,
			String user_address, String user_password,String user_status) {
		super();
		this.user_id = user_id;
		this.user_firstname = user_firstname;
		this.user_lastname = user_lastname;
		this.user_email = user_email;
		this.user_contact = user_contact;
		this.user_address = user_address;
		this.user_password = user_password;
		this.user_status = user_status;
	}




	



	public int getUser_id() {
		return user_id;
	}




	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}




	public String getUser_firstname() {
		return user_firstname;
	}




	public void setUser_firstname(String user_firstname) {
		this.user_firstname = user_firstname;
	}




	public String getUser_lastname() {
		return user_lastname;
	}




	public void setUser_lastname(String user_lastname) {
		this.user_lastname = user_lastname;
	}




	public String getUser_email() {
		return user_email;
	}




	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}




	public long getUser_contact() {
		return user_contact;
	}




	public void setUser_contact(long user_contact) {
		this.user_contact = user_contact;
	}




	public String getUser_address() {
		return user_address;
	}




	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}




	public String getUser_password() {
		return user_password;
	}




	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
   
	
	public String getUser_status() {
		return user_status;
	}
	 public void setUser_status(String user_status) {
		 this.user_status= user_status;
	 }



	




	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_firstname=" + user_firstname + ", user_lastname=" + user_lastname
				+ ", user_email=" + user_email + ", user_contact=" + user_contact + ", user_address=" + user_address
				+ ", user_password=" + user_password + ", user_status=" + user_status + "]";
	}




	@Override
	public int hashCode() {
		return Objects.hash(user_id);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return user_id == other.user_id;
	}

	
 
	
	}
	
	
	


