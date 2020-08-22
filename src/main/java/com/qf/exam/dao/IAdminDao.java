package com.qf.exam.dao;

import com.qf.exam.pojo.Admin;
import com.qf.exam.pojo.Permission;
import com.qf.exam.dto.RPermission;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IAdminDao {

    List<Admin> getAll();
    Admin getAdminById(int adminId);
    int saveAdmin(Admin admin);
    int deleteAdmin(int adminId);
    int updateAdminById(Admin admin);
    Admin login(String adminName,String pwd);
    List<RPermission> getRoles(String adminName);
    List<RPermission> getPermission(String adminName);
    List<RPermission> getAllRP();





}
