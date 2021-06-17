package com.egen.service;

import com.egen.model.Address;
import com.egen.model.Orders;
import com.egen.model.Payment;
import com.egen.repository.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService{

    @Autowired
    PaymentRepo paymentRepo;

    @Transactional
    public void createPayment(List<Payment> payment, Address billing_id, Orders order_id) {
               paymentRepo.createPayment(payment,billing_id,order_id);
    }
}
