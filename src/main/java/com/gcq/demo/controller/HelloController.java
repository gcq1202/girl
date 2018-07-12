package com.gcq.demo.controller;

import com.gcq.demo.bean.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
//@RequestMapping
public class HelloController {
    @Value("${cupS}")
    private String cupSize;
    @Autowired
    private GirlProperties girlProperties;

    @GetMapping("hello")
    @RequestMapping
    public String hello(){
        return girlProperties.getCupSize()+girlProperties.getAge();
    }
}
