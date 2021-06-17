package com.egen.repository;

import com.egen.model.Address;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class AddressRepoImpl implements AddressRepo{

    @PersistenceContext
    private EntityManager em;

    public Address createAddress(Address address) {
        em.persist(address);
        return address;
    }
}
