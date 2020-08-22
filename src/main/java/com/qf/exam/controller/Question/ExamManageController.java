package com.qf.exam.controller.Question;

import com.qf.exam.dao.ExamManageDao;
import com.qf.exam.pojo.*;
import com.qf.exam.service.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ExamManageController {
    @Resource
    private ExamManageService es;
    @Resource
    private MultiService ms;
    @Resource
    private JudgeService js;
    @Resource
    private FillService fs;
    @Resource
    private PaperManageService pms;

    @GetMapping("/getExamManage")
    public List<ExamManage> getExamManage(){

        List<ExamManage> am = es.getAllExamManage();
        return am;
    }
    @GetMapping("/getExamBank/{examCode}")
        public Map<String,List<?>> getExamBank(@PathVariable("examCode") int examCode){

        Map<String,List<?>> map = new HashMap<>();

        ExamManage examManage = es.getExamManage(examCode);

        int paperId = examManage.getPaperId();

        PaperManage paperManage = pms.getQuestionId(paperId);
        int questionId = paperManage.getQuestionId();
        Multi multi = ms.getMulti(questionId);
        Judge judge = js.getJudge(questionId);
        Fill fill = fs.getFill(questionId);

        List<Multi> allMulti = ms.getAllMulti(multi.getSubject());
        List<Judge> allJudge = js.getAllJudge(judge.getSubject());
        List<Fill> allFill = fs.getAllFill(fill.getSubject());

        map.put("first",allFill);
        map.put("second",allJudge);
        map.put("three",allMulti);

        return map;

    }
}
