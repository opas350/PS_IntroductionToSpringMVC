package com.opas350.controller;

import com.opas350.model.Activity;
import com.opas350.model.Exercise;
import com.opas350.service.ExerciseService;
import com.sun.javafx.sg.prism.NGShape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by javier.reyes.valdez on 2/16/2017.
 */
@Controller
public class MinutesController {

    @Autowired
    private ExerciseService exerciseService;

    @RequestMapping(value = "/addMinutes")
    public String addMinutes(@ModelAttribute("exercise") Exercise exercise) {

        System.out.println("exercise: " + exercise.getMinutes());
        System.out.println("exercise activity: " + exercise.getActivity());

        return "addMinutes";
    }

    @RequestMapping (value = "/activities", method = RequestMethod.GET)
    public @ResponseBody List<Activity> findAllActivities() {

        return exerciseService.findAllActivities();
    }

//    @RequestMapping(value = "/addMoreMinutes")
//    public String addMoreMinutes(@ModelAttribute ("exercise") Exercise exercise) {
//        System.out.println("exercising: " + exercise.getMinutes());
//
//        return "addMinutes";
//    }
}
