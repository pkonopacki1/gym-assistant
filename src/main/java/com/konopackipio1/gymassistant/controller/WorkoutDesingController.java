package com.konopackipio1.gymassistant.controller;

import java.util.List;

import com.konopackipio1.gymassistant.models.DummyExercisesFeed;
import com.konopackipio1.gymassistant.models.Exercise;
import com.konopackipio1.gymassistant.models.Workout;
import com.konopackipio1.gymassistant.models.WorkoutExercise;
import com.konopackipio1.gymassistant.models.WorkoutExerciseCreationDto;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/createWorkout")
public class WorkoutDesingController {

    // todo: dodaj wyświetlanie danych

    private List<Workout> workouts;

    @GetMapping
    public String createNewWorkout() {
        return "createWorkout";
    }

    @ModelAttribute(name = "form")
    public WorkoutExerciseCreationDto workoutExerciseCreationDto() {
        WorkoutExerciseCreationDto workoutExercisesForm = new WorkoutExerciseCreationDto();

        for (int i = 1; i <= 3; i++) {
            workoutExercisesForm.addWorkoutExercise(new WorkoutExercise());
        }

        return workoutExercisesForm;
    }

    @ModelAttribute(name = "exercises")
    public List<Exercise> exercises() {
        return DummyExercisesFeed.getDummyExercisesList();
    }

}
