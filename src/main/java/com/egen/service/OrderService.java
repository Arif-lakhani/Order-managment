package com.egen.service;

import com.egen.model.Order;
import com.egen.repository.OrderRepository;

import java.time.ZonedDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	
	@Autowired
	OrderRepository orderRepository;
	
	
	public List<Order> getAllOrder() {
		return orderRepository.getAllOrders();
	}
	
	public Order getOrderById(String id) {
		return orderRepository.getOrderById(id);
	}
	
	public List<Order> getAllOrdersWithinInterval(ZonedDateTime startTime, ZonedDateTime endTime) {
		return orderRepository.getAllOrdersWithinInterval(startTime, endTime);
	}

    public List<Order> top10OrdersWithHighestDollarAmountInZip(String zip) {
    	return orderRepository.top10OrdersWithHighestDollarAmountInZip(zip);
    }

    public Order placeOrder(Order order) {
    	return orderRepository.placeOrder(order);
    }

    public Order cancelOrder(String id) {
    	return orderRepository.cancelOrder(id);
    }

    public Order updateOrder(String orderId, Order order) {
    	return orderRepository.updateOrder(orderId, order);
    }
}
