package com.egen.repository;

import com.egen.model.Item;

public interface ItemRepo {
    Item getItem(Long id);

    void updateItem(long id, int quantity);
}
