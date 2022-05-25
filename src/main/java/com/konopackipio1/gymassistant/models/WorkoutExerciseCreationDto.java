package com.konopackipio1.gymassistant.models;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class WorkoutExerciseCreationDto {

    private List<WorkoutExercise> workoutExerciseList;
    private String name;

    public void addWorkoutExercise(WorkoutExercise workoutExercise) {
        if (workoutExerciseList == null) {
            workoutExerciseList = new ArrayList<>();
        }
        workoutExerciseList.add(workoutExercise);
    }

}
