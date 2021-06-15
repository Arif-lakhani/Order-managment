package com.egen.controller;


import com.egen.model.*;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(value="order")
public class OrderController {
    /**
     * implement the following endpoints
     */

    @GetMapping
    public ResponseEntity<List<Order>> getAllOrders(){
        //TODO
        return ResponseEntity.ok(Collections.singletonList(new Order("id")));
    }
    @GetMapping("{id}")
    public ResponseEntity<List<Order>> getOrderById(@PathVariable String id){
        //TODO
        return null;
    }
    @GetMapping("{startTime}/{endTime}")
    public ResponseEntity<List<Order>> getAllOrdersWithInInterval(@PathVariable ZonedDateTime startTime, @PathVariable ZonedDateTime endTime){
        //TODO
        return null;
    }
    @GetMapping("{zip}")
    public ResponseEntity<List<Order>> top10OrdersWithHighestDollarAmountInZip(@PathVariable String zip){
        //TODO
        return null;
    }
    @PostMapping
    public ResponseEntity<Order> placeOrder(@RequestBody Order order){
        return null;
    }
    
    public ResponseEntity<Order> cancelOrder(Order order){
        return null;
    }

    public ResponseEntity<Order> updateOrder(Order order){
        return null;
    }
}
