package com.egen.model;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;

import com.egen.enums.OrderStatus;


public class Order {
    
	private String orderId;
	
	private OrderStatus orderStatus;
	
	private String orderCustomerId;
	
	private List<String> orderItemIds;
	
	private double orderSubtotal;
	
	private double orderTax;
	
	private double orderShippingCharges;
	
	private double orderTotal;
	
	private List<String> orderPaymentIds;
	
	private String orderBillingId;
	
	private String orderShippingId;
	
	private ZonedDateTime orderCreatedOn;
	
	private ZonedDateTime orderModifiedOn;
	
	private ZonedDateTime orderCompletedOn;
	
	public Order(String id) {
		this.orderId = id;
	}

	public Order(OrderStatus orderStatus, String orderCustomerId, List<String> orderItemIds, double orderSubtotal,
			double orderTax, double orderShippingCharges, double orderTotal, List<String> orderPaymentIds,
			String orderBillingId, String orderShippingId, ZonedDateTime orderCreatedOn,
			ZonedDateTime orderModifiedOn, ZonedDateTime orderCompletedOn) {
		this.orderId = UUID.randomUUID().toString();
		this.orderStatus = orderStatus;
		this.orderCustomerId = orderCustomerId;
		this.orderItemIds = orderItemIds;
		this.orderSubtotal = orderSubtotal;
		this.orderTax = orderTax;
		this.orderShippingCharges = orderShippingCharges;
		this.orderTotal = orderTotal;
		this.orderPaymentIds = orderPaymentIds;
		this.orderBillingId = orderBillingId;
		this.orderShippingId = orderShippingId;
		this.orderCreatedOn = orderCreatedOn;
		this.orderModifiedOn = orderModifiedOn;
		this.orderCompletedOn = orderCompletedOn;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderCustomerId() {
		return orderCustomerId;
	}

	public void setOrderCustomerId(String orderCustomerId) {
		this.orderCustomerId = orderCustomerId;
	}

	public List<String> getOrderItemIds() {
		return orderItemIds;
	}

	public void setOrderItemIds(List<String> orderItemIds) {
		this.orderItemIds = orderItemIds;
	}

	public double getOrderSubtotal() {
		return orderSubtotal;
	}

	public void setOrderSubtotal(double orderSubtotal) {
		this.orderSubtotal = orderSubtotal;
	}

	public double getOrderTax() {
		return orderTax;
	}

	public void setOrderTax(double orderTax) {
		this.orderTax = orderTax;
	}

	public double getOrderShippingCharges() {
		return orderShippingCharges;
	}

	public void setOrderShippingCharges(double orderShippingCharges) {
		this.orderShippingCharges = orderShippingCharges;
	}

	public double getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(double orderTotal) {
		this.orderTotal = orderTotal;
	}

	public List<String> getOrderPaymentIds() {
		return orderPaymentIds;
	}

	public void setOrderPaymentIds(List<String> orderPaymentIds) {
		this.orderPaymentIds = orderPaymentIds;
	}

	public String getOrderBillingId() {
		return orderBillingId;
	}

	public void setOrderBillingId(String orderBillingId) {
		this.orderBillingId = orderBillingId;
	}

	public String getOrderShippingId() {
		return orderShippingId;
	}

	public void setOrderShippingId(String orderShippingId) {
		this.orderShippingId = orderShippingId;
	}

	public ZonedDateTime getOrderCreateDate() {
		return orderCreatedOn;
	}

	public void setOrderCreateDate(ZonedDateTime orderCreatedOn) {
		this.orderCreatedOn = orderCreatedOn;
	}

	public ZonedDateTime getOrderModifiedDate() {
		return orderModifiedOn;
	}

	public void setOrderModifiedDate(ZonedDateTime orderModifiedOn) {
		this.orderModifiedOn = orderModifiedOn;
	}

	public ZonedDateTime getOrderCompletedDate() {
		return orderCompletedOn;
	}

	public void setOrderCompletedDate(ZonedDateTime orderCompletedOn) {
		this.orderCompletedOn = orderCompletedOn;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderStatus=" + orderStatus + ", orderCustomerId=" + orderCustomerId
				+ ", orderItemIds=" + orderItemIds + ", orderSubtotal=" + orderSubtotal + ", orderTax=" + orderTax
				+ ", orderShippingCharges=" + orderShippingCharges + ", orderTotal=" + orderTotal + ", orderPaymentIds="
				+ orderPaymentIds + ", orderBillingId=" + orderBillingId + ", orderShippingId=" + orderShippingId
				+ ", orderCreatedOn=" + orderCreatedOn + ", orderModifiedOn=" + orderModifiedOn
				+ ", orderCompletedOn=" + orderCompletedOn + "]";
	}
	
}
