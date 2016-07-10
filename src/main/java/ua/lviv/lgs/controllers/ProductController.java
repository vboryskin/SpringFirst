package ua.lviv.lgs.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ua.lviv.lgs.Services.ProductService;
import ua.lviv.lgs.Services.UserService;
import ua.lviv.lgs.entry.User;

import java.util.List;

/**
 * Created by vboryskin on 7/10/2016.
 */
@Controller
public class ProductController {
//    @Autowired
//    private ProductService productService;
//
//    @Autowired
//    private UserService userService;
//
//    @RequestMapping(value = "/createProduct", method = RequestMethod.GET)
//    public String addProduct(Model model){
//        List<User> userList = userService.findAllUsers();
//        model.addAttribute("users", userList);
//        return "product-new";
//    }
//    @RequestMapping(value = "/createProduct", method = RequestMethod.POST)
//    private String createProduct(@RequestParam("name")String name,
//                                 @RequestParam("price") int price,
//                                 @RequestParam("specification") String specification,
//                                 @RequestParam("newProdRadioButton") String newProdRadioButton){
//        productService.add(name,price,specification);
//        return "redirect:/";
//    }
}
