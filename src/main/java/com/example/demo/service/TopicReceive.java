package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
/**
 * 默认分发模式
 */
public class TopicReceive {

    private static Logger logger = LoggerFactory.getLogger(TopicReceive.class);

    /**
     * 监听指定对列发送的消息
     * @param str
     */
    @RabbitListener(queues="topicAgentsS")    //通过注解@RabbitListener注解的queues属性指定队列名称
    public void agentsQueue(String str) {
        logger.info("topicAgentsS:"+str);
    }

    /**
     * 监听指定对列发送的消息
     * @param str
     */
    @RabbitListener(queues="topicAgentsJ")    //通过注解@RabbitListener注解的queues属性指定队列名称
    public void fontQueue(String str) {
        logger.info("topicAgentsJ:"+str);
    }
}
