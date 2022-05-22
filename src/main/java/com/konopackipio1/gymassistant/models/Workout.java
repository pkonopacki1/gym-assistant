package com.konopackipio1.gymassistant.models;

import java.util.List;

import lombok.Data;

@Data
public class Workout {

    private String name;
    private List<WorkoutExercise> workoutExercise;
    
}
