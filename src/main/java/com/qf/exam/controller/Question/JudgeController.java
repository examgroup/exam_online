package com.qf.exam.controller.Question;

import com.qf.exam.pojo.Judge;
import com.qf.exam.service.JudgeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class JudgeController {
    @Resource
    private JudgeService judgeService;

    @GetMapping("Judge")
    List<Judge> getAll(){
      return judgeService.getAll();
    }

    @GetMapping("/JudgeById/{questionId}")
    //http://localhost:8080/fillById
    //填空题按试题序号查询
    public Judge getFillByID(@PathVariable("questionId" )int questionId){

        return judgeService.getJudgeByID(questionId);
    }

    @PostMapping("saveJudge")
    public String save(@RequestBody Judge judge){
//        Judge judge = new Judge(0,"历史","苍井空是宅男女神","正确","童颜巨乳",10,"5","第一章");
        boolean save = judgeService.save(judge);
        if(save){
            return "success";
        }else{
            return "fail";
        }
    }

    @GetMapping("/deleteJudge/{questionId}")
    public String delete(@PathVariable("questionId") int questionId){
        boolean delete = judgeService.delete(questionId);
        if(delete){
            return "success";
        }else {
            return "fail";
        }
    }

    @PostMapping ("updateJudge")
    public String update(@RequestBody Judge judge){
        boolean update = judgeService.update(judge);
        if(update){
            return "success";
        }else{
            return "fail";
        }
    }


}
