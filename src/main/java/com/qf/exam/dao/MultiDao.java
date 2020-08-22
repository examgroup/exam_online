package com.qf.exam.dao;

import com.qf.exam.pojo.Judge;
import com.qf.exam.pojo.Multi;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MultiDao {
    List<Multi> getAll();
    Multi getMultiByID(int questionId);
    int save(Multi multi);
    int delete(int questionId);
    int update(Multi multi);
    Multi getMulti(int questionId);
    List<Multi> getAllMulti(String subject);
}
