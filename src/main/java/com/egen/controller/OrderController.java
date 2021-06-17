package com.egen.controller;

import com.egen.model.enums.Orders;
import com.egen.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;

@RestController
public class OrderController {
    /**
     * implement the following endpoints
     */
    @Autowired
    private OrderService orderService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Orders> getAllOrders(){
        return orderService.getAllOrders();
    }

    @RequestMapping(method = RequestMethod.GET, value = "{id}")
    public Orders getOrderById(@PathVariable("id") String id){
        return orderService.getOrderById(id);
    }
    @RequestMapping(method = RequestMethod.GET, value = "intervals")
    public List<Orders> getAllOrdersWithInInterval(@RequestParam(name = "startTime") Timestamp startTime, @RequestParam(name = "endTime") Timestamp endTime){
        return orderService.getAllOrdersWithInInterval(startTime, endTime);
    }

    @RequestMapping(method = RequestMethod.GET, value="zipcode/{zip}")
    public List<Orders> top10OrdersWithHighestDollarAmountInZip(@PathVariable("zip") String zip){
        return orderService.top10OrdersWithHighestDollarAmountInZip(zip);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Orders placeOrder(@RequestBody Orders order){
        orderService.placeOrder(order);
        return order;
    }

    @RequestMapping(method = RequestMethod.DELETE, value="{id}")
    public void cancelOrder(@PathVariable("id") String id){
        orderService.cancelOrder(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "{id}")
    public Orders updateOrder(@PathVariable("id") String oid, @RequestBody  Orders order){
        orderService.updateOrder(oid, order);
        return order;
    }
}
