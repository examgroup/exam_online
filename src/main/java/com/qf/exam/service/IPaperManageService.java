package com.qf.exam.service;

import com.qf.exam.pojo.Paper_manage;

import java.util.List;

/**
 * Created by yzx on 2020-08-19.
 */
public interface IPaperManageService {

    List<Paper_manage> getAllPaperManage();
    Boolean save(Paper_manage paper_manage);
    Boolean delete(int paperId);
    Boolean update(Paper_manage paper_manage);
}
