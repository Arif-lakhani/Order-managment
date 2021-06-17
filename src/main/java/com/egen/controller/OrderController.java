package com.egen.controller;

import com.egen.MockDataRepository.OrderData;
import com.egen.model.Order;
import com.egen.model.OrderStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.ZonedDateTime;
import java.util.List;

@RestController
public class OrderController {
    /**
     * implement the following endpoints
     */

    OrderData orderDataMock;

    public OrderController (OrderData orderDataMock){
        this.orderDataMock = orderDataMock;
    }

    @GetMapping("/order")
    public ResponseEntity<List<Order>> getAllOrders(){
        //TODO
        return ResponseEntity.ok(this.orderDataMock.getOrders());
    }

    @GetMapping("/order/{id}")
    public ResponseEntity<Order> getOrderById(@PathVariable(name = "id") String id){
        //TODO
        return ResponseEntity.ok(this.orderDataMock.getOrderById(id));
    }

    @GetMapping(value = "/order", params = { "startTime", "endTime" })
    public ResponseEntity<List<Order>> getAllOrdersWithInInterval(@RequestParam(name = "startTime") ZonedDateTime startTime,
                                                                  @RequestParam(name = "endTime") ZonedDateTime endTime){
        //TODO
        return ResponseEntity.ok(this.orderDataMock.getOrdersWithTimeInterval(startTime, endTime));
    }

    @GetMapping(value = "/order", params = {"zip"})
    public ResponseEntity<List<Order>> top10OrdersWithHighestDollarAmountInZip(@RequestParam(name = "zip") String zip){
        //TODO
        return ResponseEntity.ok(this.orderDataMock.getTop10Order(zip));
    }

    @PostMapping(value = "/order")
    public void placeOrder(@RequestBody Order order){
        this.orderDataMock.addOrder(order);
    }

    @PutMapping(value = "/order/{id}")
    public ResponseEntity<OrderStatus> cancelOrder(@PathVariable(name ="id") String id){
        return ResponseEntity.ok(this.orderDataMock.cancelOrder(id));
    }

    @PutMapping(value = "/order/{id}")
    public ResponseEntity<OrderStatus> updateOrder(@PathVariable(name = "id") String id, @RequestBody Order order){
        return ResponseEntity.ok(this.orderDataMock.updateOrder(id, order));
    }
}
