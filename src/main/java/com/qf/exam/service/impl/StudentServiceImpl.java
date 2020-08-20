package com.qf.exam.service.impl;

import com.qf.exam.dao.IStudentDao;
import com.qf.exam.pojo.Student;
import com.qf.exam.service.IStudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class StudentServiceImpl implements IStudentService {
    @Resource
    private IStudentDao sd;
    @Override
    public List<Student> getStudentAll() {
        return sd.getStudentAll();
    }

    @Override
    public String updateStudent(Student student) {
        int i = sd.updateStudent(student);
        if(i>0){
            return "1";
        }else {
            return "0";
        }
    }

    @Override
    public String saveStudent(Student student) {
        int i = sd.saveStudent(student);
        if(i>0){
            return "1";
        }else {
            return "0";
        }
    }

    @Override
    public String deleteStudent(int id) {
        int i = sd.deleteStudent(id);
        if(i>0){
            return "1";
        }else {
            return "0";
        }
    }

    @Override
    public Student studentById(int id) {
        return sd.studentById(id);
    }
}
