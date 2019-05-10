package com.lanxin.MQproducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Queue;
import javax.jms.Topic;

@RestController
public class producer {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;
    @Autowired
    private Queue queue;
    @Autowired
    private Topic topic;

    @RequestMapping("sendqueue")
    public String sendqueue(){
        jmsMessagingTemplate.convertAndSend(queue,"queue类型");
        return "success";
    }
    @RequestMapping("sendtopic")
    public String sendtopic(){
        jmsMessagingTemplate.convertAndSend(topic,"topic类型");
        return "success";
    }

}
