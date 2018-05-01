package com.liucz.message.mapper;


import com.liucz.message.model.message.MessageReceiver;

public interface MessageReceiverMapper {
    int insert(MessageReceiver record);

    int insertSelective(MessageReceiver record);

    MessageReceiver selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MessageReceiver record);

    int updateByPrimaryKey(MessageReceiver record);
}