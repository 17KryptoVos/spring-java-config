package com.kryptovos;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Get Happy Autowiring Fortune Service!!";
    }
}
