package com.konopackipio1.gymassistant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String welcomeController() {
        return "welcome";
    }
    
}
