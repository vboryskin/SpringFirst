package ua.lviv.lgs.dao;

import ua.lviv.lgs.entry.Order;

import java.util.List;

/**
 * Created by admin on 30.06.2016.
 */
public interface OrderDao {

    void add(Order order);

    List<Order> findAllOrders();
}
