package ua.lviv.lgs.Services.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.lgs.Services.AuthorService;
import ua.lviv.lgs.dao.AuthorDao;
import ua.lviv.lgs.entry.Author;
import ua.lviv.lgs.entry.Book;

/**
 * Created by admin on 23.06.2016.
 */
@Service
public class AuthorServiceImpl implements AuthorService {


    @Autowired
    private AuthorDao authorDao;

    @Transactional
    public void add(String name, String country) {
        Author author = new Author(name, country);
        authorDao.add(author);
    }
}
