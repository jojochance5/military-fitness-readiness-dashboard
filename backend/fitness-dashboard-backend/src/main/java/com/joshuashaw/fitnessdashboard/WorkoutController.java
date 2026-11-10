package com.joshuashaw.fitnessdashboard;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WorkoutController {

    private final List<Workout> workouts = new ArrayList<>();

    public WorkoutController() {

        workouts.add(
                new Workout(
                        "2026-10-30",
                        60,
                        55,
                        "14:32"
                )
        );
    }

    @GetMapping("/workouts")
    public List<Workout> getWorkouts() {
        return workouts;
    }

    @PostMapping("/workouts")
    public String addWorkout(@RequestBody Workout workout) {

        workouts.add(workout);

        return "Workout added successfully!";
    }
}