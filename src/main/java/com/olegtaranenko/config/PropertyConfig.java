package com.olegtaranenko.config;

import com.olegtaranenko.examplebeans.FakeDataSource;
import com.olegtaranenko.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropertyConfig {
    @Value("${guru.username}")
    String user;

    @Value("${guru.password}")
    String password;

    @Value("${guru.dburl}")
    String url;

    @Value("${guru.jms.username}")
    String jmsUser;

    @Value("${guru.jms.password}")
    String jmsPassword;

    @Value("${guru.jms.dburl}")
    String jmsUrl;


    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakedDataSource = new FakeDataSource();
        fakedDataSource.setUser(user);
        fakedDataSource.setPassword(password);
        fakedDataSource.setUrl(url);

        return fakedDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker fakedJmsBroker = new FakeJmsBroker();
        fakedJmsBroker.setUser(jmsUser);
        fakedJmsBroker.setPassword(jmsPassword);
        fakedJmsBroker.setUrl(jmsUrl);

        return fakedJmsBroker;
    }
}
