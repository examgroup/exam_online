package com.qf.exam.dao;

import com.qf.exam.pojo.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IStudentDao {

    List<Student> getStudentAll();//获取老师表所有数据

    int updateStudent(Student student);//修改老师信息

    int saveStudent(Student student);//添加老师信息

    int deleteStudent(int id);//删除老师信息

    Student studentById(int id);//根据id查询相对信息


}
