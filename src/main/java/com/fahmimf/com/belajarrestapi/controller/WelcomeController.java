package com.fahmimf.com.belajarrestapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fahmimf.com.belajarrestapi.dto.Request;

@RestController
@RequestMapping("api/welcome")
public class WelcomeController {

    //POST  
    @PostMapping
    public String postData(@RequestBody Request request) {
        return "Halo, selamat datang " + request.getName();
    }

    //GET
    @GetMapping
    @RequestMapping("/get")
    public String getData(){
        return "Ini get method";
    }

    //PUT
    @PutMapping
    public Request updateData(@RequestBody Request request){
        return request;
    }

    @PostMapping
    @RequestMapping("/parameter")
    public Long postParameter(@RequestParam Long x, @RequestParam long y){
        return x + y;
    }
    
}
