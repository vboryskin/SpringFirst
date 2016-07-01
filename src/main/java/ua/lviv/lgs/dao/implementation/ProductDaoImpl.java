package ua.lviv.lgs.dao.implementation;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.lgs.dao.ProductDao;
import ua.lviv.lgs.entry.Product;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by admin on 01.07.2016.
 */
@Repository
public class ProductDaoImpl implements ProductDao {

    @PersistenceContext(unitName = "qwerty")
    private EntityManager entityManager;

    @Transactional
    public void add(Product product){
        entityManager.persist(product);
    }
}
