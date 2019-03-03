package com.olegtaranenko.config;

import com.olegtaranenko.examplebeans.FakeDataSource;
import com.olegtaranenko.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties"),

})
public class PropertyConfig {

    @Autowired
    Environment env;

    @Value("${guru.username}")
    String user;

    @Value("${guru.password}")
    String password;

    @Value("${guru.dburl}")
    String url;

    @Value("${jms.username}")
    String jmsUser;

    @Value("${jms.password}")
    String jmsPassword;

    @Value("${jms.dburl}")
    String jmsUrl;


    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakedDataSource = new FakeDataSource();
        fakedDataSource.setUser(env.getProperty("GURU_USERNAME"));
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

    @Bean
    public static PropertySourcesPlaceholderConfigurer prorperties() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
