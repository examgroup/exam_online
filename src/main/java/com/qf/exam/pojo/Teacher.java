package com.qf.exam.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 老师表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    private int teacherId;// id
    private String teacherName;//
    private String institute;//姓名
    private String sex;//性别
    private String tel;//电话号码
    private String email;//邮箱
    private String pwd;//密码
    private String cardId;//身份证号
    private String type;//职称
    private String role;//角色（0管理员，1教师，2学生）



}
