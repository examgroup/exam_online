package com.qf.exam.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Message {

    private int id;
    private String title;
    private String content;
    private Date time;
}
