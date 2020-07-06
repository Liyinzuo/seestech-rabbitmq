package com.example.demo.config;

import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitmqConfig {

    /*@Bean("connectionFactory")
    public CachingConnectionFactory cachingConnectionFactory() {
        CachingConnectionFactory cachingConnectionFactory = new CachingConnectionFactory();
        cachingConnectionFactory.setChannelCacheSize(50);
        return cachingConnectionFactory;
    }*/

    @Bean
    public CachingConnectionFactory ccf() {
        CachingConnectionFactory ccf = new CachingConnectionFactory();
        ccf.setAddresses("121.36.166.92:5672");
        return ccf;
    }
}
