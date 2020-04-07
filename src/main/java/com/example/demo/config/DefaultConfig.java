package com.example.demo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
/**
 * 默认分发模式
 */
public class DefaultConfig {

    private static Logger logger = LoggerFactory.getLogger(DefaultConfig.class);

    /**
     * 监听指定对列发送的消息
     * @param str
     */
    @RabbitListener(queues="queue")    //通过注解@RabbitListener注解的queues属性指定队列名称
    public void processC(String str) {
        logger.info("Receive:"+str);
    }
}
