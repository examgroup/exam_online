package com.qf.exam.service;

import com.qf.exam.pojo.Multi;

import java.util.List;

public interface MultiService {
    List<Multi> getAll();
    Multi getMultiByID(int questionId);
    boolean save(Multi multi);
    boolean delete(int questionId);
    boolean update(Multi multi);
}
