package com.recipe.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @PostMapping("/post")
    public void getName(@RequestBody String name){
        System.out.println("here is the post method "+name);
    }
}
