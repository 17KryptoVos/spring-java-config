package com.kryptovos;

public class SwimCoach implements Coach{

//    No autowiring needed because lack of @Component
    private FortuneService fortuneService;

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
}
