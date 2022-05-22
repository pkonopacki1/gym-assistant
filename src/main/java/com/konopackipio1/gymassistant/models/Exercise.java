package com.konopackipio1.gymassistant.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Exercise {

    private String name;
    private MuscleGroup muscleGroup;    
}
