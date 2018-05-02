package com.liucz.message.consumer;

import com.liucz.message.base.Template;
import com.liucz.message.producer.Producer;
import net.sf.json.JSONObject;
import org.apache.activemq.command.ActiveMQObjectMessage;
import org.apache.activemq.command.ActiveMQQueue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.jms.JMSException;

@Component
public class MessageConsumer {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    // 使用JmsListener配置消费者监听的队列，其中text是接收到的消息
    @JmsListener(destination = "message.queue", containerFactory = "jmsListenerContainerQueue")
    @SendTo("message.out.queue")
    public String receiveQueue1(ActiveMQObjectMessage message) throws JMSException {

        Template template = (Template) message.getObject();
        logger.info("发送消息:" + template.toString());

        JSONObject result = new JSONObject();
        result.put("errcode",0);
        result.put("errmsg","ok");
        result.put("msgid",200228332);

        //不支持发送JSON对象，所以转为String类型
        return result.toString();

    }

}