package com.egen.repository;

import com.egen.model.Order;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.time.ZonedDateTime;
import java.util.List;

@Repository
public class OrderRepositoryImpl implements OrderRepository{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Order> findAll() {
        TypedQuery<Order> query = entityManager.createNamedQuery("Order.findAll", Order.class);
        return query.getResultList();
    }

    @Override
    public Order findOne(String id) {
        return entityManager.find(Order.class, id);
    }

    @Override
    public List<Order> findAllOrderWithInInterval(ZonedDateTime startTime, ZonedDateTime endTime) {
        TypedQuery<Order> query = entityManager.createNamedQuery("Order.findWithinInterVal", Order.class);
        query.setParameter("paramStartTime", startTime);
        query.setParameter("paramEndTime", endTime);
        List<Order> resultList = query.getResultList();
        return resultList;
    }

    @Override
    public List<Order> getTop10OrdersWithHighestDollarAmountInZip(String zip) {
        TypedQuery<Order> query = entityManager.createNamedQuery("Order.findTop10OrdersWithHighestDollarAmountInZip", Order.class);
        query.setParameter("paramZip", zip);
        List<Order> resultList = query.setMaxResults(10).getResultList();
        return resultList;
    }

    @Override
    public Order placeOrder(Order order) {
        entityManager.persist(order);
        return order;
    }

    @Override
    public Order updateOrder(Order order) {
        return entityManager.merge(order);
    }

    @Override
    public void cancelOrder(Order order) {
        entityManager.remove(order);
    }

}
