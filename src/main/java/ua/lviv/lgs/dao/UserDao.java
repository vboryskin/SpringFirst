package ua.lviv.lgs.dao;

import ua.lviv.lgs.entry.User;

import java.util.List;

/**
 * Created by admin on 30.06.2016.
 */
public interface UserDao {

    void add(User user);

    List<User> findAllUsers();





}
