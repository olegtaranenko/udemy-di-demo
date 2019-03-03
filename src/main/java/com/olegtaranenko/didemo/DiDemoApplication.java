package com.olegtaranenko.didemo;

import com.olegtaranenko.didemo.controllers.ConstructorInjectedController;
import com.olegtaranenko.didemo.controllers.MyController;
import com.olegtaranenko.didemo.controllers.PropertyInjectedController;
import com.olegtaranenko.didemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.olegtaranenko.services", "com.olegtaranenko.didemo", "com.olegtaranenko.config"})
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
        MyController controller = (MyController) ctx.getBean("myController");

        System.out.println(controller.hello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }

}
