package com.torigroup.demoapp.controller;

import com.torigroup.demoapp.model.Contacts;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/website")
public class WebsiteController {
    @PostMapping
    @RequestMapping("/save")
    public String save(@RequestBody Contacts contacts)
    {
        System.out.println("Contact posted from postman");
        System.out.println("Contact name: "+ contacts.getName());
        System.out.println("Contact phone: "+ contacts.getPhone());
        System.out.println("Contact email: "+ contacts.getEmail());
        return "200 ok";
    }

}
