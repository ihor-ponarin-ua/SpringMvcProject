package com.nixsolutions.ponarin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//@Controller
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView adminPage() {
        ModelAndView model = new ModelAndView();
//        model.addObject("role", );
        model.setViewName("admin");
        return model;
    }
}