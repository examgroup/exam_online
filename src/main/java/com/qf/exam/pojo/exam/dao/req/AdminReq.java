package com.qf.exam.pojo.exam.dao.req;

import lombok.Data;

@Data
public class AdminReq {

    private String adminName;
    private String email;
    private String code;
    private String password;

}
