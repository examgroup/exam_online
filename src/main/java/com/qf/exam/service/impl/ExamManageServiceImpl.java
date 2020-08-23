package com.qf.exam.service.impl;

import com.qf.exam.dao.IExamManageDao;
import com.qf.exam.pojo.Exam_manage;
import com.qf.exam.service.IExamManageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yzx on 2020-08-19.
 */
@Service
public class ExamManageServiceImpl implements IExamManageService {
    @Resource
    private IExamManageDao emdao;


    @Override
    public List<Exam_manage> getAllExamManage() {
        return emdao.getAllExamManage();
    }

    @Override
    public Boolean save(Exam_manage exam_manage) {
        return emdao.save(exam_manage);
    }

    @Override
    public Boolean delete(int examCode) {
        return emdao.delete(examCode);
    }

    @Override
    public Boolean update(Exam_manage exam_manage) {
        return emdao.update(exam_manage);
    }


}
