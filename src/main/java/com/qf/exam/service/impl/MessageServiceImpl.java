package com.qf.exam.service.impl;

import com.qf.exam.dao.IMessageDao;
import com.qf.exam.pojo.Message;
import com.qf.exam.service.IMessageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MessageServiceImpl implements IMessageService {

    @Resource
    private IMessageDao md;

    @Override
    public List<Message> getAllMessage() {
        return md.getAllMessage();
    }

    @Override
    public int addMessage(Message message) {
        return md.addMessage(message);
    }
}
