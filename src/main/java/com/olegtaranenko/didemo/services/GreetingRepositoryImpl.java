package com.olegtaranenko.didemo.services;


import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String getEnglishGreeting() {
        return this.HELLO_OLEG + " Primary Greeting Service";
    }

    @Override
    public String getSpanishGreeting() {
        return this.HELLO_OLEG + " Servicio de Saludo Primario";
    }

    @Override
    public String getGermainGreeting() {
        return this.HELLO_OLEG + " Primärer Grußdienst";
    }

    @Override
    public String sayGreeting() {
        return null;
    }
}
