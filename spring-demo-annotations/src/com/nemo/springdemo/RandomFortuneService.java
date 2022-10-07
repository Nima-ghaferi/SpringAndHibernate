package com.nemo.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    private  String[] fortunes = {"Fortune1", "Fortune2", "Fortune3", "Fortune4"};
    private Random random = new Random();


    @Override
    public String getFortune() {
        int index = random.nextInt(fortunes.length);
        return fortunes[index];
    }
}
