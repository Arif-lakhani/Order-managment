package com.egen.service;

import com.egen.exception.OrderNotFoundException;
import com.egen.exception.ResourceNotFoundException;
import com.egen.model.Order;
import com.egen.repository.OrderRepository;
import com.egen.repository.OrderRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.support.lob.TemporaryLobCreator;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.beans.Transient;
import java.time.ZonedDateTime;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    OrderRepository repository;

    @Override
    @Transactional
    public List<Order> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional()
    public Order findOne(String id) {
        Order order = repository.findOne(id);
        if(order == null){
            throw new OrderNotFoundException("Order with id =" + id + "NOT FOUND");
        }
        return order;
    }

    @Override
    @Transactional
    public List<Order> findAllOrderWithInInterval(ZonedDateTime startTime, ZonedDateTime EndTime) {
        return repository.findAllOrderWithInInterval(startTime, EndTime);
    }

    @Override
    @Transactional
    public List<Order> getTop10OrdersWithHighestDollarAmountInZip(String zip) {
        return repository.getTop10OrdersWithHighestDollarAmountInZip(zip);
    }

    @Override
    @Transactional
    public Order placeOrder(Order order) {
        return repository.placeOrder(order);
    }

    @Override
    @Transactional
    public Order updateOrder(String id, Order order) {
        Order existing = repository.findOne(id);
        if(existing == null){
            throw new ResourceNotFoundException("Order with id =" + order.getOrder_id() + "NOT FOUND");
        }
        return repository.updateOrder(existing);
    }

    @Override
    @Transactional
    public Order cancelOrder(String id, Order order) {
        Order existing = repository.findOne(id);
        if(existing == null){
            throw new ResourceNotFoundException("Order with id =" + order.getOrder_id() + "NOT FOUND");
        }
        repository.cancelOrder(existing);
        return existing;
    }
}
