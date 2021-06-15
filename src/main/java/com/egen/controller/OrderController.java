package com.egen.controller;

import com.egen.model.Orders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.TimeZone;

@RestController
public class OrderController {
    /**
     * implement the following endpoints
     */

    @GetMapping("orders")
    public ResponseEntity<List<Orders>> getAllOrders(){
        //TODO
      //  return ResponseEntity.ok(Collections.singletonList(new Order("id")));
        return ResponseEntity.ok(Collections.singletonList(new Orders()));
    }

    public ResponseEntity<List<Orders>> getOrderById(String id){
        //TODO
        return null;
    }

    public ResponseEntity<List<Orders>> getAllOrdersWithInInterval(TimeZone startTime, TimeZone endTime){
        //TODO
        return null;
    }

    public ResponseEntity<List<Orders>> top10OrdersWithHighestDollarAmountInZip(String zip){
        //TODO
        return null;
    }

    public ResponseEntity<Orders> placeOrder(Orders order){
        return null;
    }

    public ResponseEntity<Orders> cancelOrder(Orders order){
        return null;
    }

    public ResponseEntity<Orders> updateOrder(Orders order){
        return null;
    }
}
