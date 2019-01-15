package com.pixelvuejs.controller;

import io.micrometer.core.annotation.Timed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class MicrometerController {

    @Timed(
            value = "tech.hello.request",
            histogram = true,
            percentiles = {0.95,0.99},
            extraTags = {"version","1.0"}
    )

    @GetMapping("/hello")
    public String hello(){
        return "Hello prmo";
    }
}
