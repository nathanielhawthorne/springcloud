package com.example.eurekaservice01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test01 {
    @RequestMapping("service1")
    public String test(){
        return "服务1";
    }
}
