package com.egen.MockDataRepository;

import com.egen.model.*;
import org.springframework.stereotype.Repository;

import java.time.ZonedDateTime;
import java.util.*;
import java.util.stream.Collectors;

@Repository
public class OrderData {

    private List<Order> orderList;

    public OrderData() {

        this.orderList = new ArrayList<>();
        List<Product> orderProducts = new ArrayList<>();
        orderProducts.add(new Product("23456","iPad", 2, 18.54, 1899.99));
        orderProducts.add(new Product("34527", "Monitor", 1, 21.69, 999.99));
        orderProducts.add(new Product("45673", "NoteBook", 3, 4.59, 99.99));

        Address billingAddress = new Address("Home", "3800 SW 34th ST", "APT T406", "Gainesville", "Florida", 32608);
        Address shippingAddress = new Address("Office", "3655 SW 2nd Ave", "1802", "Gainesville", "Florida", 32607);

        List<Payment> orderPayments = new ArrayList<>();
        orderPayments.add(new Payment("43965","Credit Card", billingAddress, ZonedDateTime.now(), UUID.randomUUID().toString()));
        orderPayments.add(new Payment("73606","Paypal", billingAddress, ZonedDateTime.now(), UUID.randomUUID().toString()));
        orderPayments.add(new Payment("34567", "Google Pay", billingAddress, ZonedDateTime.now(), UUID.randomUUID().toString()));

        Shipping orderShipping = new Shipping("123456", "Home delivery", 4.99);

        Order order = new Order(OrderStatus.IN_CART, UUID.randomUUID().toString(), orderProducts, orderPayments, orderShipping, ZonedDateTime.now(), ZonedDateTime.now(), billingAddress, shippingAddress);
        this.orderList.add(order);

        orderProducts = new ArrayList<>();
        orderProducts.add(new Product("67854", "Nerf Gun", 3, 18.45, 99.99));
        orderProducts.add(new Product("23456", "Marker", 5, 2.25, 9.99));

        orderPayments = new ArrayList<>();
        orderPayments.add(new Payment("78945", "Credit Card", billingAddress, ZonedDateTime.now(), UUID.randomUUID().toString()));
        orderPayments.add(new Payment("89765", "Paypal", billingAddress, ZonedDateTime.now(), UUID.randomUUID().toString()));

        orderShipping = new Shipping("234765", "In-Store Pickup", 0);

        order = new Order(OrderStatus.IN_CART, UUID.randomUUID().toString(), orderProducts, orderPayments, orderShipping, ZonedDateTime.now(), ZonedDateTime.now(), billingAddress, shippingAddress);
        this.orderList.add(order);

    }

    public List<Order> getOrders() {
        return orderList;
    }

    public void setOrders(List<Order> orderList) {
        this.orderList = orderList;
    }

    public Order getOrderById(String id) {
        for (Order order : this.orderList) {
            if(order.getId().equals(id))
                return order;
        }
        return null;
    }

    public List<Order> getOrdersWithTimeInterval(ZonedDateTime startTime, ZonedDateTime endTime) {

        return this.orderList.stream().filter(order -> order.getCreated_date().hashCode() >= startTime.hashCode() &&
                order.getCreated_date().hashCode() < endTime.hashCode()).collect(Collectors.toList());
    }

    static class sortByPrice implements Comparator<Order>
    {
        public int compare(Order a, Order b)
        {
            return (int) (a.getOrder_total() - b.getOrder_total());
        }
    }

    public List<Order> getTop10Order(String zip){

        List<Order> list = new ArrayList<>();
        for(Order order : this.orderList){
            if(Long.parseLong(zip) == (order.getOrder_shipping_address().getZipCode())){
                list.add(order);
            }
        }
        list.sort(new sortByPrice());
        return list.subList(0, 9);
    }
    public void addOrder(Order order){
        this.orderList.add(order);
    }

    public OrderStatus cancelOrder(String id){
        for(Order order : this.orderList){
            if(order.getId().equals(id)){
                this.orderList.remove(order);
                return OrderStatus.CANCELLED;
            }
        }
        return null;
    }

    public OrderStatus updateOrder(String id, Order order){
        for(Order o : this.orderList){
            if(o.getId().equals(id)){
                this.orderList.remove(o);
                this.orderList.add(order);
                return OrderStatus.MODIFIED;
            }
        }
        return null;
    }
}
