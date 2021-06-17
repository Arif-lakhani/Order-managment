package com.egen.controller;

import com.egen.model.Order;
import com.egen.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderService service;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<Order>> getAllOrders(){
        return ResponseEntity.ok(service.findAll());
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Order> getOrderById(@PathVariable("id") String id){
        return ResponseEntity.ok(service.findOne(id));
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{startTime}/{endTime}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<Order>> getAllOrdersWithInInterval(@PathVariable("startTime") ZonedDateTime startTime,@PathVariable("endTime") ZonedDateTime endTime){
        return ResponseEntity.ok(service.findAllOrderWithInInterval(startTime, endTime));
    }

    @RequestMapping(method = RequestMethod.GET, value = "/zip/{zip}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<Order>> top10OrdersWithHighestDollarAmountInZip(@PathVariable("zip") String zip){
        return ResponseEntity.ok(service.getTop10OrdersWithHighestDollarAmountInZip(zip));
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Order> placeOrder(@RequestBody Order order){
        return ResponseEntity.ok(service.placeOrder(order));
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/cancel/{id}", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Order> cancelOrder(@PathVariable("id") String id, @RequestBody Order order){
        return ResponseEntity.ok(service.cancelOrder(id, order));
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/update/{id}", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Order> updateOrder(@PathVariable("id") String id, @RequestBody Order order){
        return ResponseEntity.ok(service.updateOrder(id,order));
    }
}
