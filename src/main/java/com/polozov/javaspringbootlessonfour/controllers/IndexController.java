package com.polozov.javaspringbootlessonfour.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// Устал вводить /product ))
@Controller
@RequestMapping
public class IndexController {
    @RequestMapping
    public String goToProduct(){
        return "redirect:/product";
    }
}
