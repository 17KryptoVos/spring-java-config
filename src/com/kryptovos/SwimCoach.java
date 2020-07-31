package com.kryptovos;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

    //    No autowiring needed because lack of @Component
    private FortuneService fortuneService;

    @Value("${foo.team}")
    private String team;

    @Value("${foo.email}")
    private String email;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim a triathlon";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getTeam() {
        return team;
    }

    public String getEmail() {
        return email;
    }
}
