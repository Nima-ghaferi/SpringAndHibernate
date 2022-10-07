package com.nemo.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;
    @Override
    public String getDailyWorkout() {
        return "Practice on batting";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }


}
