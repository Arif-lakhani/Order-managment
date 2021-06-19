package com.egen.controller;

import com.egen.model.Order;
import com.egen.service.IOrderService;
import com.egen.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(method = RequestMethod.GET, value = "/order")
public class OrderController {
    /**
     * implement the following endpoints
     */

    private IOrderService orderService;
    public OrderController(OrderService orderService){
        log.info("in constructor");

        this.orderService = orderService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Order>> getAllOrders(){
        //TODO
        log.info("in getAllOrders");
        return ResponseEntity.ok(orderService.getAllOrders());
    }
    @GetMapping("{id}")
    public ResponseEntity<Order> getOrderById(@PathVariable String id){
        //TODO
        return ResponseEntity.ok(orderService.getOrderById(id));
    }
    @GetMapping("ordersInInterval/{startTime}/{endTime}")
    public ResponseEntity<List<Order>> getAllOrdersWithInInterval(@PathVariable ZonedDateTime startTime, @PathVariable ZonedDateTime endTime){
        //TODO
        return ResponseEntity.ok(orderService.getAllOrdersWithInInterval(startTime, endTime));
    }
    @GetMapping("/topOrdersInZip/{zip}")
    public ResponseEntity<List<Order>> top10OrdersWithHighestDollarAmountInZip(@PathVariable String zip){
        //TODO
        return ResponseEntity.ok(orderService.top10OrdersWithHighestDollarAmountInZip(zip));
    }
    @PostMapping("/create")
    public ResponseEntity<Order> placeOrder(Order order){
        return ResponseEntity.ok(orderService.placeOrder(order));
    }
    @PutMapping("/cancel")
    public ResponseEntity<Order> cancelOrder(Order order){
        return ResponseEntity.ok(orderService.cancelOrder(order));
    }
    @PutMapping("/update")
    public ResponseEntity<Order> updateOrder(Order order){
        return null;
    }
}
