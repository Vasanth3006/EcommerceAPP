package com.vasanth.springWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet() {
        return "Welcome";
    }

    @RequestMapping("/about")
    public String about() {

        return "we will we will rock you";

    }
}


