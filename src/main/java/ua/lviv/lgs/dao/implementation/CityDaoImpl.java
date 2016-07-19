package ua.lviv.lgs.dao.implementation;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.lgs.dao.CityDao;
import ua.lviv.lgs.entry.City;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by admin on 01.07.2016.
 */
@Repository
public class CityDaoImpl implements CityDao {

    @PersistenceContext(unitName = "qwerty")
    private EntityManager entityManager;

    @Transactional
    public void add(City city){
        entityManager.persist(city);
    }
}
