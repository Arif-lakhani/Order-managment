package com.egen.repository;
import com.egen.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.ZonedDateTime;
import java.sql.Timestamp;
import java.util.List;

@Repository
public interface IOrderRepository {

    List<Order> getAllOrders();
    Order getOrderById(String orderId);
    List<Order> getAllOrdersWithInInterval(ZonedDateTime startTime, ZonedDateTime endTime);
    Order placeOrder(Order order);
    Order cancelOrder(Order order);
    Order updateOrder(Order order);
}
