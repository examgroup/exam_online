package com.qf.exam.dao;

import com.qf.exam.pojo.Score;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by yzx on 2020-08-18.
 */
@Mapper
public interface IScoreDao {
    List<Score> getAllScore();
    Boolean save(Score score);
    Boolean delete(int scoreId);
    Boolean update(Score score);
}
