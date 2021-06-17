package com.egen.repository;

import com.egen.model.Order;

import java.time.ZonedDateTime;
import java.util.List;

public interface OrderRepository {

    public List<Order> findAll();

    public Order findOne(String id);

    public List<Order> findAllOrderWithInInterval(ZonedDateTime startTime, ZonedDateTime EndTime);

    public List<Order> getTop10OrdersWithHighestDollarAmountInZip(String zip);

    public Order placeOrder(Order order);

    public Order updateOrder(Order order);

    public void cancelOrder(Order order);
}
