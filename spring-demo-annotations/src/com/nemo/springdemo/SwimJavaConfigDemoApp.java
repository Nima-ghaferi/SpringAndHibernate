package com.nemo.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
        Coach swimCoach = context.getBean("swimCoach", Coach.class);//--Load bean with custom name
        System.out.println(swimCoach.getDailyWorkout());
        System.out.println(swimCoach.getDailyFortune());

        System.out.println("------------------------------------------------");
        System.out.println(((SwimCoach)swimCoach).getEmail());
        System.out.println(((SwimCoach)swimCoach).getTeam());

        context.close();
    }
}
