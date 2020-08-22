package com.qf.exam.pojo;


import lombok.Data;

@Data
public class Admin {
    private int adminId;//ID
    private String adminName;//姓名
    private String sex;//年龄
    private String tel;//电话
    private String email;//邮箱
    private String pwd;//密码
    private String code;
    private String cardID;//身份证
    private String role;//角色
    private String imgurl;
}
