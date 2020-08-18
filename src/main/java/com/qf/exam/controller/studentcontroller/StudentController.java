package com.qf.exam.controller.studentcontroller;

import com.qf.exam.pojo.Student;
import com.qf.exam.service.IStudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/StudentUpdate")
    public String updateStudent(Student student){
        String a = ss.updateStudent(student);
        return a;
    }
    @GetMapping("/StudentSave")
    public String saveStudent(Student student){
        String a = ss.saveStudent(student);
        return a;

    }
    @GetMapping("/StudentDelete/{id}")
    public String deleteStudent(@PathVariable int id){
        String a = ss.deleteStudent(id);
        return a;

    }
}
