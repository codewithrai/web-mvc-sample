package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
public class TestController {


    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("Hello");

        model.addAttribute("name", "Shafique Anwar");
        model.addAttribute("id",1398);
        model.addAttribute("City", "Swabi");

//        List<String> family = new ArrayList<String>();
//        family.add("Saim");
//        family.add("Abeeha");
//
//        model.addAttribute("f",family);

        return "index";
    }

    @RequestMapping("/about")
    public String about() {
        System.out.println("Hello");
        return "about";
    }
    @RequestMapping(path="/help", method = RequestMethod.GET)
    public ModelAndView help() {
        System.out.println("This is help Controller");
//        Setting object
        ModelAndView modelAndView= new ModelAndView();

        modelAndView.addObject("name", "Shafique");
        modelAndView.addObject("id", 1398);

        LocalDateTime now = LocalDateTime.now();
        modelAndView.addObject("time",now);
        List<Integer> list = new ArrayList<Integer>();
        list.add(1234);
        list.add(19888);
        list.add(900);
        list.add(1234);

        modelAndView.addObject("marks",list);
        //        Setting the view name

        modelAndView.setViewName("help");
        return modelAndView;
    }
}
