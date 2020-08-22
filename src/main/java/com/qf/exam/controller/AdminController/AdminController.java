package com.qf.exam.controller.AdminController;

import com.qf.exam.dto.RPermission;
import com.qf.exam.pojo.Admin;
import com.qf.exam.pojo.exam.dao.req.AdminReq;
import com.qf.exam.service.IAdminService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class AdminController {

    @Autowired
    private RedisTemplate redisTemplate;

    @Resource
    private IAdminService us;

    @GetMapping("/AllAdmins")
    public List<Admin> getAllAdmins(){

        List<Admin> all = us.getAll();
        System.out.println(all);
        return all;
    }

    @PostMapping("/saveAdmin")
    public Integer saveAdmin(@RequestBody Admin admin){

        String email = admin.getEmail();
        System.out.println(admin);
        String o = (String) redisTemplate.opsForValue().get(email);
        String pwd = admin.getPwd();
        String pwdc = new Md5Hash(pwd,"shirojava",3).toString();
        admin.setPwd(pwdc);
        int i = us.saveAdmin(admin);
        if(i == 0 || o == null || !o.equals(admin.getCode())){
            return 0;
        }
        return 1;

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
        String pwd = admin.getPwd();
        String pwdc = new Md5Hash(pwd,"shirojava",3).toString();
        admin.setPwd(pwdc);
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

        String pwdc = new Md5Hash(pwd,"shirojava",3).toString();

        Subject subject = SecurityUtils.getSubject();

        UsernamePasswordToken token = new UsernamePasswordToken(adminName,pwdc);

        try{

            subject.login(token);
            System.out.println("hello");
            return 1;

        }catch (AuthenticationException e){
            e.printStackTrace();
        }
        return 0;
    }

    @GetMapping("/getAllRP")
    public List<RPermission> getAllRP(){

        List<RPermission> RP = us.getAllRP();

        return RP;

    }

    @PostMapping("/registry")
    public Integer registry(@RequestBody AdminReq adminReq){

        String email = adminReq.getEmail();
        System.out.println(adminReq);
        String o = (String) redisTemplate.opsForValue().get(email);
        System.out.println(o);
        if(o == null || !o.equals(adminReq.getCode())){
            return 0;
        }

        return 1;
    }
}
