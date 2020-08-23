package com.qf.exam.pojo;

import lombok.Data;

/**
 * Created by yzx on 2020-08-18.
 */
@Data
public class Score {
    private int scoreId;
    private int examCode;
    private int studentId;
    private String subject;
    private int ptScore;
    private int etScore;
    private int score;
    private String answerDate;
    private String PaperType;
}
