package com.edu.kt.gw.edu.endpoint;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackEndpoint {

    @RequestMapping("/circuitbreakerfallback")
    public String circuitbreakerfallback() {
        return "This is a fallback";
    }

}