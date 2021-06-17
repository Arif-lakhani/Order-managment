package com.egen.controller;

import com.egen.model.Orders;
import com.egen.service.OrdersService;
import com.egen.util.InputData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {
    /**
     * implement the following endpoints
     */

    @Autowired
    OrdersService ordersService;

    /**
     * Fetches all the orders present in the table
     * @return list of orders
     */
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Orders> getAllOrders(){
        return ordersService.findAll();
    }

    /**
     * Fetches order details of the given id
     * @param id accepts Order id as input
     * @return Order object
     */
    @RequestMapping(method = RequestMethod.GET,value = "/{id}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Orders getOrderById(@PathVariable("id")Long id){
        return ordersService.findOne(id);
    }

    /**
     * Fetches all the records of orders places between the given interval
     * @param startTime - Time of the order placed
     * @param endTime - Time of the order placed
     * @return List of orders
     */
    @RequestMapping(method = RequestMethod.GET,value = "/interval",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Orders> getAllOrdersWithInInterval(@RequestParam(name = "startTime") Timestamp startTime,
                                                   @RequestParam(name = "endTime") Timestamp endTime){
        return ordersService.findWithinInterval(startTime,endTime);
    }

    /**
     * Fetches the top 10 highest amount in the given area
     * @param zip - Zipcode of the address
     * @return List of orders
     */
    @RequestMapping(method = RequestMethod.GET,value = "zipcode/{zip}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Orders> top10OrdersWithHighestDollarAmountInZip(@PathVariable("zip") String zip){
        return ordersService.findTop10OrdersWithHighestDollarAmountInZip(zip);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/placeorder",consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void placeOrder(@RequestBody InputData inputData){
        System.out.println(inputData.toString());
        ordersService.createOrder(inputData);
    }

    /**
     * This method will cancel the selected order
     * @param order -  orderStatus = "CANCELLED"
     * @param id - Order id
     * @return
     */
    @RequestMapping(method = RequestMethod.PUT,value = "/cancel/{id}",consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Orders cancelOrder(@RequestBody Orders order,@PathVariable("id")Long id){
        return ordersService.cancelOrder(order,id);
    }

    /**
     * Updates the selected order by changing the values desired
     * Currently this method is used to change the order status to delivered
     * @param id - order id
     * @return
     */
    @RequestMapping(method = RequestMethod.PUT,value = "/delivered/{id}",consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Orders updateOrder(@PathVariable("id")Long id){
        return ordersService.updateOrder(id);
    }
}
