package com.egen.service;

import com.egen.model.Order;

import java.util.Date;
import java.util.List;

public interface OrderService {

    List<Order> getAllOrders();
    List<Order> getOrderById(String id);
    List<Order> getAllOrdersWithInInterval(Date startTime, Date endTime);
    List<Order> top10OrdersWithHighestDollarAmountInZip(String zip);
    Order placeOrder(Order order);
    Order cancelOrder(Order order, String id);
    Order updateOrder(Order order, String id);
}
