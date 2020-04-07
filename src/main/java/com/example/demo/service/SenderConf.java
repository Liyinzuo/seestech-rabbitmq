package com.example.demo.service;

import org.springframework.context.annotation.Bean;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SenderConf {

    @Bean
    public Queue queue() {
        return new Queue("queue");   //创建一个新的队列并指定名称注入到Spring容器中管理
    }
}
