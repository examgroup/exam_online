package com.qf.exam.dao;

import com.qf.exam.pojo.Paper_manage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by yzx on 2020-08-18.
 */
@Mapper
public interface IPaperManageDao {
    List<Paper_manage> getAllPaperManage();
    Boolean save(Paper_manage paper_manage);
    Boolean delete(int paperId);
    Boolean update(Paper_manage paper_manage);
}
