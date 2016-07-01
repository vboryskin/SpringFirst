package ua.lviv.lgs.dao.implementation;

import org.springframework.transaction.annotation.Transactional;
import ua.lviv.lgs.dao.BookDao;
import ua.lviv.lgs.entry.Book;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by admin on 23.06.2016.
 */
public class BookDaoImpl implements BookDao {
    @PersistenceContext(unitName = "qwerty")
    private EntityManager entityManager;



    @Transactional
    public void add(Book book) {
        entityManager.persist(book);

    }
}
