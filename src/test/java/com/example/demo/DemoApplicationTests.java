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
		/*logger.info("进入测试了没有阿");
		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost("192.168.1.18");
		try {
			Connection connection = factory.newConnection();
			logger.info("尝试连接");
			Channel channel = connection.createChannel();
			logger.info("创建通道");
			channel.queueDeclare(QUEUE_NAME, false, false, false, null);
			String message = "Hello World!";
			channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
			logger.info(" [x] Sent '" + message + "'");
		} catch (Exception e) {

		}*/

	}

}
