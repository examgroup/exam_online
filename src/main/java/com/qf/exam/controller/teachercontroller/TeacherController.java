package com.qf.exam.controller.teachercontroller;

import com.qf.exam.pojo.Admin;
import com.qf.exam.pojo.Teacher;
import com.qf.exam.service.IAdminService;
import com.qf.exam.service.ITeacherService;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/TeacherUpdate")
    public String updateTeacher(@RequestBody Teacher teacher){
       String a = teacherService.updateTeacher(teacher);
        return a;
    }
    @PostMapping("/TeacherSave")
    public String saveTeacher(@RequestBody Teacher teacher){
        String a = teacherService.saveTeacher(teacher);
        return a;

    }
    @GetMapping("/TeacherDelete/{id}")
    public String deleteTeacher(@PathVariable("id") int id){
        String a = teacherService.deleteTeacher(id);
        return a;

    }
    @GetMapping("/TeacherById/{id}")
    public Teacher teacherById(@PathVariable("id") int id){
        Teacher teacher = teacherService.teacherById(id);
        return teacher;
    }
}
