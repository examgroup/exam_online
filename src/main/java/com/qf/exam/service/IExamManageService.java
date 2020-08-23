package com.qf.exam.service;

import com.qf.exam.pojo.Exam_manage;

import java.util.List;

/**
 * Created by yzx on 2020-08-19.
 */
public interface IExamManageService {

    List<Exam_manage> getAllExamManage();
    Boolean save(Exam_manage exam_manage);
    Boolean delete(int examCode);
    Boolean update(Exam_manage exam_manage);
}
