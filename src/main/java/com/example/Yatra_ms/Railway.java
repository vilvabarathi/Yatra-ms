package com.example.Yatra_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Railway {
    @GetMapping("/railway")
    public String getData() {return  "Please book your railway ticket from yatra app on  20% discount" ; }
}