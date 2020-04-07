package com.example.demo.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
/**
 * 默认分发模式
 */
public class HelloSender {

    @Autowired
    RabbitTemplate rabbitTemplate;

    /**
     * 发送队列消息
     */
    public void send() {
        rabbitTemplate.convertAndSend("queue"/*指定队列名称*/,"hello,rabbit~"/*指定传入队列的内容*/);
    }

}
