package com.example.projectmq.config;

import com.rabbitmq.client.Channel;
import lombok.extern.slf4j.Slf4j;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.stereotype.Component;

/**
 * @author cssl
 * @title Consumer
 * @description < TUDO >
 * @create 2023/1/31 15:28
 */
@Component
@Slf4j
public class Consumer {
    /*@RabbitListener(queues = HelloMQ.HELLO_WORLD_QUEUE_NAME)
    public void receive(String msg) {
        log.info("receive1 = " + msg+"------->"+Thread.currentThread().getName());
    }

    @RabbitListener(queues = HelloMQ.HELLO_WORLD_QUEUE_NAME,concurrency = "10")
    public void receive2(String msg) {
        log.info("receive2 = " + msg+"------->"+Thread.currentThread().getName());
    }*/

}
