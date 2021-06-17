package com.egen.service;

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
    public Payment createPayment(List<Payment> payment, Long id) {
        return paymentRepo.createPayment(payment,id);
    }
}
