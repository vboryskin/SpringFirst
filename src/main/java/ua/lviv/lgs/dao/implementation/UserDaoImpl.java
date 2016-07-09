package ua.lviv.lgs.dao.implementation;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.lgs.dao.UserDao;
import ua.lviv.lgs.entry.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by admin on 30.06.2016.
 */
@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext(unitName = "qwerty")
    private EntityManager entityManager;

    @Transactional
    public void add(User user) {
        entityManager.persist(user);

    }
    @Transactional
    public List<User> findAllUsers() {
        return entityManager.createQuery("from User").getResultList();
    }

    public  User findOne(int id){
        return entityManager.find(User.class, id);
    }
}
