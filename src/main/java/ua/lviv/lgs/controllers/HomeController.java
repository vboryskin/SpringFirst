package ua.lviv.lgs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by admin on 29.06.2016.
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)

    public String home(){
        return "home";

    }



}
