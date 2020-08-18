package com.qf.exam.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Fill {
    private int questionId;//试题编号
    private String subject;//考试科目
    private String question;//试题内容
    private String answer;//正确答案
    private String analysis;//题目解析
    private int score;//分数
    private String level;//难度等级
    private String section;//所属章节

}
