package ua.lviv.lgs.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ua.lviv.lgs.Services.UserService;
import ua.lviv.lgs.entry.User;

import java.util.List;

/**
 * Created by admin on 01.07.2016.
 */
@Controller
public class UserController {

    @Autowired
    public UserService userService;

    @RequestMapping(value = "/allUsers", method = RequestMethod.GET)
    private String usersAll(Model model){
        List<User> userList = userService.findAllUsers();
        model.addAttribute("users", userList);
        return "usersAll";
    }
    @RequestMapping(value = "userNew", method = RequestMethod.GET)
    private String userNew(){

        return "newUser";

    }
    @RequestMapping(value = "createUser", method = RequestMethod.POST)
    private String createNewUser(@RequestParam("name")String name,@RequestParam("surname")String surname, @RequestParam("age")int age, @RequestParam("email")String email, @RequestParam("userName")String userName, @RequestParam("password")String password){

        userService.add(name, surname, age, email, userName, password);
        return "redirect:";
    }

}
