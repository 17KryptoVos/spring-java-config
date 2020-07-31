package com.kryptovos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    // Define private field for the autowiring dependency
    @Autowired
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {

        return "Practice backhand everyday";
    }

    @Override
    public String getDailyFortune() {

        // Use my fortuneService to get a fortune
        return fortuneService.getFortune();

    }
}
