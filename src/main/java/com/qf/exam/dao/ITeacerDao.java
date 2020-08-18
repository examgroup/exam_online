package com.qf.exam.dao;

import com.qf.exam.pojo.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ITeacerDao {

    List<Teacher> getTeacherAll();//获取老师表所有数据

    int updateTeacher(Teacher teacher);//修改老师信息

    int saveTeacher(Teacher teacher);//添加老师信息

    int deleteTeacher(int id);//删除老师信息
}
