package com.qf.exam.service;

import com.qf.exam.pojo.Teacher;

import java.util.List;

public interface ITeacherService {

    List<Teacher> getTeacherAll();//获取老师表所有数据

    String updateTeacher(Teacher teacher);//修改老师信息

    String saveTeacher(Teacher teacher);//添加老师信息

    String deleteTeacher(int id);//删除老师信息
}
