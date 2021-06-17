package com.egen.service;


import com.egen.exception.OrderNotFoundException;
import com.egen.model.Orders;
import com.egen.repository.OrdersRepo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.sql.Timestamp;

@Service
public class OrdersServiceImpl implements OrdersService{

    @Autowired
    OrdersRepo ordersRepo;

   @Transactional(readOnly = true)
    public List<Orders> findAll() {
        return ordersRepo.findAll();
    }

    @Transactional(readOnly = true)
    public Orders findOne(Long id) {
//        Orders order = ordersRepo.findOne(id);
//        if(order==null)
//            throw new OrderNotFoundException("The order which you are trying to find is not found");
        return ordersRepo.findOne(id);
    }

    @Transactional(readOnly = true)
    public List<Orders> findWithinInterval(Timestamp startTime, Timestamp endTime) {
       List<Orders> orders = ordersRepo.findWithinInterval(startTime,endTime);
       if(orders.isEmpty())
           throw new OrderNotFoundException("The order which you are trying to find is not found");
        return orders;

    }

    @Transactional(readOnly = true)
    public List<Orders> findTop10OrdersWithHighestDollarAmountInZip(String zip) {
        List<Orders> orders = ordersRepo.findTop10OrdersWithHighestDollarAmountInZip(zip);
        if(orders.isEmpty())
            throw new OrderNotFoundException("The order which you are trying to find is not found");
        return orders;
    }

    @Transactional
    public Orders createOrder(Orders orders) {
//
//        LocalDateTime localDateTime = LocalDateTime.now();
//        Date date = new Date();
//        Timestamp timestamp = new Timestamp(date.getTime());
//        orders.setOrderStatus(OrderStatus.PLACED);
//        orders.setDateOrdered(timestamp);
//        orders.setShipDate(timestamp);
//        orders.setDateOrdered(timestamp);
//        System.out.println("In service create order");
//        System.out.println(orders.getOrderId());
//        System.out.println(orders.getOrderStatus());
//        System.out.println(orders.getDateOrdered());
//        System.out.println(orders.getShipDate());
//        System.out.println(orders.getCustomer());
//        System.out.println(orders.toString());
//        return ordersRepo.createOrder(orders);
        return null;
    }

    @Transactional
    public Orders cancelOrder(Orders orders,Long id) {
        if(ordersRepo.findOne(id)==null)
            throw new OrderNotFoundException("The order which you are trying to cancel is not found");
        else {
            return ordersRepo.cancelOrder(orders, id);
        }
    }

   @Transactional
    public Orders updateOrder(Orders orders) {
        return null;
    }
}
