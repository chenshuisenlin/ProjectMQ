package com.example.projectmq.Direct;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author cssl
 * @title DirectReceiver
 * @description < TUDO >
 * @create 2023/2/1 09:25
 */
@Component
public class DirectReceiver {
    @RabbitListener(queues = "Direct_Queue")
    public void handler1(String msg) {
        System.out.println("DirectReceiver:" + msg);
    }
}
