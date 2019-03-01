package com.olegtaranenko.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class SettingGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - I was injected by the getter";
    }
}
