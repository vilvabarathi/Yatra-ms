package com.example.Yatra_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class flight {
    @GetMapping("/flight")
    public String getData() {return  "Please book your flight ticket from yatra app on  20% discount" ; }
}