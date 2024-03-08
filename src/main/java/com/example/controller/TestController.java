package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/home")
public class TestController {

    @RequestMapping(method= RequestMethod.GET)
    @ResponseBody
    public String hello() {
        return "Welcome to Spring MVC";
    }
}
