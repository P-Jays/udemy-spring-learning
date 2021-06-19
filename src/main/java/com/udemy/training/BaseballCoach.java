package com.udemy.training;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    // define constructor for dependency injection
    public BaseballCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        
        return "30 minutes of Batting Excercise";
    }

    @Override
    public String getDailyFortune() {
        
        return this.fortuneService.getFortune();
    }

    public void initMethod(){
        System.out.println("spring init method ");
    }

    public void destroyMethod() {
        System.out.println("spring destroy method ");
    }
    
}
