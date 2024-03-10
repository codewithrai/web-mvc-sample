package com.example.controller;

import com.example.model.User;
import com.example.service.UserSrvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpServletRequest;

@Controller
public class ContactController {
    @Autowired
    private UserSrvice userService;
    @RequestMapping("/contact")

    public String showForm () {
        return "contact";
    }
    @RequestMapping(path="/processform", method = RequestMethod.POST)
    public String handleForm(@ModelAttribute User user, Model model)
//MOdel attributes are using to accept data from user input form (Browser)
    {
        System.out.println(user);
        this.userService.createUser(user);
        return "success";
    }
//    @RequestParam("email") String userEmail ,
//    @RequestParam("userName") String userName,
//    @RequestParam("password") String userPassword,
//    Model model)
//    model.addAttribute("user", user);


//        System.out.println("User Email: "+userEmail);
//        System.out.println("User Name: "+userName);
//        System.out.println("User Password: "+userPassword);

//        model.addAttribute("name", userName);
//        model.addAttribute("email", userEmail);
//        model.addAttribute("password", userPassword);
//        User user = new User();
//        user.setEmail(userEmail);
//        user.setUserName(userName);
//        user.setPassword(userPassword);

}