package com.konopackipio1.gymassistant.controller;

import com.konopackipio1.gymassistant.models.Workout;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/createWorkout")
public class WorkoutDesingController {

    @GetMapping
    public String createNewWorkout() {
        return "createWorkout";
    }

    @ModelAttribute(name = "workout")
    public Workout workout() {
        return new Workout();
    }

    
}
