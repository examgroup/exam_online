package com.qf.exam.service;

import com.qf.exam.pojo.Message;

import java.util.List;

public interface IMessageService {

    List<Message> getAllMessage();
    int addMessage(Message message);
}
