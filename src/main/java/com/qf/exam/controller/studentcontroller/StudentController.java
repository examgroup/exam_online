package com.qf.exam.controller.studentcontroller;

import com.qf.exam.pojo.Student;
import com.qf.exam.service.IStudentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class StudentController {

    @Resource
    private IStudentService ss;

    @GetMapping("/StudentAll")
    public List<Student> getStudentAll(){

        List<Student> teacherAll = ss.getStudentAll();

        return teacherAll;
    }

    @PostMapping("/StudentUpdate")
    public String updateStudent(@RequestBody Student student){
        String a = ss.updateStudent(student);
        return a;
    }
    @PostMapping("/StudentSave")
    public String saveStudent(@RequestBody Student student){
        String a = ss.saveStudent(student);
        return a;

    }
    @GetMapping("/StudentDelete/{id}")
    public String deleteStudent(@PathVariable("id") int id){
        String a = ss.deleteStudent(id);
        return a;

    }
    @GetMapping("/StudentById/{id}")
    public Student studentById(@PathVariable("id") int id){
        Student student = ss.studentById(id);
        return student;
    }
}
