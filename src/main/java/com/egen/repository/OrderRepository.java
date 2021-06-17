package com.egen.repository;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.egen.model.Order;

@Repository
public class OrderRepository {
	
	public List<Order> getAllOrders() {
		return new ArrayList<Order>();
	}

    public Order getOrderById(String orderId) {
    	return null;
    }

    public List<Order> getAllOrdersWithinInterval(ZonedDateTime startTime, ZonedDateTime endTime) {
    	return new ArrayList<Order>();
    }

    public List<Order> top10OrdersWithHighestDollarAmountInZip(String zip) {
    	return new ArrayList<Order>();
    }

    public Order placeOrder(Order order) {
    	return null;
    }

    public Order cancelOrder(String id) {
    	return null;
    }

    public Order updateOrder(String orderId, Order order) {
    	return null;
    }

}
