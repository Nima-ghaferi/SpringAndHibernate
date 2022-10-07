package com.nemo.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach tennisCoach1 = context.getBean("tennisCoach", Coach.class);
        Coach tennisCoach2 = context.getBean("tennisCoach", Coach.class);

        boolean result = tennisCoach1 == tennisCoach2;
        System.out.println("Result: " + result);
        System.out.println("Tennis1: " + tennisCoach1);
        System.out.println("Tennis2: " + tennisCoach2);

        context.close();
    }
}
