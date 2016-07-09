package ua.lviv.lgs.Services;

import ua.lviv.lgs.entry.User;

import java.util.List;

/**
 * Created by admin on 01.07.2016.
 */
public interface UserService {
    void add(String name, String surname, int age, String email, String userName, String password);
    List<User> findAllUsers();

    User findUserById(int id);


}
