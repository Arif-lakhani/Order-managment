package com.egen.model;

import javax.persistence.Entity;

@Entity
public class Address { //same can be used billing and shipping

	String order_shipping_addressline1;
	String order_shipping_addressline2;
	String order_shipping_city;
	String order_shipping_state;
    int order_shipping_zip;
    private String order_customer_id;
    public String getOrder_customer_id() {
		return order_customer_id;
	}
	public void setOrder_customer_id(String order_customer_id) {
		this.order_customer_id = order_customer_id;
	}
	public Address() {
    	
    }
	public Address(String order_shipping_addressline1, String order_shipping_addressline2,
			String order_shipping_city, String order_shipping_state, int order_shipping_zip) {
		super();
		this.order_shipping_addressline1 = order_shipping_addressline1;
		this.order_shipping_addressline2 = order_shipping_addressline2;
		this.order_shipping_city = order_shipping_city;
		this.order_shipping_state = order_shipping_state;
		this.order_shipping_zip = order_shipping_zip;
	}
	public String getOrder_shipping_addressline1() {
		return order_shipping_addressline1;
	}
	public void setOrder_shipping_addressline1(String order_shipping_addressline1) {
		this.order_shipping_addressline1 = order_shipping_addressline1;
	}
	public String getOrder_shipping_addressline2() {
		return order_shipping_addressline2;
	}
	public void setOrder_shipping_addressline2(String order_shipping_addressline2) {
		this.order_shipping_addressline2 = order_shipping_addressline2;
	}
	public String getOrder_shipping_city() {
		return order_shipping_city;
	}
	public void setOrder_shipping_city(String order_shipping_city) {
		this.order_shipping_city = order_shipping_city;
	}
	public String getOrder_shipping_state() {
		return order_shipping_state;
	}
	public void setOrder_shipping_state(String order_shipping_state) {
		this.order_shipping_state = order_shipping_state;
	}
	public int getOrder_shipping_zip() {
		return order_shipping_zip;
	}
	public void setOrder_shipping_zip(int order_shipping_zip) {
		this.order_shipping_zip = order_shipping_zip;
	}
}
