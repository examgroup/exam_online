package com.qf.exam.service.impl;

import com.qf.exam.dao.ITeacerDao;
import com.qf.exam.pojo.Teacher;
import com.qf.exam.service.ITeacherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class TeacherServiceImpl implements ITeacherService {
    @Resource
    private ITeacerDao td;
    @Override
    public List<Teacher> getTeacherAll() {
        return td.getTeacherAll();
    }

    @Override
    public String updateTeacher(Teacher teacher) {
       int i = td.updateTeacher(teacher);
       if(i>0){
           return "1";
       }else {
           return "0";
       }

    }

    @Override
    public String saveTeacher(Teacher teacher) {
        int i = td.saveTeacher(teacher);
        if(i>0){
            return "1";
        }else {
            return "0";
        }
    }

    @Override
    public String deleteTeacher(int id) {
        int i = td.deleteTeacher(id);
        if(i>0){
            return "1";
        }else {
            return "0";
        }
    }

    @Override
    public Teacher teacherById(int id) {
        return td.teacherById(id);
    }
}
