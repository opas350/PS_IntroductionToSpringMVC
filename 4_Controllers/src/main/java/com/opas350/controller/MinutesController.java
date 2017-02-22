package com.opas350.controller;

import com.opas350.model.Exercise;
import com.sun.javafx.sg.prism.NGShape;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by javier.reyes.valdez on 2/16/2017.
 */
@Controller
public class MinutesController {

    @RequestMapping(value = "/addMinutes")
    public String addMinutes(@ModelAttribute("exercise") Exercise exercise) {

        System.out.println("exercise: " + exercise.getMinutes());

        return "addMinutes";
    }

//    @RequestMapping(value = "/addMoreMinutes")
//    public String addMoreMinutes(@ModelAttribute ("exercise") Exercise exercise) {
//        System.out.println("exercising: " + exercise.getMinutes());
//
//        return "addMinutes";
//    }
}
