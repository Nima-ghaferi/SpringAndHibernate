package com.nemo.springdemo;

public class MyApp {
    public static void main(String[] args) {
        FortuneService fortuneService = new HappyFortuneService();
        Coach coach = new TrackCoach(fortuneService);
        System.out.println(coach.getDailyWorkout());
    }
}
