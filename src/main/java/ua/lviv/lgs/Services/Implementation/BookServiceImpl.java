package ua.lviv.lgs.Services.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.lgs.Services.BookService;
import ua.lviv.lgs.dao.BookDao;
import ua.lviv.lgs.entry.Book;

/**
 * Created by admin on 23.06.2016.
 */

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;


    @Transactional
    public void add(String name, int pages) {
        Book book = new Book(name, pages);
        bookDao.add(book);
    }
}
