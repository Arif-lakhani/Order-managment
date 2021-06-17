package com.egen.services;


import com.egen.exception.OrderServiceException;
import com.egen.model.enums.Orders;
import com.egen.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<Orders> getAllOrders() {
        return orderRepository.getAllOrders();
    }

    @Override
    public Orders getOrderById(String id) {
        return orderRepository.getOrderById(id);
    }

    @Override
    public List<Orders> getAllOrdersWithInInterval(Timestamp startTime, Timestamp endTime) {
        return orderRepository.getAllOrdersWithInInterval(startTime, endTime);
    }

    @Override
    public List<Orders> top10OrdersWithHighestDollarAmountInZip(String zip) {
        List<Orders> list = orderRepository.top10OrdersWithHighestDollarAmountInZip(zip);
        if(list.isEmpty())
            throw new OrderServiceException("Order with zip"+ zip + "not found");
        else
            return list;
    }

    @Override
    public Orders placeOrder(Orders orders) {
        return orderRepository.placeOrder(orders);
    }

    @Override
    public void cancelOrder(String id) {
        Orders existing = orderRepository.getOrderById(id);
        if(existing == null){
            // ResourceNotFoundException
            throw new OrderServiceException("Order with id"+ id + "not found");
        }
        orderRepository.cancelOrder(id);
    }

    @Override
    public Orders updateOrder(String id, Orders order) {
        Orders existing = orderRepository.getOrderById(id);
        if(existing == null){
            // ResourceNotFoundException
            throw new OrderServiceException("Order with id"+ id + "not found");
        }
        orderRepository.updateOrder(id, order);
        return order;
    }
}
