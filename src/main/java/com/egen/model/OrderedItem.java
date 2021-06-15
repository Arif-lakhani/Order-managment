package com.egen.model;

import javax.persistence.Entity;

@Entity
public class OrderedItem {
	
	String order_item_name;
	String order_item_qty;
	Integer order_subtotal;
	Integer order_tax;
	Integer order_shipping_charges;
	Integer order_total;
	String paymen_method_id;
	
	public OrderedItem() {
		
	}
	public OrderedItem(String order_item_name, String order_item_qty, Integer order_subtotal, Integer order_tax,
			Integer order_shipping_charges, Integer order_total, String paymen_method_id) {
		super();
		this.order_item_name = order_item_name;
		this.order_item_qty = order_item_qty;
		this.order_subtotal = order_subtotal;
		this.order_tax = order_tax;
		this.order_shipping_charges = order_shipping_charges;
		this.order_total = order_total;
		this.paymen_method_id = paymen_method_id;
	}
	public String getPaymen_method_id() {
		return paymen_method_id;
	}
	public void setPaymen_method_id(String paymen_method_id) {
		this.paymen_method_id = paymen_method_id;
	}
	public String getOrder_item_name() {
		return order_item_name;
	}
	public void setOrder_item_name(String order_item_name) {
		this.order_item_name = order_item_name;
	}
	public String getOrder_item_qty() {
		return order_item_qty;
	}
	public void setOrder_item_qty(String order_item_qty) {
		this.order_item_qty = order_item_qty;
	}
	public Integer getOrder_subtotal() {
		return order_subtotal;
	}
	public void setOrder_subtotal(Integer order_subtotal) {
		this.order_subtotal = order_subtotal;
	}
	public Integer getOrder_tax() {
		return order_tax;
	}
	public void setOrder_tax(Integer order_tax) {
		this.order_tax = order_tax;
	}
	public Integer getOrder_shipping_charges() {
		return order_shipping_charges;
	}
	public void setOrder_shipping_charges(Integer order_shipping_charges) {
		this.order_shipping_charges = order_shipping_charges;
	}
	public Integer getOrder_total() {
		return order_total;
	}
	public void setOrder_total(Integer order_total) {
		this.order_total = order_total;
	}
	
	
	

}
