package ua.lviv.lgs.dao.implementation;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.lgs.dao.OrderDao;
import ua.lviv.lgs.entry.Order;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by admin on 01.07.2016.
 */
@Repository
public class OrderDaoImpl implements OrderDao {

    @PersistenceContext(unitName = "qwerty")
    private EntityManager entityManager;

    @Transactional
    public List<Order> findAllOrders() {
        return entityManager.createQuery("from Orders").getResultList();
    }

    @Transactional
    public void add(Order order) {
    entityManager.persist(order);




    }
}
