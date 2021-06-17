package com.egen.service;

import com.egen.model.Item;
import com.egen.model.Orders;
import com.egen.repository.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    ItemRepo itemRepo;

    @Transactional(readOnly = true)
    public Item getItem(Long id) {
        return itemRepo.getItem(id);
    }

    @Transactional
    public void updateItem(long id, int quantity) {
        itemRepo.updateItem(id,quantity);
    }

    @Transactional
    public void updateOrderIdInItem(long id, Orders order) {
        itemRepo.updateOrderIdInItem(id,order);
    }
}
