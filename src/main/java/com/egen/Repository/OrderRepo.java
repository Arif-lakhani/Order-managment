package com.egen.Repository;

import com.egen.model.Order;
import com.egen.model.OrderStatus;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.time.ZonedDateTime;
import java.util.List;

@Repository
@Transactional
public class OrderRepo implements OrderRepoInterface{

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Order> getAllOrders() {
        Query query = em.createQuery("SELECT ord FROM Order ord JOIN fetch ord.paymentDetails JOIN FETCH ord.items");
        return (List<Order>) query.getResultList();
    }

    @Override
    public Order getOrderById(String orderId) {
        Query query = em.createQuery("SELECT ord FROM Order ord" +
                "JOIN fetch ord.paymentDetails JOIN FETCH ord.items" +
                "WHERE ord.orderId = :orderId ")
                .setParameter("orderId",orderId);
        List<Order> orders = query.getResultList();

        return orders.size() == 0 ? null : orders.get(0);
    }

    @Override
    public List<Order> getOrdersWithTimeInterval(ZonedDateTime startTime, ZonedDateTime endTime) {
        Query query = em.createQuery("SELECT ord FROM Order ord" +
                "JOIN fetch ord.paymentDetails JOIN FETCH ord.items" +
                "WHERE ord.createdAt > :startTime AND ord.createdAt < :endTime")
                .setParameter("startTime", startTime).setParameter("endTime", endTime);
        return (List<Order>) query.getResultList();
    }

    @Override
    public List<Order> top10OrdersWithHighestDollarAmountInZip(String zip) {
        Query query = em.createQuery("SELECT ord FROM Order ord, Address adr WHERE ord.shippingAddress.id = adr.id" +
                "AND adr.zipCode=:zip_code ORDER BY ord.total desc").setParameter("zip_code", zip);
        if(query.getResultList().isEmpty()){
            return null;
        }
        return (List<Order>) query.setMaxResults(10).getResultList();
    }

    @Override
    public Order addOrder(Order orders) {
        em.persist(orders);
        return orders;
    }

    @Override
    public OrderStatus cancelOrder(String id) {
        Order cancelOrder = getOrderById(id);
        cancelOrder.setOrderStatus(OrderStatus.CANCELLED);
        em.merge(cancelOrder);
        return OrderStatus.CANCELLED;
    }

    @Override
    public OrderStatus updateOrder(String id, Order order) {
        Order orders = getOrderById(id);
        orders.setOrderStatus(OrderStatus.MODIFIED);
        em.merge(order);
        return OrderStatus.MODIFIED;
    }
}
