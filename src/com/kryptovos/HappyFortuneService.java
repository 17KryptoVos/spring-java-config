package com.kryptovos;

public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {

        return "Get Happy Fortune Service, withouder @Component and @Autowiring needed!";
    }
}
