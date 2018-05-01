package com.liucz.message.servicce;

import com.liucz.message.mapper.MessageBodyMapper;
import com.liucz.message.model.message.MessageBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @Autowired
    MessageBodyMapper messageBodyMapper;

    /**
     * 插入一条消息体
     * @param messageBody
     */
    public void insert(MessageBody messageBody) throws Exception {
        //标题验证
        if(messageBody.getTitle()==null || messageBody.getTitle().isEmpty()){
            throw new Exception("标题不能为空");
        }
        //内容验证
        if(messageBody.getContent()==null || messageBody.getContent().isEmpty()){
            throw new Exception("内容不能为空");
        }
        messageBodyMapper.insertSelective(messageBody);
    }
}
