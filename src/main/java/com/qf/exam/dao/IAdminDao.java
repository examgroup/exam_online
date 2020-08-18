package com.qf.exam.dao;

import com.qf.exam.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IAdminDao {

    List<Admin> getAll();
}
