package com.egen.service;

import com.egen.model.Orders;

import java.sql.Timestamp;
import java.util.List;

public interface OrdersService {
    List<Orders> findAll();
    Orders findOne(Long id);
    List<Orders> findWithinInterval(Timestamp startTime, Timestamp endTime);
    List<Orders> findTop10OrdersWithHighestDollarAmountInZip(String zip);
    Orders createOrder(Orders orders);
    Orders cancelOrder(Orders orders,Long id);
    Orders updateOrder(Orders orders);
}
