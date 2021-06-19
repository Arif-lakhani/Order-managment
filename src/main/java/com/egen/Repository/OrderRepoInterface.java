package com.egen.Repository;

import com.egen.model.Order;
import com.egen.model.OrderStatus;

import java.time.ZonedDateTime;
import java.util.List;

public interface OrderRepoInterface {

    List<Order> getAllOrders();

    Order getOrderById(String id);

    List<Order> getOrdersWithTimeInterval(ZonedDateTime startTime, ZonedDateTime endTime);

    List<Order> top10OrdersWithHighestDollarAmountInZip(String zip);

    Order addOrder(Order order);

    OrderStatus cancelOrder(String id);

    OrderStatus updateOrder(String id, Order order);

}
