package com.qf.exam.controller.examcontroller;

import com.qf.exam.pojo.Score;
import com.qf.exam.service.impl.ScoreServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yzx on 2020-08-19.
 */

@RestController
public class ScorerController {
    @Resource
    private ScoreServiceImpl ss;

    @GetMapping("/getAllScore")
    public List<Score> getAllScore() {
        return ss.getAllScore();
    }

    @GetMapping("saveScore")
    public String save(@RequestBody Score score) {
        boolean save = ss.save(score);
        if (save) {
            return "1";
        } else {
            return "0";
        }
    }

    @GetMapping("/deleteScore/{scoreId}")
    public String delete(@PathVariable("scoreId") int scoreId) {
        boolean delete = ss.delete(scoreId);
        if (delete) {
            return "1";
        } else {
            return "0";
        }
    }

    @PostMapping("updateScore")
    public String update(@RequestBody Score score) {
        boolean update = ss.update(score);
        if (update) {
            return "1";
        } else {
            return "0";
        }
    }

}

