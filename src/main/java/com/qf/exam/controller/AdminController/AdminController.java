package com.qf.exam.controller.AdminController;

import com.qf.exam.pojo.Admin;
import com.qf.exam.service.IAdminService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class AdminController {

    @Resource
    private IAdminService us;

    @GetMapping("/AllAdmins")
    public List<Admin> getAllAdmins(){

        List<Admin> all = us.getAll();
        return all;
    }

    @PostMapping("/saveAdmin")
    public Integer saveAdmin(@RequestBody Admin admin){

        int i = us.saveAdmin(admin);

        if(i == 0){
            return 0;
        }else{
            return 1;
        }


    }

    @GetMapping("/deleteAdminById/{adminId}")
    public Integer deleteAdminById(@PathVariable("adminId") int adminId){

        int i = us.deleteAdmin(adminId);

        if(i == 0){
            return 0;
        }

        return 1;
    }
    @GetMapping("/getAdminById/{adminId}")
    public Admin getAdminById(@PathVariable("adminId") int adminId){

        Admin admin = us.getAdminById(adminId);

        if(admin == null ){
            return null;
        }
        return admin;
    }

    @PostMapping("/updateAdmin")
    public int updateAdmin(@RequestBody Admin admin){

        int i = us.updateAdminById(admin);

        if(i == 0){
            return 0;
        }
        return 1;

    }
    @PostMapping("/login")
    public Integer login(@RequestBody Admin ad){
        String adminName = ad.getAdminName();
        String pwd = ad.getPwd();
        Admin admin =  us.login(adminName,pwd);

        if(admin != null ){
            return 1;
        }
        return 0;
    }
}
