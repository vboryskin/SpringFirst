package ua.lviv.lgs.Services.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.lgs.Services.UserService;
import ua.lviv.lgs.dao.UserDao;
import ua.lviv.lgs.entry.User;

import java.util.List;

/**
 * Created by admin on 01.07.2016.
 */
@Service
public class UserServiceImpl implements UserService{
    public User findUserById(int id) {
        return userDao.findOne(id);
    }

    @Autowired
    private UserDao userDao;

    @Transactional
    public void add(String name, String surname, int age, String email, String userName, String password){
        User user = new User(name, surname, age, email, userName, password);
        userDao.add(user);
    }

    @Transactional
    public List<User> findAllUsers() {
        return userDao.findAllUsers();

    }

}
