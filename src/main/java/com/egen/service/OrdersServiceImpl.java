package com.egen.service;


import com.egen.enums.OrderStatus;
import com.egen.exception.OrderNotFoundException;
import com.egen.model.Address;
import com.egen.model.Item;
import com.egen.model.Orders;
import com.egen.repository.*;
import com.egen.util.InputData;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.sql.Timestamp;

@Service

public class OrdersServiceImpl implements OrdersService{

    @Autowired
    OrdersRepo ordersRepo;

    @Autowired
    AddressService addressService;

    @Autowired
    ItemService itemService;

    @Autowired
    PaymentService paymentService;

    @Autowired
    CustomerService customerService;

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
    public Orders createOrder(InputData inputData) {
        Orders new_order =null;
       //Gets current date and adds plus 5 to current date and sets it as delivery date
        Date date = new Date();
        long ltime=date.getTime()+5*24*60*60*1000;
        Date expectedDelivery = new Date(ltime);
        Timestamp date_ordered = new Timestamp(date.getTime());
        Timestamp delivery_date = new Timestamp(expectedDelivery.getTime());
        System.out.println(date_ordered);
        System.out.println(delivery_date);

        boolean existingCustomer = customerService.findCustomer(inputData.getCustomer_id());
        System.out.println("existing customer" + existingCustomer);

        ///Update item and get subtotal
        double sub_total = 0;
        Iterator<Integer> it = Arrays.stream(inputData.getItems()).iterator();
        while (it.hasNext()){
            Long item_id = Long.valueOf(it.next());
            System.out.println("ITEM:"+item_id);
            itemService.updateItem(item_id,inputData.getItemQuantity());
            Item item2 = itemService.getItem(item_id);
            sub_total += item2.getItemPrice() * inputData.getItemQuantity();
            System.out.println(sub_total);
        }
        //If customer doesnt exist then treat them as guest customer with Id =0
        Long cust_id = Long.valueOf(0);
        double tax = 1.5,shippingCharges=3.0;
        double total = tax + sub_total + shippingCharges;
        if (existingCustomer) {
            cust_id = inputData.getCustomer_id();
            new_order = new Orders(cust_id,date_ordered,delivery_date,inputData.getItemQuantity(),sub_total,tax,
                    shippingCharges,total, OrderStatus.PLACED,inputData.getShipmentMethod(),inputData.getShippingAddress());
                ordersRepo.createOrder(new_order);
            //If billing address is same as shipping then avoid duplicate address
            //Creating payment based on the result of isBillingSameAsShippingAddress()
            if (inputData.isBillingSameAsShippingAddress()) {
                Address address = addressService.createAddress(inputData.getShippingAddress());
                System.out.println("Address ID:" + address.getId());
                paymentService.createPayment(inputData.getPayments(), address.getId());
            } else {
                 new_order = new Orders(cust_id,date_ordered,delivery_date,inputData.getItemQuantity(),sub_total,tax,
                        shippingCharges,total, OrderStatus.PLACED,inputData.getShipmentMethod(),inputData.getShippingAddress());
                addressService.createAddress(inputData.getShippingAddress());
                Address billingAddr = addressService.createAddress(inputData.getShippingAddress());
                paymentService.createPayment(inputData.getPayments(), billingAddr.getId());
            }
            //TODO update payment at item after creating orders
        }
        return new_order;
    }
        @Transactional
        public Orders cancelOrder (Orders orders, Long id){
            if (ordersRepo.findOne(id) == null)
                throw new OrderNotFoundException("The order which you are trying to cancel is not found");
            else {
                return ordersRepo.cancelOrder(orders, id);
            }
        }

        @Transactional
        public Orders updateOrder (Long id){
            if (ordersRepo.findOne(id) == null)
                throw new OrderNotFoundException("The order which you are trying to change the status is not found");
            else {
                return ordersRepo.updateOrder(id);
            }
        }
}
