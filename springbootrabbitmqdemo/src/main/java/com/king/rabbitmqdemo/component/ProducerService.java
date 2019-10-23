package com.king.rabbitmqdemo.component;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author King Chen
 */
@Component
public class ProducerService {
  @Autowired
  private RabbitTemplate rabbitTemplate;

  public void send() {
    String context = "hello " + " King !";
    System.out.println("Sender : " + context);
    rabbitTemplate.convertAndSend("order.direct", "orderQueue", context);
  }


}
