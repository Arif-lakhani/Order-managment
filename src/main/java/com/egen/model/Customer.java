package com.egen.model;

import java.util.UUID;

import javax.persistence.Entity;

@Entity
public class Customer {
	
	String order_customer_id;
	String customer_first_name;
	String customer_last_name;
	Address address;
	String email;
	String mobile;
	public Customer() {
		
	}
	
	public Customer( String customer_first_name, String customer_last_name, Address address,
			String email, String mobile) {
		
		this.order_customer_id = UUID.randomUUID().toString();
		this.customer_first_name = customer_first_name;
		this.customer_last_name = customer_last_name;
		this.address = address;
		this.email = email;
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getOrder_customer_id() {
		return order_customer_id;
	}
	public void setOrder_customer_id(String order_customer_id) {
		this.order_customer_id = order_customer_id;
	}
	public String getCustomer_first_name() {
		return customer_first_name;
	}
	public void setCustomer_first_name(String customer_first_name) {
		this.customer_first_name = customer_first_name;
	}
	public String getCustomer_last_name() {
		return customer_last_name;
	}
	public void setCustomer_last_name(String customer_last_name) {
		this.customer_last_name = customer_last_name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	


}
