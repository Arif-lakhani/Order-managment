package com.egen.repository;

import com.egen.model.Address;
import com.egen.model.Orders;
import com.egen.model.Payment;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Repository
public class PaymentRepoImpl implements PaymentRepo{

    @PersistenceContext
    EntityManager em;

    public void createPayment(List<Payment> payment, Address billing_id, Orders order_id) {
        Date date = new Date();
        Timestamp payment_date = new Timestamp(date.getTime());
        for(int i=0;i<payment.size();i++){
            Payment new_payment = new Payment(payment.get(i).getAmount(),payment_date,payment.get(i).getPaymentMode(),
                    billing_id,order_id);
             em.persist(payment);
        }
    }
}
