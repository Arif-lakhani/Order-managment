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
        return (ResponseEntity<List<Order>>) orderService.getAllOrders();
    }

    @RequestMapping(method = RequestMethod.GET, value = "{id}")
    public ResponseEntity<List<Order>> getOrderById(@PathVariable("id") String id){
        return (ResponseEntity<List<Order>>) orderService.getOrderById(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/intervals")
    public ResponseEntity<List<Order>> getAllOrdersWithInInterval(@RequestParam(name = "startTime") Date startTime, @RequestParam(name = "endTime") Date endTime){
        return (ResponseEntity<List<Order>>) orderService.getAllOrdersWithInInterval(startTime, endTime);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/zipcode/{zip}")
    public ResponseEntity<List<Order>> top10OrdersWithHighestDollarAmountInZip(@PathVariable("zip") String zip){
        return (ResponseEntity<List<Order>>) orderService.top10OrdersWithHighestDollarAmountInZip(zip);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/placeorder")
    public Order placeOrder(Order order){
        return orderService.placeOrder(order);
    }

    @RequestMapping(method = RequestMethod.PUT, value ="/cancelorder/{id}")
    public Order cancelOrder(Order order, @PathVariable("id") String id){
        return orderService.cancelOrder(order,id);
    }

    @RequestMapping(method = RequestMethod.PUT, value ="/updateorder/{id}")
    public Order updateOrder(Order order, String id){
        return orderService.updateOrder(order, id);
    }
}
