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

    @GetMapping(value = "/rbSend")
    public void setRabbitTemplate () {
        sender.send();
    }

    @GetMapping(value = "/fanoutSend")
    public void fanoutSend () {
        fanoutService.fanoutSend();
    }

    @GetMapping(value = "/topicSend")
    public void topicSend () {
        topicService.topicSend();
    }
}
