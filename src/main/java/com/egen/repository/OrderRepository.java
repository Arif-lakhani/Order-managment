package com.egen.repository;

import com.egen.model.Order;

import java.sql.Date;
import java.util.List;

public interface OrderRepository {
    List<Order> getAllOrders();
    Order getOrderById(String id);
    List<Order> getAllOrdersWithinInterval(Date startTime, Date endTime);
    List<Order> getTop10OrdersWithHighestDollarAmountInZip(String zip);
    Order placeOrder(Order order);
    void delete(Order order);
    Order update(Order order);
}
