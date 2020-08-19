package com.qf.exam.controller.Question;

import com.qf.exam.pojo.Fill;
import com.qf.exam.service.FillService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class FillController {
    @Resource
    private FillService fillService;

    @GetMapping("Fill")
    //http://localhost:8080/fill
    //填空题所有题库查询
    public List<Fill> getAll(){
        List<Fill> fills = fillService.getAll();
        return fills;
    }

    @GetMapping("/FillById/{questionId}")
    //http://localhost:8080/fillById
    //填空题按试题序号查询
    public Fill getFillByID(@PathVariable("questionId" )int questionId){
        Fill fillByID = fillService.getFillByID(questionId);
        if(fillByID !=null){
            return  fillByID;
        }
        return  null;
    }

    @PostMapping("saveFill")
    public String save(@RequestBody Fill fill, HttpServletRequest request){
        boolean save = fillService.save(fill);
        if(save){
            return "success";
        }else{
            return "fail";
        }
    }

    @GetMapping("/deleteFill/{questionId}")
    public String delete(@PathVariable("questionId") int questionId){
        boolean delete = fillService.delete(questionId);
        if(delete){
            return "success";
        }else {
            return "fail";
        }
    }

    @PostMapping("updateFill")
    public String update(@RequestBody Fill fill){
        //Fill fill = new Fill(1,"民族风情","当今坐观日本，称霸“演艺圈”的女演员是？","深田咏美","2018最佳女演员",10,"5","第一章");
        boolean update = fillService.update(fill);
        if(update){
            return "success";
        }else{
            return "fail";
        }
    }
}
