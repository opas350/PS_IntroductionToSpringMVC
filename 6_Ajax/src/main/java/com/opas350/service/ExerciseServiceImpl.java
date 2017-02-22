package com.opas350.service;

import com.opas350.model.Activity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by javier.reyes.valdez on 2/21/2017.
 */
@Service("exerciseService")
public class ExerciseServiceImpl implements ExerciseService {

        @Override
        public List<Activity> findAllActivities() {

                List<Activity> activities = new ArrayList<>();

                Activity run = new Activity();
                run.setDesc("Run");
                activities.add(run);

                Activity bike = new Activity();
                bike.setDesc("Bike");
                activities.add(bike);

                Activity swim = new Activity();
                swim.setDesc("swim");
                activities.add(swim);

                return activities;

        }
}
