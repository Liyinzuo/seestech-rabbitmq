package com.example.demo;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	private static Logger logger = LoggerFactory.getLogger(DemoApplicationTests.class);
	private final static String QUEUE_NAME = "hello";

	@Test
	void contextLoads() {

	}

}
