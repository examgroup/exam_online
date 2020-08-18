package com.qf.exam.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int studentId;//id
    private String studentName;//姓名
    private String grade;//年级
    private String major;//专业
    private String clazz;//班级
    private String institute;//学院
    private String tel;//电话号码
    private String email;//电子邮件
    private String pwd;//密码
    private String cardId;//身份证
    private String sex;//性别
    private String role;//角色(0管理员，1教师，2学生)

}
