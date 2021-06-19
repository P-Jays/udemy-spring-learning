package com.udemy.training;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    private String emailAddress;

    private String team;

    public CricketCoach() {
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        System.out.println("Spring do the setter email address");
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
        System.out.println("Spring do the setter team");
    }

    @Override
    public String getDailyWorkout() {
        return "Training for to bowl hahah";
    }

    @Override
    public String getDailyFortune() {
        return "Cricket !"+fortuneService.getFortune();
    }
    
}
