package com.egen.service;

import com.egen.model.Address;
import com.egen.repository.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AddressServiceImpl implements AddressService{
    @Autowired
    AddressRepo addressRepo;

    @Transactional
    public Address createAddress(Address address) {
        return addressRepo.createAddress(address);
    }
}
