package com.qf.exam.service.impl;

import com.qf.exam.service.IEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class EmailServiceImpl implements IEmailService {

    @Value("${spring.mail.username}")
    private String sendName;
    @Autowired
    JavaMailSender javaMailSender;
    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public Integer sendMail(String mail) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom(sendName);
        simpleMailMessage.setTo(mail);
        simpleMailMessage.setSubject("验证码发送");
        simpleMailMessage.setText("1234");
        try{
            javaMailSender.send(simpleMailMessage);
            redisTemplate.opsForValue().set(mail,"1234");
            redisTemplate.expire(mail,180, TimeUnit.SECONDS);
            return 1;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return 0;
        }

    }
}
