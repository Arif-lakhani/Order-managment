package com.egen.controller;

import com.egen.model.Order;
import com.egen.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {
    /**
     * implement the following endpoints
     */

    @Autowired
    private OrderService orderService;

    @RequestMapping(method= RequestMethod.GET)
    public ResponseEntity<List<Order>> getAllOrders(){
        return ResponseEntity.ok(orderService.getAllOrders());
    }

    @RequestMapping(method = RequestMethod.GET, value = "{id}")
    public ResponseEntity<List<Order>> getOrderById(@PathVariable("id") String id){
        return ResponseEntity.ok(orderService.getOrderById(id));
    }

    @RequestMapping(method = RequestMethod.GET, value = "/intervals/{startTime}/{endTime}")
    public ResponseEntity<List<Order>> getAllOrdersWithInInterval(@PathVariable(name = "startTime") Date startTime, @PathVariable(name = "endTime") Date endTime){
        return  ResponseEntity.ok(orderService.getAllOrdersWithInInterval(startTime, endTime));
    }

    @RequestMapping(method = RequestMethod.GET, value = "/zipcode/{zip}")
    public ResponseEntity<List<Order>> top10OrdersWithHighestDollarAmountInZip(@PathVariable("zip") String zip){
        return ResponseEntity.ok(orderService.top10OrdersWithHighestDollarAmountInZip(zip));
    }

    @RequestMapping(method = RequestMethod.POST, value = "/placeorder")
    public Order placeOrder(@RequestBody Order order){
        return orderService.placeOrder(order);
    }

    @RequestMapping(method = RequestMethod.PUT, value ="/cancelorder/{id}")
    public Order cancelOrder(@RequestBody Order order, @PathVariable("id") String id){
        return orderService.cancelOrder(order,id);
    }

    @RequestMapping(method = RequestMethod.PUT, value ="/updateorder/{id}")
    public Order updateOrder(@RequestBody Order order, String id){
        return orderService.updateOrder(order, id);
    }
}
