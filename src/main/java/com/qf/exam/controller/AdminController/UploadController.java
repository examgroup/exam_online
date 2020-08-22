package com.qf.exam.controller.AdminController;

import com.qf.exam.utils.QiniuUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class UploadController {

    @Autowired
    QiniuUtils qiniuUtils;

    @PostMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile multipartFile) {

        String originalFilename = multipartFile.getOriginalFilename();
        System.out.println("======1=======>"+originalFilename);
        System.out.println("======2=======>"+qiniuUtils.upload(multipartFile));
        return qiniuUtils.upload(multipartFile);
    }
}