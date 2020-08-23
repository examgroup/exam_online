package com.qf.exam.service.impl;

import com.qf.exam.dao.IScoreDao;
import com.qf.exam.pojo.Score;
import com.qf.exam.service.IScoreService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yzx on 2020-08-19.
 */
@Service
public class ScoreServiceImpl implements IScoreService {
    @Resource
    private IScoreDao sdao;


    @Override
    public List<Score> getAllScore() {
        return sdao.getAllScore();
    }

    @Override
    public Boolean save(Score score) {
        return sdao.save(score);
    }

    @Override
    public Boolean delete(int scoreId) {
        return sdao.delete(scoreId);
    }

    @Override
    public Boolean update(Score score) {
        return sdao.update(score);
    }

}
