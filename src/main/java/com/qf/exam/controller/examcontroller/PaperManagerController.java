package com.qf.exam.controller.examcontroller;

import com.qf.exam.pojo.Paper_manage;
import com.qf.exam.service.IPaperManageService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class PaperManagerController {
    @Resource
    private IPaperManageService pms;

    @GetMapping("/getAllPaperManage")
    public List<Paper_manage> getAllPaperManager() {
        return pms.getAllPaperManage();
    }

    @PostMapping("/savePaperManage")
    public String save(@RequestBody Paper_manage paper_manage) {
        System.out.println(paper_manage.getPaperId());
        System.out.println(paper_manage);
        boolean save = pms.save(paper_manage);
        if (save) {
            return "1";
        } else {
            return "0";
        }
    }

    @GetMapping("/deletePaperManage/{paperId}")
    public String delete(@PathVariable("paperId") int paperId) {
        boolean delete = pms.delete(paperId);
        if (delete) {
            return "1";
        } else {
            return "0";
        }
    }

    @PostMapping("/updatePaperManage")
    public String update(@RequestBody Paper_manage paper_manage) {
        System.out.println(paper_manage.toString());
        boolean update = pms.update(paper_manage);
        if (update) {
            return "1";
        } else {
            return "0";
        }
    }
}