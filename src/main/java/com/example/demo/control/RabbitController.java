package com.example.demo.control;

import com.example.demo.service.FanoutService;
import com.example.demo.config.DefaultConfig;
import com.example.demo.service.HelloSender;
import com.example.demo.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitController {

    @Autowired
    private HelloSender sender;
    @Autowired
    private DefaultConfig receive;
    @Autowired
    private FanoutService fanoutService;
    @Autowired
    private TopicService topicService;

    /**
     * 指定队列名称传输
     */
    @GetMapping(value = "/rbSend")
    public void setRabbitTemplate () {
        sender.send();
    }

    /**
     * 交换机和队列绑定
     */
    @GetMapping(value = "/fanoutSend")
    public void fanoutSend () {
        fanoutService.fanoutSend();
    }

    /**
     * topic交换机模式 在默认的基础上再添加一层过滤筛选
     * *：匹配单个字母或数字
     * #：匹配多个字母或数字
     * 常用的命名规则 agents.123 匹配agents.#
     */
    @GetMapping(value = "/topicSend")
    public void topicSend () {
        topicService.topicSend();
    }
}
