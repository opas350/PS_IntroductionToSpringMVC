package com.opas350.controller;

import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by javier.reyes.valdez on 2/16/2017.
 */

@Controller
public class HelloController {

    @RequestMapping("/greeting")
    public String sayHello(Model model) {

        String x1 ;
        String x6;
        model.addAttribute("greeting", "Hello World!");

        return "hello";
    }
}
