package com.qf.exam.controller.AdminController;

import com.qf.exam.service.impl.EmailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    EmailServiceImpl emailService;

    @RequestMapping("/sendMail")
    public Integer sendMail(@RequestParam("mail")String mail){
        System.out.println(mail);
        System.out.println(emailService.sendMail(mail));
        return emailService.sendMail(mail);
    }
}
