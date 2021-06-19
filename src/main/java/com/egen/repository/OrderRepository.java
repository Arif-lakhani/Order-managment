package com.egen.repository;

import com.egen.model.Order;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.time.ZonedDateTime;
import java.util.List;

@Repository
@Transactional
public class OrderRepository implements  IOrderRepository{

    @PersistenceContext
    private EntityManager entityManager;


    public List<Order> getAllOrders() {
        Query query = entityManager.createQuery("SELECT ord FROM Order ord  JOIN fetch ord.payments JOIN FETCH ord.items");
        List<Order> orders= (List<Order>) query.getResultList();
        return orders;
    }

    @Override
    public Order getOrderById(String orderId) {
        Query nativeQuery = entityManager.createNativeQuery("Select * from GroceryOrder where orderId = :orderId");
        nativeQuery.setParameter("orderId",orderId);
        List<Order> orders = nativeQuery.getResultList();
        if(orders.isEmpty() )
            return null;
        return orders.get(0);

    }

    @Override
    public List<Order> getAllOrdersWithInInterval(ZonedDateTime startTime, ZonedDateTime endTime) {
        Query query = entityManager.createQuery("SELECT ord FROM Order ord  " +
                "JOIN fetch ord.payments JOIN FETCH ord.items " +
                "WHERE ord.createdDate > :startTime AND ord.createdDate < :endTime")
                .setParameter("startTime", startTime).setParameter("endTime", endTime);
        return (List<Order>) query.getResultList();
    }

    @Override
    public Order placeOrder(Order order) {
        entityManager.persist(order);
        return order;
    }

    @Override
    public Order cancelOrder(Order order) {
        Order savedOrder = getOrderById((order.getId()));
        savedOrder.setStatus("CANCELLED");
        entityManager.merge(savedOrder);
        return savedOrder;
    }

    @Override
    public Order updateOrder(Order order) {
        entityManager.merge(order);
        return order;
    }
}
