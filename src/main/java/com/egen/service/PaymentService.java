package com.egen.service;

import com.egen.model.Address;
import com.egen.model.Orders;
import com.egen.model.Payment;

import java.util.List;


public interface PaymentService {
    void createPayment(List<Payment> payment, Address addr, Orders ord);
}
