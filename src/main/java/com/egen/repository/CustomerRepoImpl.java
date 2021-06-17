package com.egen.repository;

import com.egen.model.Customer;
import com.egen.model.Orders;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class CustomerRepoImpl implements CustomerRepo{

    @PersistenceContext
    private EntityManager em;

    public boolean findCustomer(Long id) {
        Query query = em.createQuery("SELECT cust FROM Customer cust WHERE cust.id= :cust_id").setParameter("cust_id",id);
        if(query.getResultList().isEmpty()){
            return false;
        }
       return true;
    }
}
