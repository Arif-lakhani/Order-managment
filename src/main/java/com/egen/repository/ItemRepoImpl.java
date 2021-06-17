package com.egen.repository;

import com.egen.model.Item;
import com.egen.model.Orders;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class ItemRepoImpl implements ItemRepo{

    @PersistenceContext
    EntityManager em;

    public Item getItem(Long id) {
        Query query = em.createQuery("SELECT itm FROM Item itm WHERE itm.id= :itm_id").setParameter("itm_id",id);
        if(query.getResultList().isEmpty()){
            return null;
        }
        List<Item> item = query.getResultList();
        return item.get(0);
    }

    public void updateItem(long id, int quantity) {
        Item currentItem = getItem(id);
       int itemsLeft = currentItem.getQuantityInStock() - quantity;
       System.out.println("Items left ="+ itemsLeft+" in "+id);
       if(itemsLeft>=0){
          currentItem.setQuantityInStock(itemsLeft);
       }
      em.merge(currentItem);
    }
}
