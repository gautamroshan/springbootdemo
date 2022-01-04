package com.torigroup.demoapp.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/website")
public class WebsiteController {
    @PostMapping
    @RequestMapping("/save")
    public String save(){
        return "Hello";
    }

}
