package com.egen.service;

import com.egen.model.Item;
import com.egen.model.Orders;


public interface ItemService {
    Item getItem(Long id);
    void updateItem(long id,int quantity);
    void updateOrderIdInItem(long id, Orders order);
}
