package com.qf.exam.controller.Question;

import com.qf.exam.pojo.Multi;
import com.qf.exam.service.MultiService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class MultiController {
    @Resource
    private MultiService multiService;

    @GetMapping("Multi")
    List<Multi> getAll(){
      return multiService.getAll();
    }

    @GetMapping("/MultiByID/{questionId}")
    Multi getMultiByID(@PathVariable("questionId") int questionId){
      return   multiService.getMultiByID(questionId);
    }

    @GetMapping("saveMulti")
    String save(@RequestBody Multi multi){
        boolean save = multiService.save(multi);
        if(save){
            return "success";
        }else {
            return "fail";
        }
    }
    @GetMapping("/deleteMulti/{questionId}")
    String delete(@PathVariable("questionId") int questionId){
        boolean delete = multiService.delete(questionId);
        if(delete){
            return "success";
        }else {
            return "fail";
        }
    }

    @PostMapping("updateMulti")
    String update(@RequestBody  Multi multi){
        boolean update = multiService.update(multi);
        if(update){
            return "success";
        }else {
            return "fail";
        }
    }
}
