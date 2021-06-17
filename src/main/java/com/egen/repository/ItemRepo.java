package com.egen.repository;

import com.egen.model.Item;
import com.egen.model.Orders;

public interface ItemRepo {

    Item getItem(Long id);

    void updateItem(long id, int quantity);

     void updateOrderIdInItem(long id, Orders order);
}
