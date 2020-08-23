package com.qf.exam.service.impl;

import com.qf.exam.dao.IPaperManageDao;
import com.qf.exam.pojo.Paper_manage;
import com.qf.exam.service.IPaperManageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yzx on 2020-08-19.
 */
@Service
public class PaperManageServiceImpl implements IPaperManageService {
    @Resource
    private IPaperManageDao pmdao;


    @Override
    public List<Paper_manage> getAllPaperManage() {
        return pmdao.getAllPaperManage();
    }

    @Override
    public Boolean save(Paper_manage paper_manage) {
        return pmdao.save(paper_manage);
    }

    @Override
    public Boolean delete(int paperId) {
        return pmdao.delete(paperId);
    }

    @Override
    public Boolean update(Paper_manage paper_manage) {
        System.out.println("-------------------");
        System.out.println(paper_manage.toString());
        return pmdao.update(paper_manage);
    }

}
