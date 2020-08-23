package com.qf.exam.pojo;

import lombok.Data;

/**
 * Created by yzx on 2020-08-18.
 */
@Data
public class Exam_manage {
    private int examCode;
    private String description;
    private String source;
    private int paperId;
    private String examDate;
    private int totalTime;
    private String grade;
    private String term;
    private String major;
    private String institute;
    private int totalScore;
    private String type;
    private String tips;

}
