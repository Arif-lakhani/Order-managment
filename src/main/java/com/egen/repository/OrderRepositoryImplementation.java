package com.egen.repository;

import com.egen.enums.OrderStatus;
import com.egen.model.Order;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.Date;
import java.util.List;

@Repository
public class OrderRepositoryImplementation implements OrderRepository{

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<Order> getAllOrders() {
        TypedQuery<Order> query = entityManager.createNamedQuery("Order.getAllOrders", Order.class);
        return query.getResultList();
    }

    @Override
    public List<Order> getOrderById(String id) {
        TypedQuery<Order> query = entityManager.createNamedQuery("Order.getOrderById", Order.class);
        return query.getResultList();
    }

    @Override
    public List<Order> getAllOrdersWithInInterval(Date startTime, Date endTime) {
        TypedQuery<Order> query = entityManager.createNamedQuery("Order.getAllOrdersWithInInterval", Order.class);
        return query.getResultList();
    }

    @Override
    public List<Order> top10OrdersWithHighestDollarAmountInZip(String zip) {
        TypedQuery<Order> query = entityManager.createNamedQuery("Order.top10OrdersWithHighestDollarAmountInZip", Order.class);
        return query.setMaxResults(10).getResultList();
    }

    @Override
    public Order placeOrder(Order order) {
        order.setCreadtedDate(new Date());
        order.setModifiedDate(new Date());
        entityManager.persist(order);
        return order;
    }

    @Override
    public Order cancelOrder(Order order, String id) {
        List<Order> cancelOrderList = getOrderById(id);
        Order cancelOrder = cancelOrderList.get(0);
        cancelOrder.setOrderStatus(OrderStatus.CANCELED);
        entityManager.merge(cancelOrder);
        return cancelOrder;
    }

    @Override
    public Order updateOrder(Order order, String id) {
        List<Order> updateOrderList = getOrderById(id);
        Order updateOrder = updateOrderList.get(0);
        order.setModifiedDate(new Date());
        entityManager.merge(updateOrder);
        return updateOrder;
    }
}
