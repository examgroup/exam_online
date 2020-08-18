package com.qf.test.teacher;

import com.qf.exam.controller.teachercontroller.TeacherController;
import com.qf.exam.pojo.Teacher;
import org.junit.Test;

import java.util.List;

public class TestTeacher {

    private TeacherController tc;
    @Test
    public void test1(){

        System.out.println("hello world");
        List<Teacher> all = tc.getTeacherAll();

        System.out.println(all);


    }
}
