package com.liucz.message.producer;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class Producer {

    @Resource
    private ActiveMQQueue messageQueue;
    @Resource
    private ActiveMQQueue logQueue;

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    // 发送消息，destination是发送到的队列，message是待发送的消息
    public void sendMessage(final Object message) {
        jmsMessagingTemplate.convertAndSend(messageQueue, message);
    }

    // 发送消息，destination是发送到的队列，message是待发送的消息
    public void sendLog(final Object message) {
        jmsMessagingTemplate.convertAndSend(logQueue, message);
    }


}
