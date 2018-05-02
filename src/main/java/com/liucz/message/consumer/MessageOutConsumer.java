package com.liucz.message.consumer;

import net.sf.json.JSONObject;
import org.apache.activemq.command.ActiveMQObjectMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageOutConsumer {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    // 使用JmsListener配置消费者监听的队列，其中text是接收到的消息
    @JmsListener(destination = "message.out.queue", containerFactory = "jmsListenerContainerQueue")
    public void receiveQueue(String text) {

        logger.info("发送消息返回值:"+text);
        JSONObject result = JSONObject.fromObject(text);
        logger.info("返回消息："+result.getString("errmsg"));
    }

}
