package com.jakubduchon.webapidemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @GetMapping("/")
    String health() {
        return "BB-change - Hello students! :) The application was deployed using GitHub Actions! <3";
    }
}
