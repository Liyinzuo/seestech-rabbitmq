package com.example.demo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
/**
 * 分发路由规则 fanout规则 交换机(exchange)下所有队列 默认为exchange下routing key匹配
 */
public class FanoutConfig {

    private static Logger logger = LoggerFactory.getLogger(FanoutConfig.class);

    /**
     * 声明交换机和队列
     * @return
     */
    @Bean
    public Queue agentsQueue() {
        return new Queue("agentsQueue");
    }

    @Bean
    public Queue fontQueue() {
        return new Queue("fontQueue");
    }

    @Bean
    public FanoutExchange fanoutExchange() {
        return new FanoutExchange("fanoutExchange");
    }

    /**
     * 交换机和队列绑定
     */
    @Bean
    public Binding bindingAgents() {

        return BindingBuilder.bind(agentsQueue()).to(fanoutExchange());
    }

    @Bean
    public Binding bindingFont() {

        return BindingBuilder.bind(fontQueue()).to(fanoutExchange());
    }

}
