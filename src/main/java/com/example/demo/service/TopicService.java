package com.example.demo.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TopicService {

    @Autowired
    RabbitTemplate rabbitTemplate;

    public void topicSend() {

        rabbitTemplate.convertAndSend("topicExchange", "sh.java", "topic模式分发成功");
    }
}
