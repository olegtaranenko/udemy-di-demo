package com.olegtaranenko.config;

import com.olegtaranenko.examplebeans.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

    @Value("${guru.username}")
    String user;

    @Value("${guru.password}")
    String password;

    @Value("${guru.dburl}")
    String url;

    @Bean
    public FakeDataSource PropertyConfig() {
        FakeDataSource fakedDataSource = new FakeDataSource();
        fakedDataSource.setUser(user);
        fakedDataSource.setPassword(password);
        fakedDataSource.setUrl(url);

        return fakedDataSource;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer prorperties() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
