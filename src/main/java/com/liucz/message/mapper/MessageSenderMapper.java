package com.liucz.message.mapper;


import com.liucz.message.model.message.MessageSender;

public interface MessageSenderMapper {
    int insert(MessageSender record);

    int insertSelective(MessageSender record);

    MessageSender selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MessageSender record);

    int updateByPrimaryKey(MessageSender record);
}