package com.parker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ParkingController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello From Parker! Sample Text";
    }
}