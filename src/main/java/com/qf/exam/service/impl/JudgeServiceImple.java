package com.qf.exam.service.impl;

import com.qf.exam.dao.JudgeDao;
import com.qf.exam.pojo.Judge;
import com.qf.exam.service.JudgeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class JudgeServiceImple implements JudgeService {
    @Resource
    private JudgeDao judgeDao;

    @Override
    public List<Judge> getAll() {
        return judgeDao.getAll();
    }

    @Override
    public Judge getJudgeByID(int questionId) {
        return judgeDao.getJudgeByID(questionId);
    }

    @Override
    public boolean save(Judge judge) {
        return judgeDao.save(judge) > 0;
    }

    @Override
    public boolean delete(int questionId) {
        return judgeDao.delete(questionId) > 0;
    }

    @Override
    public boolean update(Judge judge) {
        return judgeDao.update(judge) > 0;
    }

    @Override
    public Judge getJudge(int questionId) {
        return judgeDao.getJudge(questionId);
    }

    @Override
    public List<Judge> getAllJudge(String subject) {
        return judgeDao.getAllJudge(subject);
    }

}
