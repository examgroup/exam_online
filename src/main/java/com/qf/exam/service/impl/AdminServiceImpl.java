package com.qf.exam.service.impl;

import com.qf.exam.dao.IAdminDao;
import com.qf.exam.pojo.Admin;
import com.qf.exam.service.IAdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class AdminServiceImpl implements IAdminService {

    @Resource
    private IAdminDao ad;

    @Override
    public List<Admin> getAll() {
        return ad.getAll();
    }
}
