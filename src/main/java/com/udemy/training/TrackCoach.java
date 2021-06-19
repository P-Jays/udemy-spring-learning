package com.udemy.training;

public class TrackCoach implements Coach{

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        
        return "Run 5 Km a day";
    }

    @Override
    public String getDailyFortune() {
        
        return "Hello Baby! "+this.fortuneService.getFortune();
    }

}
