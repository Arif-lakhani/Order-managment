package com.egen.service;

import com.egen.model.Address;
import org.springframework.stereotype.Service;


public interface AddressService {
    Address createAddress(Address address);
}
