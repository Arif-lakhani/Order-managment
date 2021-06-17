package com.egen.service;

import com.egen.exceptions.OrderNotFoundException;
import com.egen.model.Order;
import com.egen.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImplementation implements OrderService{

    @Autowired
    OrderRepository orderRepository;

    @Override
    @Transactional
    public List<Order> getAllOrders() {
        return orderRepository.getAllOrders();
    }

    @Override
    @Transactional
    public List<Order> getOrderById(String id) {
        List<Order> list = orderRepository.getOrderById(id);
        if(list.isEmpty())
            throw new OrderNotFoundException("Order with " + id + "Not Found");
        else
            return list;
    }

    @Override
    @Transactional
    public List<Order> getAllOrdersWithInInterval(Date startTime, Date endTime) {
        List<Order> list = orderRepository.getAllOrdersWithInInterval(startTime, endTime);
        if(list.isEmpty())
            throw new OrderNotFoundException("Order within given interval Not Found");
        else
            return list;
    }

    @Override
    @Transactional
    public List<Order> top10OrdersWithHighestDollarAmountInZip(String zip) {
        List<Order> list = orderRepository.top10OrdersWithHighestDollarAmountInZip(zip);
        if(list.isEmpty())
            throw new OrderNotFoundException("Orders Not Found");
        else
            return list;
    }

    @Override
    @Transactional
    public Order placeOrder(Order order) {
        return orderRepository.placeOrder(order);
    }

    @Override
    @Transactional
    public Order cancelOrder(Order order, String id) {
        List<Order> list = orderRepository.getOrderById(id);
        if(list.isEmpty())
            throw new OrderNotFoundException("Orders Not Found");
        else
            return orderRepository.cancelOrder(order, id);
    }

    @Override
    @Transactional
    public Order updateOrder(Order order, String id) {
        List<Order> list = orderRepository.getOrderById(id);
        if(list.isEmpty())
            throw new OrderNotFoundException("Orders Not Found");
        else
            return orderRepository.updateOrder(order, id);
    }
}
