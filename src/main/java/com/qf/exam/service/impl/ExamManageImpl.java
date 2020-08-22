package com.qf.exam.service.impl;

import com.qf.exam.dao.ExamManageDao;
import com.qf.exam.pojo.ExamManage;
import com.qf.exam.service.ExamManageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ExamManageImpl implements ExamManageService {

    @Resource
    private ExamManageDao examManageDao;

    @Override
    public List<ExamManage> getAllExamManage() {
        return examManageDao.getAllExamManage();
    }

    @Override
    public ExamManage getExamManage(int examCode) {
        return examManageDao.getExamManage(examCode);
    }
}
