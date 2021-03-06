package com.konopackipio1.gymassistant.models;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Workout {

    private String name;
    private List<WorkoutExercise> workoutExerciseList;

    public void addNewExercise(WorkoutExercise workoutExercise) {
        if(workoutExerciseList == null) {
            workoutExerciseList = new ArrayList<>();
        }
        workoutExerciseList.add(workoutExercise);
    }
    
}
