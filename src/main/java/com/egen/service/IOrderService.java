package com.egen.service;

import com.egen.model.Order;

import java.time.ZonedDateTime;
import java.util.List;

public interface IOrderService {

    List<Order> getAllOrders();
    Order getOrderById(String id);
    List<Order> getAllOrdersWithInInterval(ZonedDateTime startTime, ZonedDateTime endTime);
    List<Order> top10OrdersWithHighestDollarAmountInZip(String zip);
    Order placeOrder(Order order);
    Order cancelOrder(Order order);
    Order updateOrder(Order order);
}
