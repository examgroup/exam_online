package com.qf.exam.dao;

import com.qf.exam.pojo.Fill;
import com.qf.exam.pojo.Judge;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FillDao {
    List<Fill> getAll();
    Fill getFillByID(int questionId);
    int save(Fill fill);
    int delete(int questionId);
    int update(Fill fill);
    Fill getFill(int questionId);
    List<Fill> getAllFill(String subject);
}
