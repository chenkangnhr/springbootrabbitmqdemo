package com.king.rabbitmqdemo.component;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author King Chen
 */
@Component
@RabbitListener(queues = "orderQueue")
public class ConsumerService {
  @RabbitHandler
  public void process(String hello) {
    System.out.println("Receiver  : " + hello);
  }
}
