package com.egen.repository;

import com.egen.model.Payment;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;


public interface PaymentRepo {

    Payment createPayment(List<Payment> payment, Long id);
}
