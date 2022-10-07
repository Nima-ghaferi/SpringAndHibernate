package com.nemo.springdemo;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public void doMyStartupStuff() {
        System.out.println("TrackCoach: inside method doMyStartupStuff ...");
    }

    public void doMyDestroyStuff() {
        System.out.println("TrackCoach: inside method doMyDestroyStuff ...");
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k.";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it: " + fortuneService.getFortune();
    }
}
