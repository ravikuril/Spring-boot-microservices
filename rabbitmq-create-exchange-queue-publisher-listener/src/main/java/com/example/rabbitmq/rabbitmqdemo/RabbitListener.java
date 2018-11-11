package com.example.rabbitmq.rabbitmqdemo;

import java.util.concurrent.CountDownLatch;
import org.springframework.stereotype.Component;

@Component
public class RabbitListener {

    private CountDownLatch countDownLatch = new CountDownLatch(1);

    public void receiveMessage(String message) {
        System.out.println("message = [" + message + "]");
        countDownLatch.countDown();
    }

    public CountDownLatch getCountDownLatch() {
        return countDownLatch;
    }
}
