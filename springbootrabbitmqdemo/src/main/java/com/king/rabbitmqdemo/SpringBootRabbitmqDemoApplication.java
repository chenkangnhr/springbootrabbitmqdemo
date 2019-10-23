package com.king.rabbitmqdemo;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author King Chen
 */
@SpringBootApplication
@EnableRabbit


public class SpringBootRabbitmqDemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringBootRabbitmqDemoApplication.class, args);
  }

}
