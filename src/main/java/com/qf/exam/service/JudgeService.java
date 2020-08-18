package com.qf.exam.service;

import com.qf.exam.pojo.Judge;

import java.util.List;

public interface JudgeService {
    List<Judge> getAll();
    Judge getJudgeByID(int questionId);
    boolean save(Judge judge);
    boolean delete(int questionId);
    boolean update(Judge judge);
}
