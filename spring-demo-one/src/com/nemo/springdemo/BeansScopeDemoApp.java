package com.nemo.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sound.midi.Soundbank;

public class BeansScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beansScope-applicationContext.xml");
        Coach coachOne = context.getBean("myCoach", TrackCoach.class);
        Coach coachTwo = context.getBean("myCoach", TrackCoach.class);

        boolean result = coachOne == coachTwo;
        System.out.println("Pointing to the same object :" + result);
        System.out.println("memory location for coachOne:" + coachOne);
        System.out.println("memory location for coachTwo:" + coachTwo);
        context.close();
    }
}
