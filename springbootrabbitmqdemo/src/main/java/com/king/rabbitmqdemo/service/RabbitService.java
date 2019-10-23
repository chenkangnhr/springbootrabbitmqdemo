package com.king.rabbitmqdemo.service;

import com.king.rabbitmqdemo.component.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author King Chen
 */

@Service
public class RabbitService {
  @Autowired
  private ProducerService producerService;

  public void send() {
    producerService.send();
  }

}
