package com.example.eurekaservice02.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test02 {
    @RequestMapping("service2")
    public String test(){
        return "服务2";
    }
}
