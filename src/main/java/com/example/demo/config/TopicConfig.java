package com.example.demo.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TopicConfig {

    /**
     * topic交换机模式 在默认的基础上再添加一层过滤筛选
     * *：匹配单个字母或数字
     * #：匹配多个字母或数字
     * 常用的命名规则 agents.123 匹配agents.#
     */
    @Bean
    public Queue topicAgentsWithShanghai() {
        return new Queue("topicAgentsS");
    }

    @Bean
    public Queue topicAgentsWithJiangsu() {
        return new Queue("topicAgentsJ");
    }

    @Bean
    public TopicExchange topicExchange(){
        return new TopicExchange("topicExchange");
    }

    /**
     * 在与queue绑定
     * @return
     */
    @Bean
    public Binding topicBindingS() {
        return BindingBuilder.bind(topicAgentsWithShanghai()).to(topicExchange()).with("sh.*");
    }

    /**
     * 在与queue绑定
     * @return
     */
    @Bean
    public Binding topicBindingJ() {
        return BindingBuilder.bind(topicAgentsWithJiangsu()).to(topicExchange()).with("js.*");
    }


}
