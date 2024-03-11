package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class ReController {
    @RequestMapping ("/one")
    public RedirectView one () {
//    public String one (HttpServletResponse response) {
        System.out.println("This is one handler");
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("https://www.google.com/");
        return redirectView;
    }
    @RequestMapping ("/enjoy")
    public String two () {
        System.out.println("This is two");
        return "contact";
    }

}
