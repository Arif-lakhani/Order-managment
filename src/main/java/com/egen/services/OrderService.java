package com.egen.services;


import com.egen.model.enums.Orders;

import java.sql.Timestamp;
import java.util.List;

public interface OrderService {
    List<Orders> getAllOrders();
    Orders getOrderById(String id);
    List<Orders> getAllOrdersWithInInterval(Timestamp startTime, Timestamp endTime);
    List<Orders> top10OrdersWithHighestDollarAmountInZip(String zip);
    Orders placeOrder(Orders orders);
    void cancelOrder(String id);
    Orders updateOrder( String id, Orders order);

}
