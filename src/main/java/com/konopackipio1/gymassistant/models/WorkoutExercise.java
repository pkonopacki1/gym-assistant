package com.konopackipio1.gymassistant.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorkoutExercise {

    private Exercise exercise;
    private List<Integer> series;

}
