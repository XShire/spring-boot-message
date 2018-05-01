package com.liucz.message.service;

import com.liucz.message.model.message.MessageBody;
import com.liucz.message.servicce.MessageService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MessageServiceTest {

    @Autowired
    MessageService messageService;

    /**
     * 插入一条消息体
     * @param
     */
    @Test
    public void insert() throws Exception {

        MessageBody messageBody = new MessageBody();
        messageBody.setTitle("消息标题");
        messageBody.setContent("消息内容");

        messageService.insert(messageBody);

    }

}
