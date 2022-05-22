package com.konopackipio1.gymassistant.models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DummyExercisesFeed {

    public static List<Exercise> getDummyExercisesList() {
        List<Exercise> exercies = new ArrayList<>();

        exercies.add(new Exercise("Squats", MuscleGroup.LEGS));
        exercies.add(new Exercise("Bench press", MuscleGroup.CHEST));
        exercies.add(new Exercise("Deadlift", MuscleGroup.BACK));
        exercies.add(new Exercise("Biceps curl", MuscleGroup.BICEPS));
        exercies.add(new Exercise("Paraller bar dips", MuscleGroup.TRICEPS));
        exercies.add(new Exercise("Over Head Press", MuscleGroup.SHOULDERS));

        return exercies;
    }

    public static List<Exercise> getDummyExercisesList(MuscleGroup muscleGroup) {
        return getDummyExercisesList().stream()
                .filter(e -> e.getMuscleGroup().equals(muscleGroup))
                .collect(Collectors.toList());
    }

}
