package com.example.holaspring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaSpringController {

    @GetMapping("/hola")
    public String holaSpring() {
        return "¡Hola Spring!";
    }
}