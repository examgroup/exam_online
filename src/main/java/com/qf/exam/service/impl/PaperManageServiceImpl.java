package com.qf.exam.service.impl;

import com.qf.exam.dao.PaperManageDao;
import com.qf.exam.pojo.PaperManage;
import com.qf.exam.service.PaperManageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class PaperManageServiceImpl implements PaperManageService {
    @Resource
    private PaperManageDao pmd;
    @Override
    public PaperManage getQuestionId(int paperId) {
        return pmd.getQuestionId(paperId);
    }
}
