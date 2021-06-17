package com.egen.repository;

import com.egen.model.Payment;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PaymentRepoImpl implements PaymentRepo{

    @Override
    public Payment createPayment(List<Payment> payment,Long id) {


        return null;
    }
}
