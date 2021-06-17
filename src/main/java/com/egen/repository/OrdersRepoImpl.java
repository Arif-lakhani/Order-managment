package com.egen.repository;

import com.egen.enums.OrderStatus;
import com.egen.exception.OrderNotFoundException;
import com.egen.model.Orders;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.sql.Timestamp;
import java.util.List;


@Repository
public class OrdersRepoImpl implements OrdersRepo{

    @PersistenceContext
    private EntityManager em;

    public List<Orders> findAll() {
        Query query = em.createQuery("SELECT ord FROM Orders ord");
        return query.getResultList();
    }


    public Orders findOne(Long id) {
        Query query = em.createQuery("SELECT ord FROM Orders ord WHERE ord.id= :order_id").setParameter("order_id",id);
        if(query.getResultList().isEmpty()){
            return null;
        }
        List<Orders> orders = query.getResultList();
        return orders.get(0);
    }

    public List<Orders> findWithinInterval(Timestamp startTime, Timestamp endTime) {

        Query query = em.createQuery("SELECT ord From Orders ord WHERE ord.dateOrdered BETWEEN :startTime AND :endTime")
                .setParameter("startTime",startTime).setParameter("endTime",endTime);
        if(query.getResultList().isEmpty()){
            throw new OrderNotFoundException("Orders in the given interval not found");
        }
        List<Orders> orders = query.getResultList();
        return orders;
    }


    public List<Orders> findTop10OrdersWithHighestDollarAmountInZip(String zip) {
        Query query = em.createQuery("SELECT ord FROM Orders ord,Address adr WHERE ord.shippingAddress.id=adr.id " +
                "AND adr.zipCode=:zip_code ORDER BY ord.total desc").setParameter("zip_code",zip);
        if(query.getResultList().isEmpty()){
            return null;
        }
        return query.setMaxResults(10).getResultList();
    }


    public Orders createOrder(Orders orders) {
        em.persist(orders);
        return orders;
    }

    public Orders cancelOrder(Orders orders,Long id) {
        Orders updateOrder = findOne(id);
        updateOrder.setOrderStatus(orders.getOrderStatus());
        em.merge(updateOrder);
        return orders;
    }

    public Orders updateOrder(Long id) {
        Orders updateOrder = findOne(id);
        updateOrder.setOrderStatus(OrderStatus.DELIVERED);
        em.merge(updateOrder);
        return updateOrder;
    }
}
