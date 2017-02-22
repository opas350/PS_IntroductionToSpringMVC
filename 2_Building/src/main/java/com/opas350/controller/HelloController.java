package com.opas350.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by javier.reyes.valdez on 2/16/2017.
 */

@Controller
public class HelloController {

    @RequestMapping(value="/greeting")
    public String sayHello(Model model) {

        model.addAttribute("greeting", "Hello World!");

        return "hello";
    }
}
