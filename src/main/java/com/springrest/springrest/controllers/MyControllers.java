package com.springrest.springrest.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.springrest.springrest.models.User;
import com.springrest.springrest.services.Services;

@RestController
public class MyControllers {

    private Services userServices;

    @Autowired
    public MyControllers(Services userServices) {
        this.userServices = userServices;
    }

    @GetMapping("/")
    public String home() {
        return "Server is working.";
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return this.userServices.getAllUsers();
    }

    @GetMapping("/users/{userId}")
    public User getUser(@PathVariable String userId){
        return this.userServices.getUser(Long.parseLong(userId));
    }
}
