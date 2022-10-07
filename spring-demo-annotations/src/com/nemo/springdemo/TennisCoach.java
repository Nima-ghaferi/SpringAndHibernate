package com.nemo.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component()
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println("TennisCoach: Inside the default constructor ...");
    }

    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println("TrackCoach: inside method doMyStartupStuff ...");
    }

    @PreDestroy
    public void doMyDestroyStuff() {
        System.out.println("TrackCoach: inside method doMyDestroyStuff ...");
    }

    //    @Autowired
//    public TennisCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

//    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("TennisCoach: Inside the setFortuneService method ...");
        this.fortuneService = fortuneService;
    }
}
