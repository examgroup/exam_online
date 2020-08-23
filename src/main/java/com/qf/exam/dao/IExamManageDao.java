package com.qf.exam.dao;

import com.qf.exam.pojo.Exam_manage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by yzx on 2020-08-18.
 */
@Mapper
public interface IExamManageDao {
    List<Exam_manage> getAllExamManage();
    Boolean save(Exam_manage exam_manage);
    Boolean delete(int examCode);
    Boolean update(Exam_manage exam_manage);
}
