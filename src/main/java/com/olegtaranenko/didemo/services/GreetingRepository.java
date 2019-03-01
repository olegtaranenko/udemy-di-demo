package com.olegtaranenko.didemo.services;

public interface GreetingRepository extends GreetingService {
    String getEnglishGreeting();

    String getSpanishGreeting();

    String getGermainGreeting();
}
