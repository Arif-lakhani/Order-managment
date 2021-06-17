package com.egen.service;

import com.egen.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepo customerRepo;

    @Transactional(readOnly = true)
    public boolean findCustomer(Long id) {
        return customerRepo.findCustomer(id);
    }
}
