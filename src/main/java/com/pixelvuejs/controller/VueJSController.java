package com.pixelvuejs.controller;

import io.micrometer.core.annotation.Timed;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Timed
public class VueJSController {

    @GetMapping("/")
    public String welcomeVueJs(Model model){
        model.addAttribute("message","msg");
        return "index";
    }
}
