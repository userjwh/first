package com.lanxin.MyStart;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import javax.jms.Queue;
import javax.jms.Topic;

@SpringBootApplication
@ComponentScan(basePackages = "com.lanxin")
public class MQstart {
    @Bean
    public Queue queue(){
        return new ActiveMQQueue("lanxin_queue");
    }
    @Bean
    public Topic topic(){
        return new ActiveMQTopic("lanxin_topic");
    }

    public static void main(String[] args) {
        SpringApplication.run(MQstart.class,args);
    }
}
