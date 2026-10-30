package com.joshuashaw.fitnessdashboard;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WorkoutController {

    @GetMapping("/workouts")
    public List<Workout> getWorkouts() {

        return List.of(
                new Workout(
                        "2026-10-30",
                        60,
                        55,
                        "14:32"
                )
        );
    }
}