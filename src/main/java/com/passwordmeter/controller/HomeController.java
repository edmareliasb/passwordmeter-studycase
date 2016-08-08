package com.passwordmeter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "passwordmeter")
public class HomeController {
    
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView form() {
        return new ModelAndView("index");
    }
}