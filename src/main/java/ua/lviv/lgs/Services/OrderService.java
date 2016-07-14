package ua.lviv.lgs.Services;

import ua.lviv.lgs.entry.Order;

import java.util.List;

/**
 * Created by admin on 01.07.2016.
 */
public interface OrderService {

    void add(int orderNumber, int quantity, int sum, String id);

    List<Order> findAllOrders();
}
