package com.qf.exam.dao;

import com.qf.exam.pojo.Judge;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface JudgeDao {
    List<Judge> getAll();
    Judge getJudgeByID(int questionId);
    int save(Judge judge);
    int delete(int questionId);
    int update(Judge judge);
}
