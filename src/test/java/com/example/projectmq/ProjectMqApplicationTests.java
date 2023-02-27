package com.example.projectmq;

import com.example.projectmq.config.HelloMQ;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProjectMqApplicationTests {
    @Autowired
    RabbitTemplate rabbitTemplate;
    @Test
    void contextLoads() {
        for (int i = 0; i < 100; i++) {
            rabbitTemplate.convertAndSend(HelloMQ.HELLO_WORLD_QUEUE_NAME, "hello"+i);
        }
    }
    @Test
    public void directTest() {
        rabbitTemplate.convertAndSend("Direct_Queue", "hello direct!");
    }

}
