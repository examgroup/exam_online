package com.qf.exam.service;

import com.qf.exam.pojo.Admin;

import java.util.List;

public interface IAdminService {
    List<Admin> getAll();
    Admin getAdminById(int adminId);
    int saveAdmin(Admin admin);
    int deleteAdmin(int adminId);
    int updateAdminById(Admin admin);
    Admin login(String adminName,String pwd);
}
