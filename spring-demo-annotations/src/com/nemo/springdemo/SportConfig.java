package com.nemo.springdemo;

import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan("com.nemo.springdemo")
@PropertySource("sport.properties")
public class SportConfig {

    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    @Bean
    public Coach swimCoach () {
        return new SwimCoach(sadFortuneService());
    }
}
