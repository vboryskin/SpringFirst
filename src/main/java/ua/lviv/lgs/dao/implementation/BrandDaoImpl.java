package ua.lviv.lgs.dao.implementation;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.lgs.dao.BrandDao;
import ua.lviv.lgs.entry.Brand;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by admin on 01.07.2016.
 */
@Repository
public class BrandDaoImpl implements BrandDao {

    @PersistenceContext(unitName = "qwerty")
    private EntityManager entityManager;

    @Transactional
    public void add(Brand brand){
        entityManager.persist(brand);
    }
}
