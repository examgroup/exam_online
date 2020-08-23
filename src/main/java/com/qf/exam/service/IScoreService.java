package com.qf.exam.service;

import com.qf.exam.pojo.Score;

import java.util.List;

/**
 * Created by yzx on 2020-08-19.
 */
public interface IScoreService {

    List<Score> getAllScore();
    Boolean save(Score score);
    Boolean delete(int scoreId);
    Boolean update(Score score);
}
