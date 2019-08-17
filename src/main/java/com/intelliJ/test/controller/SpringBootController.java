package com.intelliJ.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootController {

    @GetMapping("healthcheck")
    public String getHeathCheck(){
        return "HealthCheck Is Working!";
    }
}
