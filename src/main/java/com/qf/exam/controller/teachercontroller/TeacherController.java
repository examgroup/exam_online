package com.qf.exam.controller.teachercontroller;

import com.qf.exam.pojo.Admin;
import com.qf.exam.pojo.Teacher;
import com.qf.exam.service.IAdminService;
import com.qf.exam.service.ITeacherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TeacherController {

    @Resource
    private ITeacherService teacherService;

    @GetMapping("/TeacherAll")
    public List<Teacher> getTeacherAll(){

        List<Teacher> teacherAll = teacherService.getTeacherAll();

        return teacherAll;
    }

    @GetMapping("/TeacherUpdate")
    public String updateTeacher(Teacher teacher){
       String a = teacherService.updateTeacher(teacher);
        return a;
    }
    @GetMapping("/TeacherSave")
    public String saveTeacher(Teacher teacher){
        String a = teacherService.saveTeacher(teacher);
        return a;

    }
    @GetMapping("/TeacherDelete/{id}")
    public String deleteTeacher(@PathVariable int id){
        String a = teacherService.deleteTeacher(id);
        return a;

    }
}
