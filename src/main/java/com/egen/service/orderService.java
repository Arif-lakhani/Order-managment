package com.egen.service;

import com.egen.model.entity.Order;

import java.time.ZonedDateTime;
import java.util.List;

public interface orderService
{
    List<Order> getAllOrders();
    List<Order> getOrderById(String id);
    List<Order> getAllOrdersWithInterval(ZonedDateTime startTime, ZonedDateTime endTime);
    List<Order> top100OrdersWithHighestDollarAmountInZip(String zip);
    Order placeOrder(Order order);
    Order cancelOrder(Order order);
    Order updateOrder(Order order);
}
