package com.kryptovos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:mylogger.properties")
public class SportConfig {

    // Define logger
    @Bean
    public MyLoggerConfig myLoggerConfig(@Value("${root.logger.level}") String rootLoggerLevel,
                                         @Value("${printed.logger.level}") String printedLoggerLevel) {

        MyLoggerConfig myLoggerConfig = new MyLoggerConfig(rootLoggerLevel, printedLoggerLevel);

        return myLoggerConfig;
    }


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
