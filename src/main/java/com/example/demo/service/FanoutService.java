package com.example.demo.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FanoutService {

    @Autowired
    RabbitTemplate rabbitTemplate;

    public void fanoutSend() {

        rabbitTemplate.convertAndSend("fanoutExchange", "", "fanout模式分发成功");
    }
}
