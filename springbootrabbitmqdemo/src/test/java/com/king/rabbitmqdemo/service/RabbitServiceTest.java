package com.king.rabbitmqdemo.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitServiceTest {
  @Autowired
  private RabbitService rabbitService;

  @Test
  public void send() {
    rabbitService.send();
  }

}