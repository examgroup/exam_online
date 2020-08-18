package com.qf.exam.controller;

import com.qf.exam.pojo.Admin;
import com.qf.exam.service.IAdminService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class AdminController {

    @Resource
    private IAdminService us;

    @GetMapping("/All")
    public List<Admin> getAll(){
        List<Admin> all = us.getAll();
        return all;
    }
}
