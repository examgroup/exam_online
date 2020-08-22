package com.qf.exam.service.impl;

import com.qf.exam.dao.MultiDao;
import com.qf.exam.pojo.Judge;
import com.qf.exam.pojo.Multi;
import com.qf.exam.service.MultiService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class MultiServiceImple implements MultiService {
    @Resource
    private MultiDao multiDao;
    @Override
    public List<Multi> getAll() {
        return multiDao.getAll();
    }

    @Override
    public Multi getMultiByID(int questionId) {
        return multiDao.getMultiByID(questionId);
    }

    @Override
    public boolean save(Multi multi) {
        return multiDao.save(multi)>0;
    }

    @Override
    public boolean delete(int questionId) {
        return multiDao.delete(questionId)>0;
    }

    @Override
    public boolean update(Multi multi) {
        return multiDao.update(multi)>0;
    }

    @Override
    public Multi getMulti(int questionId) {
        return multiDao.getMulti(questionId);
    }

//    @Override
//    public Multi getMulti(int questionId) {
//        return multiDao.getMulti(questionId);
//    }

    @Override
    public List<Multi> getAllMulti(String subject) {
        return multiDao.getAllMulti(subject);
    }


}
