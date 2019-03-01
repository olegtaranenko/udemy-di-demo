package com.olegtaranenko.didemo.controllers;

import com.olegtaranenko.didemo.services.GreetingService;
import com.olegtaranenko.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired public @Qualifier("greetingServiceImpl") GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
