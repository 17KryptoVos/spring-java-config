package com.kryptovos;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
// Not using component scan
//@ComponentScan
public class SportConfig {

    // Define Bean for Happy Fortune Service
    @Bean
    public FortuneService happyFortuneService() {
        return new HappyFortuneService();
    }

    // Define bean for Swim Coach AND inject dependency
    @Bean
    public Coach swimCoach() { // name = Bean ID
        return new SwimCoach(happyFortuneService());
    }


}
