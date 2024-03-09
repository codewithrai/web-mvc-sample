package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping(value = "/home", method= RequestMethod.GET)
    public String home() {
        System.out.println("Hello");
        return "index";
    }

    @RequestMapping(value = "/about", method= RequestMethod.GET)
    public String about() {
        System.out.println("Hello");
        return "about";
    }
}
