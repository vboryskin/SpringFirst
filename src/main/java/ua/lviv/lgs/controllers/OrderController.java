package ua.lviv.lgs.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ua.lviv.lgs.Services.OrderService;
import ua.lviv.lgs.Services.UserService;
import ua.lviv.lgs.entry.User;

import java.util.List;

/**
 * Created by vboryskin on 7/10/2016.
 */
@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/addNewOrder", method = RequestMethod.GET)
    private String addOrder(Model model){
        List<User> userList = userService.findAllUsers();
        model.addAttribute("users", userList);
        return "order-addNewOrder";
    }

    @RequestMapping(value = "/addNewOrder", method = RequestMethod.POST)
    private String createOrder(@RequestParam("orderNumber") String orderNumber,
                               @RequestParam("quantity") String quantity,
                               @RequestParam("sum") String sum,
                               @RequestParam("user") String id){
        orderService.add(Integer.parseInt(orderNumber),
                Integer.parseInt(quantity),
                Integer.parseInt(sum),
                id);
        return "redirect:/";
    }

    @RequestMapping(value = "/allOrders", method = RequestMethod.GET)
    public String allOrders(Model model){
        model.addAttribute("orders", orderService.findAllOrders());
        return "order-allOrders";
    }


}
