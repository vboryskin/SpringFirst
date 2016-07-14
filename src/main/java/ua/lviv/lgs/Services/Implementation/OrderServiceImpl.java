package ua.lviv.lgs.Services.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.lgs.Services.OrderService;
import ua.lviv.lgs.dao.OrderDao;
import ua.lviv.lgs.dao.UserDao;
import ua.lviv.lgs.entry.Order;

import java.util.List;

/**
 * Created by admin on 01.07.2016.
 */
@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private UserDao userDao;

    @Transactional
    public void add(int orderNumber, int quantity, int sum, String id){
        Order order = new Order(orderNumber, quantity, sum);
        order.setUser(userDao.findOne(Integer.parseInt(id)));
        orderDao.add(order);
    }

    @Transactional
    public List<Order> findAllOrders() {
        return orderDao.findAllOrders();
    }
}
