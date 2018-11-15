package com.galvanize.rabbitMQ.messeageSender.togmdb.demo.gmdb.sumita.mqsender;

import com.galvanize.rabbitMQ.messeageSender.togmdb.demo.gmdb.sumita.mqsender.reciever.CustomMessageReceiver;
import com.galvanize.rabbitMQ.messeageSender.togmdb.demo.gmdb.sumita.mqsender.sender.CustomMessageSender;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile({"tut1","hello-world"})
@Configuration
public class MQConfiguration {

    @Bean
    public Queue hello() {
        return new Queue("hello");
    }

    @Profile("receiver")
    @Bean
    public CustomMessageReceiver receiver() {
        return new CustomMessageReceiver();
    }

    @Profile("sender")
    @Bean
    public CustomMessageSender sender() {
        return new CustomMessageSender();
    }
}