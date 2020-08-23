package com.qf.exam.controller.examcontroller;

import com.qf.exam.pojo.Exam_manage;
import com.qf.exam.service.IExamManageService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yzx on 2020-08-18.
 */
@RestController
public class ExamManageController {
    @Resource
    private IExamManageService ems;

    @GetMapping("getAllExamManage")
    public List<Exam_manage> getAllExamManage(){
        return ems.getAllExamManage();
    }

    @GetMapping("saveExamManage")
    public String save(@RequestBody Exam_manage exam_manage){
        boolean save = ems.save(exam_manage);
        if(save){
            return "1";
        }else{
            return "0";
        }
    }

    @GetMapping("/deleteExamManage/{examCode}")
    public String delete(@PathVariable("examCode") int examCode){
        boolean delete = ems.delete(examCode);
        if(delete){
            return "1";
        }else {
            return "0";
        }
    }

    @PostMapping("updateExamManage")
    public String update(@RequestBody Exam_manage exam_manage){
        boolean update = ems.update(exam_manage);
        if(update){
            return "1";
        }else{
            return "0";
        }
    }


}
