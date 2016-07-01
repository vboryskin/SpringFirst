package ua.lviv.lgs.dao.implementation;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.lgs.dao.AuthorDao;
import ua.lviv.lgs.entry.Author;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by admin on 23.06.2016.
 */
@Repository
public class AuthorDaoImpl implements AuthorDao {


    @PersistenceContext(unitName = "qwerty")
    private EntityManager entityManager;

    @Transactional
    public void  add(Author author) {
        entityManager.persist(author);

    }

    @Transactional
    public void delete(Author author){
        entityManager.remove(author);

    }
}
