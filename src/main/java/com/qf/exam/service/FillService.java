package com.qf.exam.service;


import com.qf.exam.pojo.Fill;
import com.qf.exam.pojo.Judge;

import java.util.List;

public interface FillService {
    List<Fill> getAll();
    Fill getFillByID(int questionId);
    boolean save(Fill fill);
    boolean delete(int questionId);
    boolean update(Fill fill);
    Fill getFill(int questionId);
    List<Fill> getAllFill(String subject);
}
