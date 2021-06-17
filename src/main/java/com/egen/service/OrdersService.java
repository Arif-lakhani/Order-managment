package com.egen.service;

import com.egen.model.Orders;
import com.egen.util.InputData;

import java.sql.Timestamp;
import java.util.List;

public interface OrdersService {
    List<Orders> findAll();
    Orders findOne(Long id);
    List<Orders> findWithinInterval(Timestamp startTime, Timestamp endTime);
    List<Orders> findTop10OrdersWithHighestDollarAmountInZip(String zip);
    Orders createOrder(InputData inputData);
    Orders cancelOrder(Orders orders,Long id);
    Orders updateOrder(Long id);
}
