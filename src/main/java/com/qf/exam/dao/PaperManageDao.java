package com.qf.exam.dao;

import com.qf.exam.pojo.PaperManage;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaperManageDao {

    PaperManage getQuestionId(int paperId);
}
