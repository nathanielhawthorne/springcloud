package com.example.eurekaservice04.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test04 {
    @RequestMapping("service4")
    public String test(){
        return "服务4";
    }
}
