package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class TestController {


    @GetMapping("/home")
    public String home() {
        System.out.println("Hello");
        return "index";
    }

    @GetMapping("/about")
    public String about() {
        System.out.println("Hello");
        return "about";
    }
}
