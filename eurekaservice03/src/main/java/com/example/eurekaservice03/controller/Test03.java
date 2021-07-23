package com.example.eurekaservice03.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test03 {
    @RequestMapping("service3")
    public String test() {
        return "服务3";
    }
}
