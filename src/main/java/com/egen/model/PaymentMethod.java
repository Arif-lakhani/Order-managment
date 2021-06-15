package com.egen.model;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class PaymentMethod {
	
	private int paymen_method_id;
	private int payment_date;
	private int payment_total;
	private Date order_payment_date;
	
	public int getPaymen_method_id() {
		return paymen_method_id;
	}
	public void setPaymen_method_id(int paymen_method_id) {
		this.paymen_method_id = paymen_method_id;
	}
	public int getPayment_date() {
		return payment_date;
	}
	public void setPayment_date(int payment_date) {
		this.payment_date = payment_date;
	}
	public int getPayment_total() {
		return payment_total;
	}
	public void setPayment_total(int payment_total) {
		this.payment_total = payment_total;
	}
	public Date getOrder_payment_date() {
		return order_payment_date;
	}
	public void setOrder_payment_date(Date order_payment_date) {
		this.order_payment_date = order_payment_date;
	}
	
	

	

}
