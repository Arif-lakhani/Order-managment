package com.egen.repository;

import com.egen.model.Address;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo {
    Address createAddress(Address address);
}
