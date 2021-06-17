package com.egen.service;

import com.egen.model.Payment;

import java.util.List;


public interface PaymentService {
    Payment createPayment(List<Payment> payment, Long id);
}
