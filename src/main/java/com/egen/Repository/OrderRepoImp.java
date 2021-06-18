package com.egen.Repository;


    import com.egen.model.Order;
    import org.springframework.stereotype.Repository;

    import java.time.ZonedDateTime;
    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    @Repository
    public class OrderRepoImp implements OrderRepo {

    private Map<String, Order> orderMap = new HashMap<>();

    @Override
    public List<Order> getAllOrders() {
        return new ArrayList<>(orderMap.values());
    }

    @Override
    public Order getOrderById(String orderId) {
        return orderMap.get(orderId);
    }

    @Override
    public List<Order> getAllOrdersWithinInterval(ZonedDateTime startTime, ZonedDateTime endTime) {
        return null;
    }

    @Override
    public List<Order> top10OrdersWithHighestDollarAmountInZip(String zip) {
        return null;
    }

    @Override
    public Order placeOrder(Order order) {
        return null;
    }

    @Override
    public Order cancelOrder(String id) {
        return null;
    }

    @Override
    public Order updateOrder(String orderId, Order order) {
        return null;
    }
}