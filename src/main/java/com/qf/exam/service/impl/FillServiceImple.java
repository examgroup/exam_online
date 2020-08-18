package com.qf.exam.service.impl;

import com.qf.exam.dao.FillDao;
import com.qf.exam.pojo.Fill;
import com.qf.exam.service.FillService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FillServiceImple implements FillService {

    @Resource
    private FillDao fillDao;
    @Override
    public List<Fill> getAll() {
        return fillDao.getAll();
    }

    @Override
    public Fill getFillByID(int questionId) {
        return fillDao.getFillByID(questionId);
    }

    @Override
    public boolean save(Fill fill) {
        return fillDao.save(fill)>0;
    }

    @Override
    public boolean delete(int questionId) {
        return fillDao.delete(questionId)>0;
    }

    @Override
    public boolean update(Fill fill) {
        return fillDao.update(fill)>0;
    }
}
