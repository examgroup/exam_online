package com.qf.exam.controller.MessageController;

import com.qf.exam.pojo.Message;
import com.qf.exam.service.IMessageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class MessageController {

    @Resource
    private IMessageService ms;

    @GetMapping("/getAllMessage")
    public List<Message> getAllMessage(){

        List<Message> allMessage = ms.getAllMessage();
        return allMessage;

    }


    @PostMapping("/addMessage")
    public Integer addMessage(@RequestBody Message message){

        int i = ms.addMessage(message);

        if(i >0){
            return 1;
        }
        return 0;
    }
}
