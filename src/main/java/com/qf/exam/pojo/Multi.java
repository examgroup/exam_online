package com.qf.exam.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Multi {
    private int questionId;//ID
    private String subject;//题目
    private String question;//问题
    private String answerA;//A
    private String answerB;//B
    private String answerC;//C
    private String answerD;//D
    private String rightAnswer;//正确答案
    private String analysis;//解析
    private int score;//成绩
    private String section;//章节
    private String level;//难度
}
