package io.rui.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/status")
    public String getStatus() {
        return "service is up.";
    }
}
