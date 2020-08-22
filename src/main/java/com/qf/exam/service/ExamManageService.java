package com.qf.exam.service;

import com.qf.exam.dao.ExamManageDao;
import com.qf.exam.pojo.ExamManage;

import java.util.List;

public interface ExamManageService {
    List<ExamManage> getAllExamManage();
    ExamManage getExamManage(int examCode);
}
