package ua.lviv.lgs.Services.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.lgs.Services.OrderService;
import ua.lviv.lgs.dao.OrderDao;
import ua.lviv.lgs.entry.Order;

/**
 * Created by admin on 01.07.2016.
 */
@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderDao orderDao;

    @Transactional
    public void add(int orderNumber, int quantity, int sum){
        Order order = new Order(orderNumber, quantity, sum);
        orderDao.add(order);
    }
}
