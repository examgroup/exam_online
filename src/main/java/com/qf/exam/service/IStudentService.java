package com.qf.exam.service;

import com.qf.exam.pojo.Student;

import java.util.List;

public interface IStudentService {
    List<Student> getStudentAll();//获取老师表所有数据

    String updateStudent(Student student);//修改老师信息

    String saveStudent(Student student);//添加老师信息

    String deleteStudent(int id);//删除老师信息
}
