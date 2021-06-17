package com.egen.repository;

import com.egen.model.Address;
import com.egen.model.Orders;
import com.egen.model.Payment;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;


public interface PaymentRepo {

    void createPayment(List<Payment> payment, Address billing_id, Orders order_id);
}
