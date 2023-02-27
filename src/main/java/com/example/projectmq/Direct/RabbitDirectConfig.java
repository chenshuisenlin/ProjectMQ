package com.example.projectmq.Direct;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author cssl
 * @title RabbitDirectConfig
 * @description < TUDO >
 * @create 2023/1/31 17:07
 */
@Configuration
public class RabbitDirectConfig {
    public final static String DIRECTNAME = "javaboy-direct";
    @Bean
    Queue queue() {
        return new Queue("Direct_Queue");
    }
    @Bean
    DirectExchange directExchange() {
        return new DirectExchange(DIRECTNAME, true, false);
    }
    @Bean
    Binding binding() {
        return BindingBuilder.bind(queue())
                .to(directExchange()).with("direct");
    }
}
