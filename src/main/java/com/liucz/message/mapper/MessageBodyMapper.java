package com.liucz.message.mapper;


import com.liucz.message.model.message.MessageBody;

public interface MessageBodyMapper {
    int insert(MessageBody record);

    int insertSelective(MessageBody record);

    MessageBody selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MessageBody record);

    int updateByPrimaryKeyWithBLOBs(MessageBody record);

    int updateByPrimaryKey(MessageBody record);
}