package com.jamesqi.restservice.RestApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePageController {
    @RequestMapping("/")
    public String homePage() {
        return "Welcome!This is the home page!";
    }
}
