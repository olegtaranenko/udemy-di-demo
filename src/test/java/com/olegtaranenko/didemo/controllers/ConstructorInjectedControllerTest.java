package com.olegtaranenko.didemo.controllers;

import com.olegtaranenko.didemo.services.GreetingService;
import com.olegtaranenko.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConstructorInjectedControllerTest {
    private ConstructorInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception{
        this.propertyInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals(GreetingService.HELLO_OLEG, propertyInjectedController.sayHello());
    }
}
