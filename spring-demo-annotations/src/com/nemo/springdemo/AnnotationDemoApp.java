package com.nemo.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach tennisCoach = context.getBean("thatSillyCoach", Coach.class);//--Load bean with custom name
        System.out.println(tennisCoach.getDailyWorkout());
        System.out.println(tennisCoach.getDailyFortune());

        Coach baseballCoach = context.getBean("baseballCoach", Coach.class);//--Load bean with default bean name
        System.out.println(baseballCoach.getDailyWorkout());
        System.out.println(baseballCoach.getDailyFortune());

        context.close();
    }
}
