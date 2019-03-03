package com.olegtaranenko.didemo;

import com.olegtaranenko.didemo.controllers.ConstructorInjectedController;
import com.olegtaranenko.didemo.controllers.MyController;
import com.olegtaranenko.didemo.controllers.PropertyInjectedController;
import com.olegtaranenko.didemo.controllers.SetterInjectedController;
import com.olegtaranenko.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.olegtaranenko"})
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
        MyController controller = (MyController) ctx.getBean("myController");

        FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);

        System.out.println(fakeDataSource.getUser());

    }

}
