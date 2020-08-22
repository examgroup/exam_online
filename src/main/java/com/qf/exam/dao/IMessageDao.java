package com.qf.exam.dao;

import com.qf.exam.pojo.Message;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IMessageDao {

    List<Message> getAllMessage();
    int addMessage(Message message);
}
