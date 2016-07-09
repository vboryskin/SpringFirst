package ua.lviv.lgs.dao;

import org.jboss.logging.annotations.Param;
import ua.lviv.lgs.entry.User;

import java.util.List;

/**
 * Created by admin on 30.06.2016.
 */
public interface UserDao
//        extends  JpaRepository<User, Integer>
{

    void add(User user);

    List<User> findAllUsers();



//    User findUserByLogin(@Param("login")String login);

    User findOne(int id);



}
