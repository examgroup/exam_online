package com.qf.exam.dao;

import com.qf.exam.pojo.ExamManage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ExamManageDao {

    List<ExamManage> getAllExamManage();
    ExamManage getExamManage(int examCode);
}
