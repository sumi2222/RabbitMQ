package com.galvanize.rabbitMQ.messeageSender.togmdb.demo.gmdb.sumita.mqsender.reciever;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

@RabbitListener(queues = "hello")

public class CustomMessageReceiver {

    @RabbitHandler
    public void receive(String in) {
        System.out.println(" [x] Received '" + in + "'");
    }

}
