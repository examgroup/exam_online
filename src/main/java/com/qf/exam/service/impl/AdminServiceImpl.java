package com.qf.exam.service.impl;

import com.qf.exam.dao.IAdminDao;
import com.qf.exam.dto.RPermission;
import com.qf.exam.pojo.Admin;
import com.qf.exam.pojo.Permission;
import com.qf.exam.pojo.Role;
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

    @Override
    public Admin getAdminById(int adminId) {
        return ad.getAdminById(adminId);
    }

    @Override
    public int saveAdmin(Admin admin) {
        return ad.saveAdmin(admin);
    }

    @Override
    public int deleteAdmin(int adminId) {
        return ad.deleteAdmin(adminId);
    }

    @Override
    public int updateAdminById(Admin admin) {
        return ad.updateAdminById(admin);
    }

    @Override
    public Admin login(String adminName, String pwd) {
        return ad.login(adminName, pwd);
    }

    @Override
    public List<RPermission> getRoles(String adminName) {
        return ad.getRoles(adminName);
    }

    @Override
    public List<RPermission> getPermission(String adminName) {
        return ad.getPermission(adminName);
    }

    @Override
    public List<RPermission> getAllRP() {
        return ad.getAllRP();
    }


}
