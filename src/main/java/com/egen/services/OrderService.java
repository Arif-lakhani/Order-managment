package com.egen.services;

import com.egen.Repository.OrderRepo;
import com.egen.model.Order;
import com.egen.model.OrderStatus;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.List;

@Service
public class OrderService implements OrderServiceInterface{
    private final OrderRepo orderrepo;

    public OrderService (OrderRepo orderrepo){
        this.orderrepo = orderrepo;
    }


    @Override
    public List<Order> getAllOrders() {
        return orderrepo.getAllOrders();
    }

    @Override
    public Order getOrderById(String id) {
        return orderrepo.getOrderById(id);
    }

    @Override
    public List<Order> getOrdersWithTimeInterval(ZonedDateTime startTime, ZonedDateTime endTime) {
        return orderrepo.getOrdersWithTimeInterval(startTime, endTime);
    }

    @Override
    public List<Order> top10OrdersWithHighestDollarAmountInZip(String zip) {
        return orderrepo.top10OrdersWithHighestDollarAmountInZip(zip);
    }

    @Override
    public Order addOrder(Order order) {
        return orderrepo.addOrder(order);
    }

    @Override
    public OrderStatus cancelOrder(String id) {
        return orderrepo.cancelOrder(id);
    }

    @Override
    public OrderStatus updateOrder(String id, Order order) {
        return orderrepo.updateOrder(id, order);
    }
}
