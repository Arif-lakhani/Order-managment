package com.egen.service;

import com.egen.model.Item;


public interface ItemService {
    Item getItem(Long id);
    void updateItem(long id,int quantity);
}
