package com.example.projectmq.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author cssl
 * @title HelloMQ
 * @description < TUDO >
 * @create 2023/1/31 15:15
 */
@Configuration
@Slf4j
public class HelloMQ {
    public static final String HELLO_WORLD_QUEUE_NAME = "hello_world_queue";
@Bean
Queue queue1(){
        return new Queue(HELLO_WORLD_QUEUE_NAME);
    }
}
