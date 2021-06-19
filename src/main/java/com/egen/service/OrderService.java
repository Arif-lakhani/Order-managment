package com.egen.service;

import com.egen.model.Order;
import com.egen.repository.IOrderRepository;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

@Service
public class OrderService implements IOrderService{
    private IOrderRepository orderRepository;

    public OrderService(IOrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<Order> getAllOrders() {
        List<Order> allOrders = orderRepository.getAllOrders();
        return allOrders;
    }

    @Override
    public Order getOrderById(String id) {
        Order order = orderRepository.getOrderById(id);
        return order;
    }

    @Override
    public List<Order> getAllOrdersWithInInterval(ZonedDateTime startTime, ZonedDateTime endTime) {
        return orderRepository.getAllOrdersWithInInterval(startTime, endTime);
    }

    @Override
    public List<Order> top10OrdersWithHighestDollarAmountInZip(String zip) {
       List<Order> allOrders = orderRepository.getAllOrders();
       PriorityQueue<Order> top10orders = new PriorityQueue<>((a,b) -> (int)b.getOrderTotal() - (int)a.getOrderTotal());
       for(Order one: allOrders)
           if(one.getShippingDetails().getZipcode().equals(zip)) top10orders.add(one);

       List<Order> res = new ArrayList<>();
       for(int i = 0; i < 10; i++){
           if(top10orders.isEmpty()) break;
           res.add(top10orders.remove());
       }
       return res;
    }

    @Override
    public Order placeOrder(Order order) {
        return orderRepository.placeOrder(order);
    }

    @Override
    public Order cancelOrder(Order order) {
        return orderRepository.cancelOrder(order);
    }

    @Override
    public Order updateOrder(Order order) {
        return orderRepository.updateOrder(order);
    }
}
